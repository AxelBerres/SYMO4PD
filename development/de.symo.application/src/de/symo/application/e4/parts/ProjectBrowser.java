package de.symo.application.e4.parts;

import java.io.File;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class ProjectBrowser {

	private static final String POPUPMENU = "de.symo.application.popupmenu.0";

	private static File projectRoot;
	private static TreeViewer viewer;

	private static String projectBase = "D:\\tmp\\SYMO4PD\\projects\\";

	@PostConstruct
	public void createControls(Composite parent, IEclipseContext ctx, EMenuService menuService) {

		projectRoot = new File(projectBase);
		
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
					// update the viewer
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
				viewer.setExpandedState(selectedNode, !viewer.getExpandedState(selectedNode));
			}
		});
		
		menuService.registerContextMenu(tree,POPUPMENU);		
	}

	private ImageDescriptor createImageDescriptor() {
		Bundle bundle = FrameworkUtil.getBundle(ViewLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/folder.png"), null);
		return ImageDescriptor.createFromURL(url);
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
		projectRoot = new File(fileName);
		viewer.setInput(projectRoot);
		viewer.refresh();		
	}
}