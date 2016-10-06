
package de.symo.ontology.handler;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

import de.symo.ontology.Activator;
import model.impl.ModelFactoryImpl;

public class AddOntologyHandler {
	@Execute
	public void execute(IEclipseContext context, IWorkbench workbench) {
		Activator.repositoryManager.getResource().getContents().add(ModelFactoryImpl.eINSTANCE.createOntologyRepository());
	}
}