package de.symo.ontology.manager.ui.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class UiFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("OntologyManagerModel.Library",
      "owner", "creationDate");
    stringMap.mapTo("OntologyManagerModel.OntologyEntry",
      "path", "file", "maintenanceFile");
    stringMap.mapTo("OntologyManagerModel.OntologyRepoEntry",
      "path", "file", "maintenanceFile", "repoURL", "gitServerUsername", "gitServerPassword");
  }
}
