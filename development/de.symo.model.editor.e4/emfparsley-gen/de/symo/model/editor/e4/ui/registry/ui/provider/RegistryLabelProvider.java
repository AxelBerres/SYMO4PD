package de.symo.model.editor.e4.ui.registry.ui.provider;

import com.google.inject.Inject;
import de.symo.model.element.Measurement;
import de.symo.model.element.MetaData;
import de.symo.model.element.Stereotype;
import de.symo.model.element.Unit;
import de.symo.model.registry.Constant;
import de.symo.model.registry.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class RegistryLabelProvider extends ViewerLabelProvider {
  @Inject
  public RegistryLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Registry r) {
    String _name = r.getName();
    String _plus = (_name + " [");
    String _metaModel = r.getMetaModel();
    String _plus_1 = (_plus + _metaModel);
    String _plus_2 = (_plus_1 + "]");
    return _plus_2;
  }
  
  public String text(final Measurement m) {
    String _name = m.getName();
    return _name;
  }
  
  public String text(final Constant c) {
    String _name = c.getName();
    return _name;
  }
  
  public String text(final Unit u) {
    String _name = u.getName();
    String _plus = (_name + " ");
    String _symbol = u.getSymbol();
    String _plus_1 = (_plus + _symbol);
    return _plus_1;
  }
  
  public Object image(final Registry it) {
    return "Registry.png";
  }
  
  public Object image(final Constant it) {
    return "Constant.png";
  }
  
  public Object image(final MetaData it) {
    return "Stereotype.gif";
  }
  
  public Object image(final Stereotype it) {
    return "Stereotype.gif";
  }
  
  public Object image(final Unit it) {
    return "Unit.gif";
  }
  
  public Object image(final Measurement it) {
    return "Unit.gif";
  }
}
