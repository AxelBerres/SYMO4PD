package de.symo.projectbrowser.e4.ui.handlers;

import java.io.File;

import org.eclipse.e4.core.di.annotations.Execute;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import de.symo.projectbrowser.e4.ui.NewProjectDialog;
import de.symo.projectbrowser.e4.model.ProjectDefaults;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;

public class ProjectNewHandler {

	@Execute
	public void execute() {

		// create the new project Dialog
		Shell shell = new Shell(SWT.SHELL_TRIM);
		NewProjectDialog dialog =  new NewProjectDialog(shell);
		dialog.create();
	    if (dialog.open() == Window.CANCEL) {
	    	return;
	    }

		// create empty or project with default directory structure
		String projectName = dialog.getProjectName();			
		if(dialog.getDefaultStructure()) {
			createDefaultProject(projectName);
		} else {
			createEmptyProject(projectName);			
		}

		// ### FIXME HACK
		ProjectBrowserPart.refresh();
	}

	/**
	 * Create a project with the default project structure
	 * @param projectName
	 */
	private void createDefaultProject(final String projectName) {
		
		File basePath = new File(ProjectBrowserPart.getProjectRoot(), projectName);
		for(String dir : ProjectDefaults.getDefaultDirs()) {
			File project = new File(basePath,dir);
			if (project.exists() == false) {
				project.mkdirs();						
			}
		}
	}

	private void createEmptyProject(final String projectName) {
		File rootProject = ProjectBrowserPart.getProjectRoot();
		File project = new File(rootProject,projectName);
		if (project.exists() == false) {
			project.mkdir();
		}
	}
}
