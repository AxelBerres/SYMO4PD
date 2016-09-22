 
package de.symo.semantics.ui.repository;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
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

public class IncludeRepositoryDialog extends TitleAreaDialog {
	private Text repositoryURLField;
	private Text usernameField;
	private Text passwordField;
	

	@Inject
	public IncludeRepositoryDialog(@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell) {
		super(parentShell);
	}
	
	@Override
    public void create() {
            super.create();
            setTitle("Clone Ontology Repository");
            setMessage("Blablub", IMessageProvider.INFORMATION);
    }

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite)super.createDialogArea(parent);
		area.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		area.setLayout(layout);

		createRepositoryURLField(area);
		createUsernameField(area);
		createPasswordField(area);

		return area;
	}

	private void createRepositoryURLField(Composite container) {
		Label l_RepoURL = new Label(container, SWT.NONE);
		l_RepoURL.setText("Repository URL:");

		GridData dataRepoURL = new GridData();
		dataRepoURL.grabExcessHorizontalSpace = true;
		dataRepoURL.horizontalAlignment = GridData.FILL;

		repositoryURLField = new Text(container, SWT.BORDER);
		repositoryURLField.setLayoutData(dataRepoURL);
	}

	private void createUsernameField(Composite container) {
		Label l_Username = new Label(container, SWT.NONE);
		l_Username.setText("Username:");

		GridData dataUsername = new GridData();
		dataUsername.grabExcessHorizontalSpace = true;
		dataUsername.horizontalAlignment = GridData.FILL;
		
		usernameField = new Text(container, SWT.BORDER);
		usernameField.setLayoutData(dataUsername);
	}
	
	private void createPasswordField(Composite container) {
		Label l_Password = new Label(container, SWT.NONE);
		l_Password.setText("Password:");

		GridData dataPassword = new GridData();
		dataPassword.grabExcessHorizontalSpace = true;
		dataPassword.horizontalAlignment = GridData.FILL;
		
		passwordField = new Text(container, SWT.PASSWORD);
		passwordField.setLayoutData(dataPassword);
	}
}