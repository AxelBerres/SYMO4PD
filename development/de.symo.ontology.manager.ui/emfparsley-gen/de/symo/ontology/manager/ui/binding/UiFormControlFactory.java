package de.symo.ontology.manager.ui.binding;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("all")
public class UiFormControlFactory extends FormControlFactory {
  public Control control_Library_owner(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_Library_owner();
    dataBindingContext.bindValue(
    	createTarget_Library_owner(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_Library_owner() {
    Composite _parent = this.getParent();
    return this.createText(_parent, SWT.READ_ONLY);
  }
  
  protected IObservableValue createTarget_Library_owner(final Control it) {
    return DatabindingUtil.observeText(it);
  }
  
  public Control control_Library_creationDate(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_Library_creationDate();
    dataBindingContext.bindValue(
    	createTarget_Library_creationDate(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_Library_creationDate() {
    Composite _parent = this.getParent();
    return this.createText(_parent, SWT.READ_ONLY);
  }
  
  protected IObservableValue createTarget_Library_creationDate(final Control it) {
    return DatabindingUtil.observeText(it);
  }
  
  public Control control_OntologyRepoEntry_gitServerPassword(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_OntologyRepoEntry_gitServerPassword();
    dataBindingContext.bindValue(
    	createTarget_OntologyRepoEntry_gitServerPassword(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_OntologyRepoEntry_gitServerPassword() {
    Composite _parent = this.getParent();
    return this.createText(_parent, SWT.PASSWORD);
  }
  
  protected IObservableValue createTarget_OntologyRepoEntry_gitServerPassword(final Control it) {
    return DatabindingUtil.observeText(it);
  }
}
