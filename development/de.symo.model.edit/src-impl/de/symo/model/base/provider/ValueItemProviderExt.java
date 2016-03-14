package de.symo.model.base.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class ValueItemProviderExt extends ValueItemProvider {

	public ValueItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/obj16/Value.gif"));
	}
}

