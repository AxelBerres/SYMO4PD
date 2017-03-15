package de.symo.oida.strategy.structuring;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import de.symo.model.base.BasePackage;
import oida.bridge.model.renamer.IStructuringStrategy;
import oida.ontology.OntologyObjectProperty;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-03-13
 *
 */
public class SymoStructuringStrategy implements IStructuringStrategy {

	public SymoStructuringStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public StructuringAdvice determineStructuringAdviceAfterCreate(EObject createdModelElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StructuringAdvice determineStructuringAdviceAfterSet(EAttribute changedAttribute) {
		if (changedAttribute == BasePackage.eINSTANCE.getANameItem_Name())
			return StructuringAdvice.RENAME_INDIVIDUAL;
		
		return StructuringAdvice.CHANGE_DATATYPEPROPERTY;
	}

	@Override
	public OntologyObjectProperty determineObjectPropertyRelation(EObject newValue) {
		// TODO Auto-generated method stub
		return null;
	}
}
