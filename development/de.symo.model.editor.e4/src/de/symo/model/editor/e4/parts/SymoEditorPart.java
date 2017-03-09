package de.symo.model.editor.e4.parts;

import java.io.File;
import java.io.IOException;
import java.util.EventObject;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
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

import de.symo.model.editor.e4.ui.symo.SymoInjectorProvider;
import oida.bridge.service.IOIDABridge;
import oida.bridge.service.OIDABridgeException;

public class SymoEditorPart {
	private final String OIDA_SUBDIRECTORY = "\\ont\\";
	
	private TreeFormComposite treeFormComposite;
	private Resource resource;

	@Inject
	MDirtyable dirty;

	@Inject
	MPart mPart;

	@Inject
	EPartService partService;

	@PostConstruct
	public void postConstruct(Composite parent, @Optional IOIDABridge oidaBridge) {
		File file = (File)mPart.getTransientData().get("data");
		if (file == null) {
			// ### Hack
			if (mPart.getLabel().equals("Symo"))
			{
				mPart.setLabel(UUID.randomUUID().toString());
			}

			partService.hidePart(mPart);
			return;
		}

		URI uri = URI.createFileURI(file.toString());
		if (uri == null) {
			return;
		}

		// get injector
		Injector injector = SymoInjectorProvider.getInjector();

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

		try {
			if (oidaBridge != null)
				oidaBridge.invokeModelObservation(resource.getContents().get(0), new File(file.getParent() + OIDA_SUBDIRECTORY), file.getName());
		} catch (OIDABridgeException e) {
			e.printStackTrace();
		}
	}

	@Persist
	public void save(MDirtyable dirty, @Optional IOIDABridge oidaBridge) throws IOException {
		File file = (File)mPart.getTransientData().get("data");
		URI uri = URI.createFileURI(file.toString());
		if (uri == null) {
			return;
		}

		resource.save(null);

		if (oidaBridge != null)
			oidaBridge.saveModelOntology(resource.getContents().get(0));

		if (dirty != null) {
			dirty.setDirty(false);
		}
	}

	@PreDestroy
	public void preDestroy(@Optional IOIDABridge oidaBridge) {
		File file = (File)mPart.getTransientData().get("data");
		URI uri = URI.createFileURI(file.toString());
		if (uri == null) {
			return;
		}

		if (oidaBridge != null)
			oidaBridge.saveModelOntology(resource.getContents().get(0));
	}
}
