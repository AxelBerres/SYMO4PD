package de.symo.ontology.ui.resource;

import model.ModelFactory;
import model.OntologyLibrary;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class UiResourceManager extends ResourceManager {
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    OntologyLibrary _createOntologyLibrary = ModelFactory.eINSTANCE.createOntologyLibrary();
    _contents.add(_createOntologyLibrary);
  }
}
