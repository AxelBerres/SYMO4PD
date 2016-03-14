package de.symo.ontology.view;

import java.util.ArrayList;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.util.iterator.ExtendedIterator;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class OntologyTreeContentProvider implements ITreeContentProvider {
	public OntologyTreeContentProvider() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		OntClass cl = (OntClass)parentElement;
		
		ArrayList<Object> ret = new ArrayList<Object>();
			
		ExtendedIterator<OntClass> it = cl.listSubClasses();
		
		while (it.hasNext()) {
			OntClass subClass = it.next();
			ret.add(subClass);
		}
		
		return ret.toArray();
	}

	@Override
	public Object getParent(Object element) {
		OntClass cl = (OntClass)element;
		return cl.getSuperClass();
	}

	@Override
	public boolean hasChildren(Object element) {
		OntClass cl = (OntClass)element;
		return cl.listSubClasses().hasNext();
	}

	@Override
	public void dispose() {
	}
}
