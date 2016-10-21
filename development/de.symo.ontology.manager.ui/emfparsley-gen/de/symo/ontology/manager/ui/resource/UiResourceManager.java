package de.symo.ontology.manager.ui.resource;

import OntologyManagerModel.Library;
import OntologyManagerModel.OntologyManagerModelFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class UiResourceManager extends ResourceManager {
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    Library _createLibrary = OntologyManagerModelFactory.eINSTANCE.createLibrary();
    _contents.add(_createLibrary);
  }
}
