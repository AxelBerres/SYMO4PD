package org.eclipse.ui.e4.navigator.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.e4.navigator.ui.NewProjectDialog;

public class NewProjectHandler {

//	private String[] dirs = {"resources","exports","solutions","usecases","tradeoffs"};
	
	@Execute
	public void execute() {

		System.out.println((this.getClass().getSimpleName() + " called"));

		Shell shell = new Shell(SWT.SHELL_TRIM);

		NewProjectDialog dialog =  new NewProjectDialog(shell);
		dialog.create();

		if (dialog.open() == Window.OK) {
		
			String projectName = dialog.getProjectName();
			
			if(dialog.getDefaultStructure()) {
				createDefaultProject(projectName);
			} else {
				createEmptyProject(projectName);			
			}
		}
		
//		ProjectBrowser.refresh();		
	}

	private void createDefaultProject(final String projectName) {
		
//		File basePath = new File(ProjectBrowser.getProjectRoot(), projectName);

//		for(String dir : dirs) {
//			File project = new File(basePath,dir);
//			if (project.exists() == false) {
//				project.mkdirs();						
//			}
//		}
	}

	private void createEmptyProject(final String projectName) {
//		File rootProject = ProjectBrowser.getProjectRoot();
//		File project = new File(rootProject,projectName);
//		if (project.exists() == false) {
//			project.mkdir();
//		}
	}
}
