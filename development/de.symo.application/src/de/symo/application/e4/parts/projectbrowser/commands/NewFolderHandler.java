package de.symo.application.e4.parts.projectbrowser.commands;

import java.io.File;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.NewFolderDialog;

public class NewFolderHandler {

	@Inject
	private EHandlerService handlerService;
	
	@Execute
	public void execute(@Optional @Named("selection") IStructuredSelection selection, Shell shell) {
		
		System.out.println("create a new folder");
		
		
//		IStructuredSelection first = (IStructuredSelection) selection.getFirstElement();		
//		if ((first instanceof File) == true) {			
//			File file = (File) first;			
//			NewFolderDialog dialog =  new NewFolderDialog(shell, null);
//			dialog.create();
//			if (dialog.open() == Window.OK) {
//
//			}			
//		}
	}

	@CanExecute
	public boolean canExecute() {		
		return true;
	}		
}
