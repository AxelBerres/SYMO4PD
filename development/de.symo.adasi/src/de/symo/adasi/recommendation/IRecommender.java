package de.symo.adasi.recommendation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import oida.ontology.OntologyItem;

public interface IRecommender {
	List<OntologyItem> recommendOntologyItems(EObject modelElement);
}
