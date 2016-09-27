package de.symo.semantics.ui;

import org.eclipse.emf.common.util.URI;

public class OntologyLibraryView extends org.eclipse.emf.parsley.views.AbstractSaveableTreeFormView {
	@Override
	protected URI createResourceURI() {
		return URI.createFileURI( System.getProperty("user.home") + "/OntLib.onl" );
	}
}
