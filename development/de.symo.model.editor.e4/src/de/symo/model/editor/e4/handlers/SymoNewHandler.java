package de.symo.model.editor.e4.handlers;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

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

import de.symo.model.editor.e4.ui.NewSymoFileDialog;
import de.symo.model.symo.ProjectRepository;
import de.symo.model.symo.SymoFactory;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;
import de.symo.model.service.ISymoModelService;

/**
 * 
 * @author Axel Berres, Michael Shamiyeh
 * 
 */
public class SymoNewHandler {
	@Inject
	ISymoModelService symoModelService;
	
	public SymoNewHandler() {
	}

	@Execute
	public void execute() {
		// create the new project Dialog
		Shell shell = new Shell(SWT.SHELL_TRIM);
		NewSymoFileDialog dialog =  new NewSymoFileDialog(shell);
		dialog.create();
	    if (dialog.open() == Window.CANCEL) {
	    	return;
	    }

		// create empty or project with default directory structure
		String symoName = dialog.getFileName();			
		createSymo(symoName);

		// ### FIXME HACK
		ProjectBrowserPart.refresh();
	}

	private void createSymo(final String symoName) {
		
		// create symo file and set repository name
		String prjRepo = symoName + ".symo";		
		ProjectRepository prj = SymoFactory.eINSTANCE.createProjectRepository();
		prj.setName(symoName);

		// ### FIXME HACK to get the correct folder
		File folder = ProjectBrowserPart.getSelection();
		if (folder == null) {
			Shell shell = new Shell(SWT.SHELL_TRIM);
			Status status = new Status(IStatus.ERROR, "de.symo.model.editor.e4.ui.symo.handlers.SymoNewHandler", "NullPointerException");
			ErrorDialog.openError(shell, "Create Symo file failed", "Please select a folder",status);
			return;
		}
		
		// get the correct path
		File path = new File (folder, prjRepo);
		URI uri = URI.createFileURI(path.getAbsolutePath());
		
		// create the resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(prj);
		
		// save the registry
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		symoModelService.reportModelCreatedEvent(prj, folder.toString(), prjRepo);
	}
}
