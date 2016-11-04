package de.symo.application.e4.parts.projectbrowser.commands;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenDefaultEditorHandler {

	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection, Shell shell) {

		System.out.println("open a file in the default editor");

		if ((selection instanceof File) == false) {
			return;
		}

		try {
			File file = (File) selection;
			if (file.isFile()) {
				Desktop.getDesktop().open(file);
			}
		} catch (IOException e) {
		}		
	}

	@CanExecute
	public boolean canExecute() {		
		return true;
	}		
}
