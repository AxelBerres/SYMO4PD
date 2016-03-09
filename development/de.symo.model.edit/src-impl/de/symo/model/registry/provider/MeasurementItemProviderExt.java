package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.help.ItemProviderHelper;
import de.symo.model.registry.Measurement;

public class MeasurementItemProviderExt extends MeasurementItemProvider {

	public MeasurementItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {

		Measurement measuement = (Measurement) object;
		
		// get type name
        String typeName = "";
        typeName = getString("_UI_Measurement_type");
        typeName = typeName.replace(" ", "") + " ";

		String label = measuement.getName();

        // label
        if (label != null) {
        	typeName = ""; // remove type name if name of constant is given
            label = label.replace(ItemProviderHelper.NEWLINE, "");
        } else {
            label = "";
        }

        String symbol = ItemProviderHelper.UNIT_PRE;        
       	if (measuement.getSymbol() != null) {
       		symbol += measuement.getSymbol();            		
   	    }
       	
        symbol += ItemProviderHelper.UNIT_POST;
       	
       	return (typeName + " " +  label + " " + symbol).trim();       	
	}

	@Override
	public Object getImage(Object object) {
		
		Measurement measurement = (Measurement) object;
		
		if (measurement.isSiUnit()) {
			return overlayImage(object, getResourceLocator().getImage("custom/obj16/siUnit"));			
		}
		
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Unit"));
	}
}
