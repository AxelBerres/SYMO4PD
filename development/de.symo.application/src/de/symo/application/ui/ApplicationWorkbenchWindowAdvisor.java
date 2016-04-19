package de.symo.application.ui;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}
	
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		//configurer.setInitialSize(new Point(1024, 768));
		configurer.setShowStatusLine(true);
		configurer.setShowCoolBar(true);
		//configurer.setTitle("OpenCDT - E4 Compatible");
		configurer.setShowPerspectiveBar(false);
	}
}
