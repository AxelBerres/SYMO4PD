package de.symo.ontology.ui;

import com.google.inject.Injector;
import de.symo.ontology.ui.UiInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class UiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return UiInjectorProvider.getInjector();
  }
}
