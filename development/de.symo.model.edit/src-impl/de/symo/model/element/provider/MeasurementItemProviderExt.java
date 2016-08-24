package de.symo.model.element.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.element.Measurement;
import de.symo.model.element.provider.MeasurementItemProvider;
import de.symo.model.help.ItemProviderHelper;

public class MeasurementItemProviderExt extends MeasurementItemProvider {
	
	public MeasurementItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {

//		OntologyManager onManager = OntologyManager.getInstance();
		Measurement measuement = (Measurement) object;
		
		// get type name
        String typeName = "";
        typeName = getString("_UI_Measurement_type");
        typeName = typeName.replace(" ", "") + " ";

		String label = measuement.getName();
		String on = "*";

        // label
        if (label != null) {
        	
        	typeName = ""; // remove type name if name of constant is given
            label = label.replace(ItemProviderHelper.NEWLINE, "");
            
//    		// part of the ontology
//    		if (onManager != null) {
//    			if (onManager.isConcept(label)) {
//    				on = "";
//    			}
//    		}
    		
    		label = on + " " + label;
    		
        } else {
            label = "";
        }

        String symbol = ItemProviderHelper.UNIT_PRE;        
//       	if (measuement.getSymbol() != null) {
//       		symbol += measuement.getSymbol();
//   	    }
       	
        symbol += ItemProviderHelper.UNIT_POST;
       	
       	return (typeName + " " + label + " " + symbol).trim();       	
	}

	@Override
	public Object getImage(Object object) {
		
		String iconName = "custom/obj16/Unit.png";
	
//		Measurement measurement = (Measurement) object;		
//		if (measurement.isSiUnit()) {
//			iconName = "custom/obj16/siUnit.png";			
//		}
		
		return overlayImage(object, getResourceLocator().getImage(iconName));
	}
}
