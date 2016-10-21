package de.symo.ontology;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;

import OntologyManagerModel.OntologyEntry;
import de.symo.ontology.io.Owl;

public class ActiveOntologyManager extends AdapterImpl {
	
	private static ActiveOntologyManager instance;
	
	public static ActiveOntologyManager getInstance() {
		if (instance == null)
			instance = new ActiveOntologyManager();
		
		return instance;
	}
	
	
	private ActiveOntologyManager() {
		
	}
	
	public void notifyChanged(Notification notification) {
//		if (OntologyManagerModel.OntologyManagerModelPackage.Literals.LIBRARY__ACTIVE_ONTOLOGY_ENTRY.getFeatureID() == notification.getFeatureID(OntologyManagerModel.Library.class)) {
//			loadOntology((OntologyEntry)notification.getNewValue());
//		}
	}
	
	private void loadOntology(OntologyEntry ontologyEntry) {
		try {
			Owl.loadFromOwl(URI.createURI("http://www.bauhaus-luftfahrt.net/ont/ology"), new URL(ontologyEntry.getFile()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
