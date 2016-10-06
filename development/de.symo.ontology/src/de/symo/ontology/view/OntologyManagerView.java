
package de.symo.ontology.view;

import java.io.IOException;
import java.util.EventObject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.TableFormComposite;
import org.eclipse.emf.parsley.composite.TableFormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import de.symo.ontology.Activator;
import de.symo.semantics.ui.UiInjectorProvider;
import model.ModelPackage;

/**
 * Ontology Manager View
 * 
 * @author Michael.Shamiyeh
 * @since 22.09.2016
 */
public class OntologyManagerView {

	// the EMF Parley composite for showing a tree and a detail form
	private TableFormComposite tableFormComposite;
	// the EMF Resource
	private Resource resource;

	@Inject
	private MDirtyable dirty;

	public OntologyManagerView() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
//		GridLayout gridLayout = new GridLayout();
//	    gridLayout.numColumns = 1;
//	    parent.setLayout(gridLayout);
		
		// Guice injector
		Injector injector = UiInjectorProvider.getInjector();

		// The EditingDomain is needed for context menu and drag and drop
		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);

		resource = Activator.repositoryManager.getResource();

		TableFormFactory tableFormFactory = injector.getInstance(TableFormFactory.class);
		// create the tree-form composite
		tableFormComposite = tableFormFactory.createTableFormMasterDetailComposite(parent, SWT.NONE, ModelPackage.Literals.ONTOLOGY_REPOSITORY);

		// Guice injected viewer context menu helper
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		// Guice injected viewer drag and drop helper
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);

		// set context menu and drag and drop
		contextMenuHelper.addViewerContextMenu(tableFormComposite.getViewer(), editingDomain);
		dragAndDropHelper.addDragAndDrop(tableFormComposite.getViewer(), editingDomain);

		// update the composite
		tableFormComposite.update(resource);

		editingDomain.getCommandStack().addCommandStackListener(new CommandStackListener() {
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
	
	/*
	 * private ListViewer viewer;
	private Text searchBox;
	private Button importConceptButton;
	
	public OntologyManagerView() {
//		File f = new File(OntologyManager.PATH_AXEL);
//		if (f.exists() == true) {
			OntologyManager.getInstance().LoadOntology(OntologyManager.PATH_AXEL);
//		} else {
//			System.out.println("Path 1 does not exist, using Path 2.");
//			OntologyManager.getInstance().LoadOntology(OntologyManager.PATH_MICHI);
//		}
	}

	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, true);
	    parent.setLayout(layout);
		
		viewer = new ListViewer(parent, SWT.FILL);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_VERTICAL));
		
		viewer.setContentProvider(new OntologyStructuredContentProvider());
		
		viewer.setLabelProvider(new LabelProvider() {
			public Image getImage(Object element) {
				return null;
			}

			public String getText(Object element) {
				return ((OntResource)element).getLocalName();
			}
		});
		
		viewer.setInput(OntologyManager.getInstance().getAllResources());
		
		Composite searchRow = new Composite(parent, SWT.FILL);
		searchRow.setLayout(new RowLayout());
		
		Label l = new Label(searchRow, SWT.NONE);
		l.setText("Begriff-Suche: ");
		
		searchBox = new Text(searchRow, SWT.FILL);
		searchBox.setLayoutData(new RowData(200, 20));
		searchBox.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				viewer.addFilter(new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return ((OntResource)element).getLocalName().contains(searchBox.getText());
					}
				});
			}
		});

		importConceptButton = new Button(searchRow, SWT.NONE);
		importConceptButton.setText("Import");
		importConceptButton.setLayoutData(new RowData(100, 20));
		importConceptButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection selectedOntResources = (IStructuredSelection)viewer.getSelection();
				System.out.println(selectedOntResources.getFirstElement().toString());
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}
		});
	}*/
}