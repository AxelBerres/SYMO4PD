package de.symo.application.e4.parts.projectbrowser.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

public class BasicNewFileWizard extends Wizard {

	private NewFileWizardPage newFilePage; 
	
	public BasicNewFileWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

    @Override
    public String getWindowTitle() {
            return "Create a new folder";
    }
	
    @Override
    public void addPages() {    	
    	newFilePage = new NewFileWizardPage();
    	addPage(newFilePage);    	
    }

	@Override
	public boolean performFinish() {
		return true;
	}
}
