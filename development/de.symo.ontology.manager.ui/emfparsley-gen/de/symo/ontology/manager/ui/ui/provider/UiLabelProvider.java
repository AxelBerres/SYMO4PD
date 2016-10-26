package de.symo.ontology.manager.ui.ui.provider;

import OntologyManagerModel.Library;
import OntologyManagerModel.OntologyEntry;
import OntologyManagerModel.OntologyRepoEntry;
import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class UiLabelProvider extends ViewerLabelProvider {
  @Inject
  public UiLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Library it) {
    return "Listed Ontologies";
  }
  
  public String text(final OntologyEntry e) {
    String _file = e.getFile();
    return _file;
  }
  
  public String text(final OntologyRepoEntry e) {
    String _file = e.getFile();
    return _file;
  }
  
  public Object image(final Library it) {
    return "OntologyLibrary_16.png";
  }
  
  public Object image(final OntologyEntry it) {
    return "OntologyLocal_16.png";
  }
  
  public Object image(final OntologyRepoEntry it) {
    return "OntologyRepository_16.png";
  }
}
