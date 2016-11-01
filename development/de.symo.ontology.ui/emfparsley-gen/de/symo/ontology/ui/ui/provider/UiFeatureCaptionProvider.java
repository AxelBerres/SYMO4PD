package de.symo.ontology.ui.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;

@SuppressWarnings("all")
public class UiFeatureCaptionProvider extends FeatureCaptionProvider {
  public String text_OntologyLibrary_activeOntology(final EStructuralFeature it) {
    return "Active Ontology:";
  }
  
  public String text_Ontology_path(final EStructuralFeature it) {
    return "Path:";
  }
  
  public String text_Ontology_fileName(final EStructuralFeature it) {
    return "Filename:";
  }
}
