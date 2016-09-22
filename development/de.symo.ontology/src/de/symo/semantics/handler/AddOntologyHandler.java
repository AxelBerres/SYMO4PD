 
package de.symo.semantics.handler;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

import de.symo.semantics.ui.repository.IncludeRepositoryDialog;

public class AddOntologyHandler {
	@Execute
	public void execute(IEclipseContext context, IWorkbench workbench) {
		IncludeRepositoryDialog dialog = ContextInjectionFactory.make(IncludeRepositoryDialog.class, context);
		dialog.open();
	}
}