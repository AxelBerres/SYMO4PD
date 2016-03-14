package de.symo.ontology.view;

import java.io.File;

import org.apache.jena.ontology.OntResource;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import de.symo.ontology.OntologyManager;

public class OntologyManagerView extends ViewPart {
	private ListViewer viewer;
	private Text searchBox;
	private Button importConceptButton;
	
	public OntologyManagerView() {
		File f = new File(OntologyManager.PATH_AXEL);
		if(f.exists())
			OntologyManager.getInstance().LoadOntology(OntologyManager.PATH_AXEL);
		else
		{
			System.out.println("Path 1 does not exist, using Path 2.");
			OntologyManager.getInstance().LoadOntology(OntologyManager.PATH_MICHI);
		}
	}

	@Override
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
	}

	@Override
	public void setFocus() {
	}
}
