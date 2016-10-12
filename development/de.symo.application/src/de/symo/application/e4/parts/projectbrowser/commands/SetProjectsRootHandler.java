
package de.symo.application.e4.parts.projectbrowser.commands;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import de.symo.application.e4.parts.ProjectBrowser;

public class SetProjectsRootHandler {
	
	@Execute
	public void execute() {	
		Shell shell = new Shell(SWT.SHELL_TRIM);		
		DirectoryDialog dialog = new DirectoryDialog(shell);
        String path = dialog.open();
		
		ProjectBrowser.setProjectsRoot(path);
	}

	@CanExecute
	public boolean canExecute() {		
		return true;
	}		
}