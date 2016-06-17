package de.symo.ontology;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.ontology.OntResource;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.iterator.ExtendedIterator;

public class OntologyManager {
	
	public final static String PATH_MICHI = "file:///C:/Users/michael.shamiyeh/Documents/GIT/Symo4PD/development/de.symo.ontology/owl/qu-rec20.owl";
	public final static String PATH_AXEL = "file:///D:/git/SYMO4PD/development/de.symo.ontology/owl/qu-rec20.owl";

	private OntModel jenaModel;
	
	// Singleton:
	private static OntologyManager instance;
	public static OntologyManager getInstance() {
		if (instance == null)
			instance = new OntologyManager();
		
		return instance;
	}
	
	private OntologyManager() {
	}
	
	public void LoadOntology(String path) {
		jenaModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
		jenaModel.read(path, null);
	}
	
//	public OntClass getThingClass() {
//		ExtendedIterator<OntClass> it = jenaModel.listNamedClasses();
//		
//		while (it.hasNext()) {
//		    OntClass ontclass = it.next();
//		    System.out.println(ontclass.getLocalName());
//		    if (ontclass.getSuperClass() == null)
//		    	return ontclass;
//		}
//		
//		return null;
//	}
	
	public List<OntResource> getAllResources() {
		List<OntResource> ontologyResources = new ArrayList<OntResource>();
		
		ExtendedIterator<OntClass> it = jenaModel.listNamedClasses();
		
		while (it.hasNext())
		{
			OntClass cl = it.next();
			@SuppressWarnings("unchecked")
			ExtendedIterator<OntResource> itinst = (ExtendedIterator<OntResource>)cl.listInstances();
			while (itinst.hasNext())
				ontologyResources.add(itinst.next());
			
		    ontologyResources.add(cl);
		}
		
		return ontologyResources;
	}
	
	
	public boolean isConcept(final String name) {
		
		boolean found = false;
		
		for(OntResource ontClass : getAllResources()) {			
			if (name.equals(ontClass.getLocalName()) == true) {				
				return true; 
			}
		}			

		return found;
	}
	
}
