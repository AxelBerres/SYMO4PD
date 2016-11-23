package de.symo.model.editor.e4.ui.registry;

import com.google.inject.Injector;
import de.symo.model.editor.e4.ui.registry.RegistryInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class RegistryExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return RegistryInjectorProvider.getInjector();
  }
}
