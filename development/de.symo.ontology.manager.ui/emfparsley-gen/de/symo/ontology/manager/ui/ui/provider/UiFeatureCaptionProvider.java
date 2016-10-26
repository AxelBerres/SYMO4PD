package de.symo.ontology.manager.ui.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;

@SuppressWarnings("all")
public class UiFeatureCaptionProvider extends FeatureCaptionProvider {
  public String text_Library_owner(final EStructuralFeature it) {
    return "Owner: ";
  }
  
  public String text_Library_creationDate(final EStructuralFeature it) {
    return "Created on: ";
  }
  
  public String text_OntologyEntry_path(final EStructuralFeature it) {
    return "Path: ";
  }
  
  public String text_OntologyEntry_file(final EStructuralFeature it) {
    return "File: ";
  }
  
  public String text_OntologyEntry_maintenanceFile(final EStructuralFeature it) {
    return "Maintenance Ontology: ";
  }
  
  public String text_OntologyRepoEntry_path(final EStructuralFeature it) {
    return "Path: ";
  }
  
  public String text_OntologyRepoEntry_file(final EStructuralFeature it) {
    return "File: ";
  }
  
  public String text_OntologyRepoEntry_maintenanceFile(final EStructuralFeature it) {
    return "Maintenance Ontology: ";
  }
  
  public String text_OntologyRepoEntry_repoURL(final EStructuralFeature it) {
    return "Git Repository URL: ";
  }
  
  public String text_OntologyRepoEntry_gitServerUsername(final EStructuralFeature it) {
    return "Username: ";
  }
  
  public String text_OntologyRepoEntry_gitServerPassword(final EStructuralFeature it) {
    return "Password: ";
  }
}
