package de.symo.application.parts;

import java.io.File;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class FileBrowserPart {
	
	private TreeViewer viewer;

	@PostConstruct
	public void createControls(Composite parent) {

		File projectRoot = new File("D:");

		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new DelegatingStyledCellLabelProvider(
				new ViewLabelProvider(createImageDescriptor())));
		viewer.setInput(projectRoot);
	}

	private ImageDescriptor createImageDescriptor() {
		Bundle bundle = FrameworkUtil.getBundle(ViewLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/folder.png"), null);

//		org.eclipse.swt.program.Program.findProgram(String extension).getImageData()		
//		javax.swing.filechooser.FileSystemView.getFileSystemView().getSystemIcon( file )
		
		return ImageDescriptor.createFromURL(url);
	}

	@Focus
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}