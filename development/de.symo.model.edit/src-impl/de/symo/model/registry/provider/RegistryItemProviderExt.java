package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class RegistryItemProviderExt extends RegistryItemProvider {

	public RegistryItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Registry.gif"));
	}

}
