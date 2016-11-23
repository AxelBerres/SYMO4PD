package de.symo.model.editor.e4.ui.registry;

import de.symo.model.editor.e4.ui.registry.resource.RegistryResourceManager;
import de.symo.model.editor.e4.ui.registry.ui.provider.RegistryFeaturesProvider;
import de.symo.model.editor.e4.ui.registry.ui.provider.RegistryLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @since 2016-11-07
 * @author Axel.Berres@...
 */
@SuppressWarnings("all")
public class RegistryEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public RegistryEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return UndoableEditingStrategy.class;
  }
  
  @Override
  public int valueTreeFormSashStyle() {
    return SWT.VERTICAL;
  }
  
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return RegistryLabelProvider.class;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return RegistryFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return RegistryResourceManager.class;
  }
}
