package de.symo.oida.strategy.structuring;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.symo.model.base.BasePackage;
import de.symo.model.symo.SymoPackage;
import oida.bridge.model.strategy.IStructuringStrategy;
import oida.bridge.service.IOIDABridge.OntologyObjectProperties;

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
	public StructuringAdvice determineStructuringAdviceAfterCreate(Object createdModelElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StructuringAdvice determineStructuringAdviceAfterSet(EAttribute changedAttribute) {
		if (changedAttribute == BasePackage.eINSTANCE.getADataItem_Id())
			return StructuringAdvice.RENAME_INDIVIDUAL;
		
		if (changedAttribute == BasePackage.eINSTANCE.getANameItem_Name())
			return StructuringAdvice.CHANGE_NAMEANNOTATION;
		
		return StructuringAdvice.CHANGE_DATATYPEPROPERTY;
	}

	@Override
	public OntologyObjectProperties determineObjectPropertyRelation(EStructuralFeature feature) {
		if (feature == SymoPackage.eINSTANCE.getSystemElement_Children())
			return OntologyObjectProperties.HAS_PART;
		
		if (feature == SymoPackage.eINSTANCE.getSystemElement_Parameters())
			return OntologyObjectProperties.HAS_PARAMETER;
		
		return null;
	}
}
