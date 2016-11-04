package de.symo.application.e4.parts.projectbrowser.commands;

import java.io.File;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
	
public class DeleteProjectHandler {

	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection, Shell shell) {
		
		if ((selection instanceof File) == false) {
			return;
		}

		System.out.println((this.getClass().getSimpleName() + " called"));		
		boolean result = MessageDialog.openConfirm(shell, "Confirm", "Please confirm");

		if (result) {
			File file = (File) selection;			
			if (file.isDirectory()) {
				file.delete();
			}
		}
	}	
}
