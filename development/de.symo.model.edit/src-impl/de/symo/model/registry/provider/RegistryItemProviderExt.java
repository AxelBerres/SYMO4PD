package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.registry.Registry;

public class RegistryItemProviderExt extends RegistryItemProvider {

	public RegistryItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		
		Registry reg = (Registry) object;
		
		String label = reg.getName();
		String version = reg.getMetaModel();
		
		return label == null || label.length() == 0 ?
			getString("_UI_Registry_type") :
			getString("_UI_Registry_type") + " " + version + " > " + label;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Registry.png"));
	}

}
