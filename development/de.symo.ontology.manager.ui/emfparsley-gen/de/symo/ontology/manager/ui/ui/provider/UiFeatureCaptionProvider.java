package de.symo.ontology.manager.ui.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;

@SuppressWarnings("all")
public class UiFeatureCaptionProvider extends FeatureCaptionProvider {
  public String text_Library_owner(final EStructuralFeature it) {
    return "Owner:";
  }
  
  public String text_Library_creationDate(final EStructuralFeature it) {
    return "Created on:";
  }
}
