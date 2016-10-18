package de.symo.ontology.ui;

import de.symo.ontology.ui.binding.UiFormControlFactory;
import de.symo.ontology.ui.edit.action.UiMenuBuilder;
import de.symo.ontology.ui.resource.UiResourceManager;
import de.symo.ontology.ui.ui.provider.UiLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class UiEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public UiEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return UiLabelProvider.class;
  }
  
  @Override
  public Class<? extends FormControlFactory> bindFormControlFactory() {
    return UiFormControlFactory.class;
  }
  
  @Override
  public Class<? extends EditingMenuBuilder> bindEditingMenuBuilder() {
    return UiMenuBuilder.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return UiResourceManager.class;
  }
}
