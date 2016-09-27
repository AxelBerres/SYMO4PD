package de.symo.semantics.ui.ui.provider;

import com.google.inject.Inject;
import model.OntologyLibrary;
import model.OntologyRepository;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class UiLabelProvider extends ViewerLabelProvider {
  @Inject
  public UiLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final OntologyLibrary it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final OntologyRepository it) {
    String _ontology = it.getOntology();
    return _ontology;
  }
}
