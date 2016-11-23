package de.symo.model.editor.e4.handlers;

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

import de.symo.model.editor.e4.ui.NewUsecaseDialog;
import de.symo.model.usecase.UseCase;
import de.symo.model.usecase.UsecaseFactory;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;

public class UsecaseNewHandler {

	@Execute
	public void execute() {

		// create the new project Dialog
		Shell shell = new Shell(SWT.SHELL_TRIM);
		NewUsecaseDialog dialog =  new NewUsecaseDialog(shell);
		dialog.create();
	    if (dialog.open() == Window.CANCEL) {
	    	return;
	    }

		// create empty or project with default directory structure
		String name = dialog.getName();			
		createUsecase(name);

		// ### FIXME HACK
		ProjectBrowserPart.refresh();
	}

	private void createUsecase(final String name) {

		String usecaseName = name + ".usecase";
		UseCase usecase = UsecaseFactory.eINSTANCE.createUseCase();
		usecase.setName(usecaseName);

		// ### FIXME HACK
		File folder = ProjectBrowserPart.getSelection();
		if (folder == null) {
			Shell shell = new Shell(SWT.SHELL_TRIM);
			Status status = new Status(IStatus.ERROR, "de.symo.model.editor.registry.handlers.RegistryNewHandler", "NullPointerException");
			ErrorDialog.openError(shell, "Create Registry failed", "Please select a folder",status);
			return;
		}
		
		// get the correct path
		File path = new File (folder, usecaseName);
		URI uri = URI.createFileURI(path.getAbsolutePath());
		
		// create the resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(usecase);
		
		// save the registry
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
