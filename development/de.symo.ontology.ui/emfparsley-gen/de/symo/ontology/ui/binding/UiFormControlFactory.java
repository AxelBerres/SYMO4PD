package de.symo.ontology.ui.binding;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

@SuppressWarnings("all")
public class UiFormControlFactory extends FormControlFactory {
  public Control control_OntologyLibrary_activeOntology(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_OntologyLibrary_activeOntology();
    dataBindingContext.bindValue(
    	createTarget_OntologyLibrary_activeOntology(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_OntologyLibrary_activeOntology() {
    Composite _parent = this.getParent();
    final Composite c = new Composite(_parent, SWT.NONE);
    GridLayout _gridLayout = new GridLayout(2, false);
    c.setLayout(_gridLayout);
    final Text t = this.createText(c, SWT.BORDER);
    final Button b = new Button(c, SWT.PUSH);
    b.setText("Push me");
    final Listener _function = (Event it) -> {
      Shell _shell = c.getShell();
      MessageDialog.openInformation(_shell, "Event", "You pushed me!");
    };
    b.addListener(SWT.MouseDown, _function);
    return t;
  }
  
  protected IObservableValue createTarget_OntologyLibrary_activeOntology(final Control it) {
    return DatabindingUtil.observeText(it);
  }
}
