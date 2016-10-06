package de.symo.semantics.ui.edit.ui.provider;

import com.google.inject.Inject;
import model.OntologyLibrary;
import model.OntologyRepository;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

@SuppressWarnings("all")
public class UiViewerContentProvider extends ViewerContentProvider {
  @Inject
  public UiViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object children(final OntologyLibrary it) {
    return it.getName();
  }
  
  public Object children(final OntologyRepository it) {
    return it.getOntology();
  }
}
