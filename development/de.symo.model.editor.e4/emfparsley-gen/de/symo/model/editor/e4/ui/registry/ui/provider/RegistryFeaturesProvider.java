package de.symo.model.editor.e4.ui.registry.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class RegistryFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("de.symo.model.registry.Registry",
      "name");
    stringMap.mapTo("de.symo.model.element.Measurement",
      "name", "units");
    stringMap.mapTo("de.symo.model.registry.Constant",
      "name", "value");
    stringMap.mapTo("de.symo.model.element.Unit",
      "name", "description", "symbol");
  }
}
