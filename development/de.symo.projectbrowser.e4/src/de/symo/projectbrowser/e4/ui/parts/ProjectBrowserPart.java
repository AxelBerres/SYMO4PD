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

public class ProjectBrowserPart {

	private static final String ICONS_FOLDER = "icons/16_Folder.png";

	public static final String PROJECTBROWSER_ID = "de.symo.projectbrowser.e4.parts.projectbrowser";

	private static final String POPUPMENU = "de.symo.projectbrowser.e4.popupmenu.project";

	private static File projectRoot;
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
			public void widgetSelected(SelectionEvent e) {
				TreeItem item = (TreeItem) e.item;
				if (item.getItemCount() > 0) {
					item.setExpanded(!item.getExpanded());
					viewer.refresh();
				}
			}
		});

		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
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
						
//						OpenContext ctx = new OpenContext();
//						ctx.open(file);
						delegateSlectionfoOpening(file);					
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

	public static void refresh() {
		viewer.refresh();
	}

	public static void setProjectsRoot(String fileName) {
		
		// delegate storage of project root
		ProjectPreference.setProjectBase(fileName);
		projectRoot = ProjectPreference.getProjectBase();
		
		// set new project root and refresh the browser
		viewer.setInput(projectRoot);
		viewer.refresh();		
	}

	private ImageDescriptor createImageDescriptor() {
		Bundle bundle = FrameworkUtil.getBundle(ViewLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path(ICONS_FOLDER), null);
		return ImageDescriptor.createFromURL(url);
	}
	
	private void delegateSlectionfoOpening(final File file) {

		// get part label
		String label = getLabel(file.getName());
		
		// Add to editor part stack
		MPartStack editorStack = (MPartStack) modelService.find("de.symo.application.partstack.projects.editors", application);

		MPart part = null;
		for (MStackElement element : editorStack.getChildren()) {
			if (element instanceof MPart) {
				part = (MPart) element; 
				if (part.getLabel().equals(label) == true) {
					break;
				}
				part = null;
			}
		}
		
		if (part != null) {
			editorStack.setSelectedElement(part);
			return;
		}

		// Create the part and set the transient input data		
		part = modelService.createModelElement(MPart.class);
		part.setElementId("de.symo.model.editor.registry.tree" + 0);
		part.setContributionURI("bundleclass://de.symo.model.editor.registry/" + "de.symo.model.editor.registry.ui.parts.RegistryEditorPart");
		part.setCloseable(true);
		part.setLabel(label);
		part.getTags().add(EPartService.REMOVE_ON_HIDE_TAG);
		part.getTransientData().put("data", file);

		// Add to editor part stack
		editorStack.getChildren().add(part);

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
}