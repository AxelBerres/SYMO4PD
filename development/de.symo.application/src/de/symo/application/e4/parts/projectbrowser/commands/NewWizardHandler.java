package de.symo.application.e4.parts.projectbrowser.commands;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import de.symo.application.e4.parts.projectbrowser.ui.wizards.BasicNewFileWizard;

public class NewWizardHandler {
	
	@Execute
	public void execute() {	 
	 Shell shell = new Shell(SWT.SHELL_TRIM);
//	 IWorkbenchWizard wizard = new BasicNewFolderResourceWizard();	
//	 wizard.init(null, null);
	 WizardDialog dialog = new WizardDialog(shell, new BasicNewFileWizard());
	 dialog.open();
	}
}
