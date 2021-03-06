package de.symo.oida.strategy.renamer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.symo.model.base.ADataItem;
import de.symo.model.base.ANameItem;
import de.symo.model.element.Parameter;
import de.symo.model.element.Value;
import de.symo.model.symo.ProjectRepository;
import oida.bridge.model.emf.strategy.EMFRenamerStrategy;
import oida.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh, Martin Glas
 *
 */
public class SymoRenamerStrategy extends EMFRenamerStrategy {
	@Override
	public String getObjectID(Object object) {
		if (object instanceof ADataItem)
			return ((ADataItem)object).getId();
		
		if (object instanceof ProjectRepository)
			return "ProjectRepository";
		
		return "NoIDFound";
	}
	
	@Override
	public String getObjectName(Object object) {
		if (object instanceof ProjectRepository)
			return "ProjectRepository";
		
		if (object instanceof ANameItem)
			return ((ANameItem)object).getName(); // generateANameItemName((ANameItem)eObject);
		
		if (object instanceof Value) {
			Value valueItem = (Value)object;
			Parameter parameter = (Parameter)valueItem.eContainer();
			
			String name = generateANameItemName(parameter);
			name = name + StringConstants.UNDERSCORE + "Value";
			
			return name;
		}
		
		return "NoNameFound";
	}
	
	@Override
	public List<Object> getNameRelevantObjectsForObject(Object object) {
		List<Object> relevantObject = new ArrayList<Object>();
		
		if (object instanceof Value) {
			relevantObject.add(((EObject)object).eContainer());
		}
		
		return relevantObject;
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

	@Override
	public String getMetaModelName() {
		return "SYMO4PDMetaModel";
	}
}
