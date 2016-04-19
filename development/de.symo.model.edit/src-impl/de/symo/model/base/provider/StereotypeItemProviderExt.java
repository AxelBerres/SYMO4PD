package de.symo.model.base.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.base.provider.StereotypeItemProvider;

public class StereotypeItemProviderExt extends StereotypeItemProvider {

	public StereotypeItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Stereotype.gif"));
	}

}
