package de.symo.model.editor.registry.handlers;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import de.symo.model.editor.registry.ui.NewRegistryDialog;
import de.symo.model.registry.Registry;
import de.symo.model.registry.RegistryFactory;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;

public class RegistryNewHandler {

	@Execute
	public void execute() {

		// create the new project Dialog
		Shell shell = new Shell(SWT.SHELL_TRIM);
		NewRegistryDialog dialog =  new NewRegistryDialog(shell);
		dialog.create();
	    if (dialog.open() == Window.CANCEL) {
	    	return;
	    }

		// create empty or project with default directory structure
		String registryName = dialog.getRegistryName();			
		createRegistry(registryName);

		// ### FIXME HACK
		ProjectBrowserPart.refresh();
	}

	private void createRegistry(final String registryName) {

		String reg = registryName + ".registry";
		Registry registry = RegistryFactory.eINSTANCE.createRegistry();
		registry.setName(registryName);

		// ### FIXME HACK
		File folder = ProjectBrowserPart.getSelection();
		if (folder == null) {
			Shell shell = new Shell(SWT.SHELL_TRIM);
			Status status = new Status(IStatus.ERROR, "de.symo.model.editor.registry.handlers.RegistryNewHandler", "NullPointerException");
			ErrorDialog.openError(shell, "Create Registry failed", "Please select a folder",status);
			return;
		}
		
		// get the correct path
		File path = new File (folder, reg);
		URI uri = URI.createFileURI(path.getAbsolutePath());
		
		// create the resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(registry);
		
		// save the registry
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
