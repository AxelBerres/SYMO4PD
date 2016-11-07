package de.symo.projectbrowser.e4.ui.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Strings;

import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;


public class ProjectSetRootHandler {

	final String defaultPath = "d:\\tmp\\SYMO4PD\\";

	@Execute
	public void execute() {	

		// open dialog
		Shell shell = new Shell(SWT.SHELL_TRIM);		
		DirectoryDialog dialog = new DirectoryDialog(shell);
		dialog.setFilterPath(defaultPath);
		String path = dialog.open();

		// check given path
		if (Strings.isNullOrEmpty(path) == true) {
			return;
		}

		// set new project root
		ProjectBrowserPart.setProjectsRoot(path);

	}


	@CanExecute
	public boolean canExecute() {		
		return true;
	}
}
