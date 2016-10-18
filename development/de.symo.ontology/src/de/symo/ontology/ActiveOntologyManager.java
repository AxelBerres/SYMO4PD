package de.symo.ontology;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;

import de.symo.ontology.io.Owl;
import model.ModelPackage;
import model.Ontology;
import model.OntologyLibrary;

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
		if (ModelPackage.Literals.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY.getFeatureID() == notification.getFeatureID(OntologyLibrary.class)) {
			loadOntology((Ontology)notification.getNewValue());
		}
	}
	
	private void loadOntology(Ontology ontology) {
		try {
			Owl.loadFromOwl(URI.createURI("http://www.bauhaus-luftfahrt.net/ont/ology"), new URL(ontology.getFileName()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
