package de.symo.model.editor.registry.ui;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

public class NewRegistryDialog extends TitleAreaDialog {

	private Composite container;

	private Text 	txtFirstName;

	private String 	registryName;
	private boolean defaultStructure = false;

	public NewRegistryDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.SYSTEM_MODAL);
		setHelpAvailable(false);
	}

	@Override
	public void create() {
		super.create();
		setTitle("New Registry");
		setMessage("Enter a name for a project", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Enter a registry name.");
		setTitleImage(ResourceManager.getPluginImage("de.symo.application", "icons/symo4pd_a_icon.png"));
		Composite area = (Composite) super.createDialogArea(parent);
		container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout gl_container_1 = new GridLayout(2, false);
		container.setLayout(gl_container_1);

		createProjectName(container);

		return area;
	}

	private void createProjectName(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Registry Name");

		GridData dataFirstName = new GridData();
		dataFirstName.grabExcessHorizontalSpace = true;
		dataFirstName.horizontalAlignment = GridData.FILL;

		txtFirstName = new Text(container, SWT.BORDER);
		txtFirstName.setLayoutData(dataFirstName);
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	private void saveInput() {
		registryName = txtFirstName.getText();
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getRegistryName() {
		return registryName;
	}

	public boolean getDefaultStructure() {
		return defaultStructure;
	}
}