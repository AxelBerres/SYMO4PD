package de.symo.oida.strategy.renamer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.symo.model.base.ANameItem;
import de.symo.model.element.Parameter;
import de.symo.model.element.Value;
import de.symo.model.symo.ProjectRepository;
import oida.bridge.model.renamer.IRenamerStrategy;
import oida.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh, Martin Glas
 *
 */
public class SymoRenamerStrategy implements IRenamerStrategy {
	@Override
	public String getEObjectName(EObject eObject) {
		if (eObject instanceof ProjectRepository)
			return "ProjectRepository";
		
		if (eObject instanceof ANameItem)
			return ((ANameItem)eObject).getName(); // generateANameItemName((ANameItem)eObject);
		
		if (eObject instanceof Value) {
			Value valueItem = (Value)eObject;
			Parameter parameter = (Parameter)valueItem.eContainer();
			
			String name = generateANameItemName(parameter);
			name = name + StringConstants.UNDERSCORE + "Value";
			
			return name;
		}
		
		return "NoNameFound";
	}
	
	@Override
	public List<EObject> getNameRelevantObjectsForEObject(EObject eObject) {
		List<EObject> relevantObject = new ArrayList<EObject>();
		
		if (eObject instanceof Value) {
			relevantObject.add(eObject.eContainer());
		}
		
		return relevantObject;
	}

	@Override
	public String getEStructuralFeatureName(EStructuralFeature eStructuralFeature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEClassName(EClass eClass) {
		return eClass.getName();
	}
	
	private String generateANameItemName(ANameItem namedItem) {
		String fullName = namedItem.eClass().getName() + StringConstants.UNDERSCORE;
		
		if (namedItem.getName() == null || namedItem.getName().isEmpty())
			fullName = fullName + "UnnamedItem";
		else
			fullName = fullName + namedItem.getName();
		
		fullName = fullName.replaceAll(StringConstants.SPACE, StringConstants.EMPTY);

		return fullName;
	}
}
