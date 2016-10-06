package de.symo.ontology.repository;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class RepositoryManager {
	private static URI REPOSITORY_LIBRARY_URI = URI.createFileURI(System.getProperty("user.home") + "/OntLib.onl");
	
	private Resource resource;
	
	public Resource getResource() {
		return resource;
	}

	public RepositoryManager() {
		ResourceSet resSet = new ResourceSetImpl();
		resource = resSet.createResource(REPOSITORY_LIBRARY_URI);
	}
}
