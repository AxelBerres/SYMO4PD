package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.base.Unit;
import de.symo.model.base.Value;
import de.symo.model.help.ItemProviderHelper;
import de.symo.model.registry.Parameter;

public class ParameterItemProviderExt extends ParameterItemProvider {

	public ParameterItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	
	@Override
	public String getText(final Object object) {
		Parameter parameter = (Parameter) object;

		// get type name
        String typeName = "";
        typeName = getString("_UI_Constant_type");
        typeName = typeName.replace(" ", "") + " ";
		
		String label = parameter.getName();

        // label
        if (label != null) {
        	typeName = ""; // remove type name if name of constant is given
            label = label.replace(ItemProviderHelper.NEWLINE, "");
        } else {
            label = "";
        }

        // with value & unit
        String strVal = "";
	        	        
       	Value value = (Value) parameter.getValue();
       	if (value != null && value.getValue() != null && !value.getValue().isEmpty()) {
       		strVal = " = " + value.getValue();
        }

       	Unit unit = parameter.getUnit();
       	if (unit != null && unit.getSymbol() != null) { 
       	
       		strVal += " " + ItemProviderHelper.UNIT_PRE 
       			   + parameter.getUnit().getSymbol()
   	               + ItemProviderHelper.UNIT_POST;
   	    }

		return typeName + label + strVal;

	}
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Parameter.gif"));
	}

}
