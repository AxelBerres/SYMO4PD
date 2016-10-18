package de.symo.ontology.ui.edit.action;

import java.util.Collections;
import java.util.List;
import model.Ontology;
import model.OntologyLibrary;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.runtime.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class UiMenuBuilder extends EditingMenuBuilder {
  public List<IMenuContributionSpecification> emfMenuContributions(final Ontology ont) {
    EObject _eContainer = ont.eContainer();
    final IAcceptor<OntologyLibrary> _function = (OntologyLibrary ontologyLibrary) -> {
      ontologyLibrary.setActiveOntology(ont);
    };
    IMenuContributionSpecification _actionChange = this.<OntologyLibrary>actionChange("Set Active", ((OntologyLibrary) _eContainer), _function);
    return Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionChange));
  }
}
