package de.symo.semantics.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import model.ModelPackage;

public class OntologyLibraryView extends org.eclipse.emf.parsley.views.AbstractSaveableTableFormView {
	@Override
	protected URI createResourceURI() {
		return URI.createFileURI( System.getProperty("user.home") + "/OntLib.onl" );
	}

	@Override
	protected EClass getEClass() {
		return ModelPackage.Literals.ONTOLOGY_REPOSITORY;
	}
}
