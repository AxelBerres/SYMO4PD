package de.symo.ontology.ui.binding;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("all")
public class UiFormControlFactory extends FormControlFactory {
  public Control control_OntologyRepository_password(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_OntologyRepository_password();
    dataBindingContext.bindValue(
    	createTarget_OntologyRepository_password(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_OntologyRepository_password() {
    return this.createText("", SWT.PASSWORD);
  }
  
  protected IObservableValue createTarget_OntologyRepository_password(final Control it) {
    ISWTObservableValue _observeText = DatabindingUtil.observeText(it, SWT.Modify);
    return _observeText;
  }
}
