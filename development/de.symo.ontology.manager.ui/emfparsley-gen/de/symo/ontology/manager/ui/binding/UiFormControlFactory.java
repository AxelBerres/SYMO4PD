package de.symo.ontology.manager.ui.binding;

import OntologyManagerModel.Library;
import java.util.Date;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("all")
public class UiFormControlFactory extends FormControlFactory {
  public Control control_Library_owner(final Library it) {
    String _owner = it.getOwner();
    String _string = _owner.toString();
    Label _createLabel = this.createLabel(_string);
    return _createLabel;
  }
  
  public Control control_Library_creationDate(final Library it) {
    Date _creationDate = it.getCreationDate();
    String _string = _creationDate.toString();
    Label _createLabel = this.createLabel(_string);
    return _createLabel;
  }
}
