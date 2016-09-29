package de.symo.semantics.ui;

import de.symo.semantics.ui.edit.ui.provider.UiViewerContentProvider;
import de.symo.semantics.ui.ui.provider.UiFeaturesProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * de.symo.semantics.ui Emf Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class UiEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public UiEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return UiFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends IContentProvider> bindIContentProvider() {
    return UiViewerContentProvider.class;
  }
}
