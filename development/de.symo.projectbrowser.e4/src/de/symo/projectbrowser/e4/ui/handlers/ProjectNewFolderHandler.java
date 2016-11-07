package de.symo.projectbrowser.e4.ui.handlers;

import java.io.File;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

import de.symo.projectbrowser.e4.ui.NameValidator;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;

public class ProjectNewFolderHandler {


	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection, Shell shell) {
		
		// check the selection 
		if ((selection instanceof File) == false) {
			return;
		}

		// check if selection is also a folder
		File file = (File) selection;
		if (file.isDirectory() == false) {
			return;
		}

		// open dialog
	    FolderDialog id = new FolderDialog(shell, new NameValidator());
	    id.open();
	    
	    // get new folder name and create a folder	    
	    String folderName = id.getValue();
	    File folder = new File(file, folderName);
	    folder.mkdir();

		// ### FIXME HACK
		ProjectBrowserPart.refresh();
	}

	@CanExecute
	public boolean canExecute() {		
		return true;
	}

	class FolderDialog extends InputDialog {
		
		final static String title = "Enter new folder name";
		final static String msg   = "A new sub folder will be created.";
		final static String init  = "";

		public FolderDialog(Shell parentShell, IInputValidator validator) {
			super(parentShell, title, msg, init, validator);
		}		
	}
}
