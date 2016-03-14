package de.symo.ontology;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.iterator.ExtendedIterator;

public class OntologyManager {
public final static String PATH = "file:///C:/Users/michael.shamiyeh/Workspace/Symo4PD/development/de.symo.ontology/owl/qu.owl";
	
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
	
	public OntClass getThingClass() {
		ExtendedIterator<OntClass> it = jenaModel.listNamedClasses();
		
		while (it.hasNext()) {
		    OntClass ontclass = it.next();
		    System.out.println(ontclass.getLocalName());
		    if (ontclass.getSuperClass() == null)
		    	return ontclass;
		}
		
		return null;
	}
	
	public List<OntClass> getAllConcepts() {
		List<OntClass> concepts = new ArrayList<OntClass>();
		
		ExtendedIterator<OntClass> it = jenaModel.listNamedClasses();
		
		while (it.hasNext())
		    concepts.add(it.next());
		
		return concepts;
	}
}
