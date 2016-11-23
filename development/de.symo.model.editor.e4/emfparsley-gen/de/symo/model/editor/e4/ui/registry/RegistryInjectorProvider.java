package de.symo.model.editor.e4.ui.registry;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.symo.model.editor.e4.ui.registry.RegistryEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class RegistryInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new RegistryEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(RegistryInjectorProvider.class))));
    }
    return injector;
  }
}
