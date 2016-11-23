package de.symo.model.editor.e4.ui;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

public class NewSymoFileDialog extends TitleAreaDialog {

	private static String TITLE = "New Symo";
	private static String MESSAGE = "Enter a symo name.";

	private Text 	txtFirstName;
	private String 	name;

	public NewSymoFileDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.SYSTEM_MODAL);
		setHelpAvailable(false);
	}

	@Override
	public void create() {
		super.create();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		setTitle(TITLE);
		setMessage(MESSAGE);
		setTitleImage(getTitleImage());
		
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout gl_container_1 = new GridLayout(2, false);
		container.setLayout(gl_container_1);

		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Name");

		GridData dataFirstName = new GridData();
		dataFirstName.grabExcessHorizontalSpace = true;
		dataFirstName.horizontalAlignment = GridData.FILL;

		txtFirstName = new Text(container, SWT.BORDER);
		txtFirstName.setLayoutData(dataFirstName);

		return area;
	}

	private Image getTitleImage() {
		return ResourceManager.getPluginImage("de.symo.application", "icons/symo4pd_a_icon.png");
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	private void getName() {
		name = txtFirstName.getText();
	}

	@Override
	protected void okPressed() {
		getName();
		super.okPressed();
	}

	public String getFileName() {
		return name;
	}	
}
