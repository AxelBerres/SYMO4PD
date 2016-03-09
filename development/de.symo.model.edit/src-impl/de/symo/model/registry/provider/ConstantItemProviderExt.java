package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.base.Unit;
import de.symo.model.base.Value;
import de.symo.model.help.ItemProviderHelper;
import de.symo.model.registry.Constant;

public class ConstantItemProviderExt extends ConstantItemProvider {

	public ConstantItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
	
		Constant constant = (Constant) object;

		// get type name
        String typeName = "";
        typeName = getString("_UI_Constant_type");
        typeName = typeName.replace(" ", "") + " ";
		
		String label = constant.getName();

        // label
        if (label != null) {
        	typeName = ""; // remove type name if name of constant is given
            label = label.replace(ItemProviderHelper.NEWLINE, "");
        } else {
            label = "";
        }

        // with value & unit
        String strVal = "";
	        	        
       	Value value = (Value) constant.getValue();
       	if (value != null && value.getValue() != null && !value.getValue().isEmpty()) {
       		strVal = " = " + value.getValue();
        }

       	Unit unit = constant.getUnit();
       	if (unit != null && unit.getSymbol() != null) { 
       	
       		strVal += " " + ItemProviderHelper.UNIT_PRE 
       			   + constant.getUnit().getSymbol()
   	               + ItemProviderHelper.UNIT_POST;
   	    }

		return typeName + label + strVal;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Constant.png"));
	}
}
