package de.symo.projectbrowser.ressources;

import java.io.File;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class RegistryEditorStrategy implements IOpenStrategy {

	@Inject
	private EPartService partService;
	
	@Inject
	private EModelService modelService;
	
	@Inject
	private MApplication application;

	
	@Execute
	public void open(File file) {
			
		// Add to editor part stack
		MPartStack editorStack = (MPartStack) modelService.find("de.symo.application.partstack.projects.editors", application);

		// Create the part and set the transient input data		
		MPart part = modelService.createModelElement(MPart.class);
		part.setElementId("de.symo.model.editor.registry.tree" + 0);
		part.setContributionURI("bundleclass://de.symo.model.editor.registry/" + "de.symo.model.editor.registry.ui.parts.RegistryEditorPart");
		part.setCloseable(true);
		part.setLabel("Part " + 0);
		part.getTags().add(EPartService.REMOVE_ON_HIDE_TAG);
		part.getTransientData().put("data", file);

		// Add to editor part stack
		editorStack.getChildren().add(part);

		// Show
		partService.showPart(part, PartState.ACTIVATE);
	}
}
