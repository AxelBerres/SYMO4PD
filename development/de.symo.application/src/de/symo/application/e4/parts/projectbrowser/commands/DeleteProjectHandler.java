package de.symo.application.e4.parts.projectbrowser.commands;

import javax.inject.Named;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

public class DeleteProjectHandler {

	public void execute(@Named("selection") IStructuredSelection selection, Shell shell) {
		
//		StructuredSelection sel = (StructuredSelection) selection.getFirstElement();

		System.out.println((this.getClass().getSimpleName() + " called"));
		
		boolean result = MessageDialog.openConfirm(shell, "Confirm", "Please confirm");

		if (result){
		 // OK Button selected do something
		} else {
		 // Cancel Button selected do something
		}
	}	
}
