package de.symo.application.parts;

import java.io.File;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.ui.di.Focus;
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

import de.symo.application.e4.parts.ProjectComperator;
import de.symo.application.e4.parts.ViewContentProvider;
import de.symo.application.e4.parts.ViewLabelProvider;

public class FileBrowserPart {

	private TreeViewer viewer;

	@PostConstruct
	public void createControls(Composite parent) {

		File projectRoot = new File("D:\\tmp\\SYMO4PD\\projects\\");

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
				viewer.setExpandedState(selectedNode,
						!viewer.getExpandedState(selectedNode));
			}
		});
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
}