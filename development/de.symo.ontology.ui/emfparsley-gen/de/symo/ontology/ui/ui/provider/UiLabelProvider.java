package de.symo.ontology.ui.ui.provider;

import com.google.inject.Inject;
import model.Ontology;
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
    return "Library";
  }
  
  public String text(final Ontology it) {
    String _fileName = it.getFileName();
    String _plus = (_fileName + " (local)");
    return _plus;
  }
  
  public String text(final OntologyRepository it) {
    String _fileName = it.getFileName();
    String _plus = (_fileName + " (git)");
    return _plus;
  }
  
  public Object image(final OntologyLibrary it) {
    return "OntologyLibrary_16.png";
  }
  
  public Object image(final Ontology it) {
    return "OntologyLocal_16.png";
  }
  
  public Object image(final OntologyRepository it) {
    return "OntologyRepository_16.png";
  }
}
