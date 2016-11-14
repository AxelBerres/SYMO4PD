package de.symo.model.editor.registry.ui.parts;

import java.io.IOException;
import java.util.EventObject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.TreeFormComposite;
import org.eclipse.emf.parsley.composite.TreeFormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import de.symo.model.editor.registry.ui.UiInjectorProvider;

public class RegistryEditorPart {

	private TreeFormComposite treeFormComposite;

	private Resource resource;
	private URI uri = URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "//Registry.registry");
	
	@Inject
	MDirtyable dirty;
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		// get injector
		Injector injector = UiInjectorProvider.getInjector();

		// The EditingDomain is needed for context menu and drag and drop
		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);

		// load the resource
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
		resource.getContents().size();

		// create the tree form
		TreeFormFactory treeFromFactory = injector.getInstance(TreeFormFactory.class);
		treeFormComposite = treeFromFactory.createTreeFormComposite(parent, SWT.NONE);		
		
		// inject viewer context menu and drag and drop helper
		ViewerContextMenuHelper conextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		ViewerDragAndDropHelper dragAndDrop = injector.getInstance(ViewerDragAndDropHelper.class);

		StructuredViewer viewer = treeFormComposite.getViewer();
		conextMenuHelper.addViewerContextMenu(viewer, editingDomain);
		dragAndDrop.addDragAndDrop(viewer, editingDomain);
		
		// update the tree from composite
		treeFormComposite.update(resource);

		// add command stack listener for saving
		editingDomain.getCommandStack().addCommandStackListener(new CommandStackListener() {
			
			@Override
			public void commandStackChanged(EventObject event) {
				if (dirty != null)
					dirty.setDirty(true);				
			}
		});
	}
	
	@Persist
	public void save(MDirtyable dirty) throws IOException {
		resource.save(null);
		if (dirty != null) {
			dirty.setDirty(false);
		}
	}
}
