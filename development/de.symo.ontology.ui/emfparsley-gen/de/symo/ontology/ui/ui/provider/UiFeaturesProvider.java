package de.symo.ontology.ui.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class UiFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("model.Ontology",
      "path", "fileName", "maintenanceFileName");
    stringMap.mapTo("model.OntologyRepository",
      "path", "fileName", "maintenanceFileName", "URL", "username", "password");
  }
}
