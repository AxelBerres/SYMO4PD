package de.symo.application.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class ReferenceObjectHandler {
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION)
	                      	@Optional Object selection) {
	   if (selection!=null && selection instanceof EObject)
	  	return true;
	   return false;
	}
	
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION)
  	@Optional Object selection) {
		EObject selectedEObject=(EObject) selection;
		
	}

}
