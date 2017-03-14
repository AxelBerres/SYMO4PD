package de.symo.oida.strategy.renamer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.symo.model.base.ANameItem;
import de.symo.model.element.Parameter;
import de.symo.model.element.Value;
import de.symo.model.symo.ProjectRepository;
import oida.bridge.model.renamer.IRenamerStrategy;

public class SymoRenamerStrategy implements IRenamerStrategy {

	@Override
	public String getEObjectName(EObject eObject) {
		if (eObject instanceof ProjectRepository)
			return "ProjectRepository";
		
		if (eObject instanceof ANameItem)
			return generateANameItemName((ANameItem)eObject);
		
		if (eObject instanceof Value) {
			Value valueItem = (Value)eObject;
			Parameter parameter = (Parameter)valueItem.eContainer();
			
			String name = generateANameItemName(parameter);
			name = name + "_Value";
			
			return name;
		}
		
		return "NoNameFound";
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
		String fullName = namedItem.eClass().getName() + "_";
		
		if (namedItem.getName() == null || namedItem.getName().isEmpty())
			fullName = fullName + "UnnamedItem";
		else
			fullName = fullName + namedItem.getName();
		
		fullName = fullName.replaceAll(" ", "");

		return fullName;
	}
}
