package de.symo.model.editor.e4.ui.registry.resource;

import de.symo.model.registry.Registry;
import de.symo.model.registry.RegistryFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class RegistryResourceManager extends ResourceManager {
  @Override
  public void initialize(final Resource it) {
    final Registry registry = RegistryFactory.eINSTANCE.createRegistry();
    registry.setName("Base");
    EList<EObject> _contents = it.getContents();
    _contents.add(registry);
  }
}
