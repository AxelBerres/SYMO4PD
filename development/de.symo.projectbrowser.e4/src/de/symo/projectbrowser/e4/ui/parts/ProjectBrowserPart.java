package de.symo.projectbrowser.e4.ui.parts;

import java.io.File;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * 
 * @author Axel Berres, Michael Shamiyeh
 *
 */
public class ProjectBrowserPart {

	private static final String ICONS_FOLDER = "icons/16_Folder.png";

	public static final String PROJECTBROWSER_ID = "de.symo.projectbrowser.e4.parts.projectbrowser";

	private static final String POPUPMENU = "de.symo.projectbrowser.e4.popupmenu.project";

	private static File projectRoot;
	private static File selectedFolder;
	
	private static TreeViewer viewer;

	@Inject
	private ESelectionService selectionService;
	
	@Inject
	private EPartService partService;
	
	@Inject
	private EModelService modelService;
	
	@Inject
	private MApplication application;
	
	@PostConstruct
	public void createControls(Composite parent, IEclipseContext ctx, EMenuService menuService) {
		projectRoot = ProjectPreference.getProjectBase();

		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider(createImageDescriptor()));
		viewer.setInput(projectRoot);
		viewer.setComparator(new ProjectComperator());

		Tree tree = (Tree) viewer.getControl();

		tree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				
				// expand selection
				TreeItem item = (TreeItem) event.item;
				if (item.getItemCount() > 0) {
					item.setExpanded(!item.getExpanded());
					viewer.refresh();
				}

				// store selected folders
				IStructuredSelection thisSelection = (IStructuredSelection) viewer.getSelection();
				Object selectedNode = thisSelection.getFirstElement();
				
				if (selectedNode instanceof File) {
					File selection = (File) selectedNode;
					if (selection.isDirectory()) {
						selectedFolder = selection;
					}
				}
			}
		});

		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					TreeViewer viewer = (TreeViewer) event.getViewer();
					IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
					Object selectedNode = thisSelection.getFirstElement();
					
					if (selectedNode instanceof File) {
						File file = (File) selectedNode;
						if(file.isDirectory() == true) {
							viewer.setExpandedState(selectedNode, !viewer.getExpandedState(selectedNode));
						} else {
							// ToDo open registered editor
							System.out.println("Try to open " + file.getName());
							
//							OpenContext ctx = new OpenContext();
//							ctx.open(file);
							delegateSelectionforOpening(file);					
						}
					}
				}
			}
		});

		// add context menu
		menuService.registerContextMenu(tree,POPUPMENU);		

		// attach a selection listener to our JFace viewer
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				// set the selection to the service
				selectionService.setSelection(
						selection.size() == 1 ? selection.getFirstElement() : selection.toArray());
			}
		});
	}

	@Focus
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public static File getProjectRoot() {
		return projectRoot;
	}

	public static void setProjectsRoot(String fileName) {
		
		// delegate storage of project root
		ProjectPreference.setProjectBase(fileName);
		projectRoot = ProjectPreference.getProjectBase();
		
		// set new project root and refresh the browser
		viewer.setInput(projectRoot);
		viewer.refresh();		
	}

	public static File getSelection() {
		return selectedFolder;
	}
	
	public static void refresh() {
		viewer.refresh();
	}

	private ImageDescriptor createImageDescriptor() {
		Bundle bundle = FrameworkUtil.getBundle(ViewLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path(ICONS_FOLDER), null);
		return ImageDescriptor.createFromURL(url);
	}
	
	private void delegateSelectionforOpening(final File file) {

		// get part label
		String label = getLabel(file.getName());
		
		// Add to editor part stack
		MPartStack editorStack = (MPartStack)modelService.find("de.symo.application.partstack.projects.editors", application);

		// if the file is already open don't open a new editor
		MPart part = null;
		for (MStackElement element : editorStack.getChildren()) {
			if (element instanceof MPart) {
				part = (MPart) element;
				File partFile = (File) part.getTransientData().get("data");
				if ((partFile != null) &&
				    (partFile.getAbsolutePath().equals(file.getAbsolutePath()) == true)) {
					break;
				}
				part = null;
			}
		}
		
		if (part != null) {
			editorStack.setSelectedElement(part);
			return;
		}

		String ext = getExtension(file.getName());
		if (ext == null) {
			// TODO add default MPart for open
			return;
		}

		// Create the part and set the transient input data
		part = getEditorPart(ext);
		part.setLabel(label);
		part.getTransientData().put("data", file);

		// Show
		partService.showPart(part, PartState.ACTIVATE);
	}

	private String getLabel(final String fileName) {

		// handle null
        if (fileName == null) {
        	return "Registry";
        }

        // Get position of last '.'.
        int pos = fileName.lastIndexOf(".");
        if (pos == -1) {
        	return fileName;
        } 

       	return fileName.substring(0, pos);
	}
	
	
	/**
	 * @param fileName
	 * @return
	 */
	private String getExtension(final String fileName) {
        // Get position of last '.'.
        int pos = fileName.lastIndexOf(".");
        if (pos == -1) {
        	return null;
        }

		String ext = fileName.substring(pos+1,fileName.length());
		return ext;
	}
	
	private MPart getEditorPart(final String extension) {		
		if (extension.equals("registry"))
			return partService.createPart("de.symo.model.editor.e4.partdescriptor.registryeditorpart");

		if (extension.equals("usecase"))
			return partService.createPart("de.symo.model.editor.e4.partdescriptor.usecaseeditor");

		if (extension.equals("symo"))
			return partService.createPart("de.symo.model.editor.e4.partdescriptor.symomodeleditor");
		
		return modelService.createModelElement(MPart.class);
	}
}