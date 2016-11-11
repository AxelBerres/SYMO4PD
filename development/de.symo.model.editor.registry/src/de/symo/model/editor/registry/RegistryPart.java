package de.symo.model.editor.registry;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class RegistryPart {
	
	public static final String REGISTRYPART_ID = "de.symo.model.editor.registry.part";

	private Text txtInput;
	private TableViewer tableViewer;

	@Inject
	private MDirtyable dirty;

	
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		txtInput = new Text(parent, SWT.BORDER);
		txtInput.setMessage("Enter text to mark part as dirty");
		txtInput.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dirty.setDirty(true);
			}
		});
		txtInput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		tableViewer = new TableViewer(parent);

		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setInput(createInitialDataModel());
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
	}
	
	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	@Persist
	public void save() {
		dirty.setDirty(false);
	}

	
	private List<String> createInitialDataModel() {
		return Arrays.asList("Sample item 1", "Sample item 2", "Sample item 3", "Sample item 4", "Sample item 5");
	}
}


/*
 		// Guice injector
		Injector injector = TreeInjectorProvider.getInjector();

		// The EditingDomain is needed for context menu and drag and drop
		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);

		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
		
		// load the resource
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
		resource.getContents().size();

		// create the tree-form composite
		treeViewer = new TreeViewer(parent);
		viewerFactory.initialize(treeViewer, resource);

		// Guice injected viewer context menu helper
		// Guice injected viewer drag and drop helper

		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);

		// set context menu and drag and drop
		contextMenuHelper.addViewerContextMenu(treeViewer, editingDomain);
		dragAndDropHelper.addDragAndDrop(treeViewer, editingDomain);

		// update the composite
		treeViewer.update(resource, null);

		editingDomain.getCommandStack().addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(EventObject event) {
				if (dirty != null)
					dirty.setDirty(true);
			}
		});

*/