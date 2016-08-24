package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.symo.model.element.provider.UnitItemProvider;

public class UnitRefItemProviderExt extends UnitItemProvider {

	public UnitRefItemProviderExt(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
//	@Override
//	public Object getImage(Object object) {
//		return overlayImage(object, getResourceLocator().getImage("custom/obj16/siUnitRef.png"));
//	}
}
