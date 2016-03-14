package de.symo.ontology.view;

import org.apache.jena.ontology.OntClass;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import de.symo.ontology.OntologyManager;

public class OntologyManagerView extends ViewPart {
	private ListViewer viewer;
	private Text searchBox;
	private Button importConceptButton;
	
	public OntologyManagerView() {
		OntologyManager.getInstance().LoadOntology(OntologyManager.PATH);
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, true);
	    parent.setLayout(layout);
		
		viewer = new ListViewer(parent, SWT.FILL);	
		viewer.setContentProvider(new OntologyStructuredContentProvider());
		
		viewer.setLabelProvider(new LabelProvider() {
			public Image getImage(Object element) {
				return null;
			}

			public String getText(Object element) {
				return ((OntClass)element).getLocalName();
			}
		});
		
		viewer.setInput(OntologyManager.getInstance().getAllConcepts());
		
		searchBox = new Text(parent, SWT.NONE);
		//searchBox.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		searchBox.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				viewer.addFilter(new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return ((OntClass)element).getLocalName().contains(searchBox.getText());
					}
				});
			}
		});

		importConceptButton = new Button(parent, SWT.NONE);
		importConceptButton.setText("Import");
		importConceptButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection selectedOntClasses = (IStructuredSelection)viewer.getSelection();
				System.out.println(selectedOntClasses.getFirstElement().toString());
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}
		});
	}

	@Override
	public void setFocus() {
	}
}
