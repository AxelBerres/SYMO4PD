
package de.symo.application.e4.parts.projectbrowser.commands;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Strings;

import de.symo.application.e4.parts.ProjectBrowser;

public class SetProjectsRootHandler {
	
	@Execute
	public void execute() {	
		
		// open dialog
		Shell shell = new Shell(SWT.SHELL_TRIM);		
		DirectoryDialog dialog = new DirectoryDialog(shell);
		dialog.setFilterPath("d:\\tmp\\SYMO4PD\\");
        String path = dialog.open();

        // check given path
        if (Strings.isNullOrEmpty(path) == false) {
    		ProjectBrowser.setProjectsRoot(path);
        }        
	}

	@CanExecute
	public boolean canExecute() {		
		return true;
	}		
}