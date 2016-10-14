package de.symo.application.e4.parts.projectbrowser.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;

public class NewFileWizardPage extends WizardPage {

	private Text parentName;
	private Text fileName;

	/**
	 * Create the wizard.
	 */
	public NewFileWizardPage() {
		super("wizardPage");
		setTitle("File");
		setDescription("Create a new file.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Label lblEnterOrSelect = new Label(container, SWT.NONE);
		lblEnterOrSelect.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblEnterOrSelect.setText("Enter or select parent folder.");
		
		parentName = new Text(container, SWT.BORDER);
		parentName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		List list = new List(container, SWT.BORDER);
		GridData gd_list = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		gd_list.heightHint = 180;
		list.setLayoutData(gd_list);
		
		Label lblFileName = new Label(container, SWT.NONE);
		lblFileName.setText("File name:");
		
		fileName = new Text(container, SWT.BORDER);
		fileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	}
	
	public String getFileName() {		
		return fileName.getText();
	}
}
