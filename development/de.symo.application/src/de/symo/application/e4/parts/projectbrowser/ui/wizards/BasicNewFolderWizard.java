package de.symo.application.e4.parts.projectbrowser.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

public class BasicNewFolderWizard extends Wizard {

	private NewFolderWizardPage newFolderPage; 
	
	public BasicNewFolderWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

    @Override
    public String getWindowTitle() {
            return "Create a new folder";
    }
	
    @Override
    public void addPages() {    	
    	newFolderPage = new NewFolderWizardPage();
    	addPage(newFolderPage);    	
    }

	@Override
	public boolean performFinish() {		
		return true;
	}
}
