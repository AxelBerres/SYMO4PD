package de.symo.model.registry.provider;

import org.eclipse.emf.common.notify.Adapter;

public class RegistryItemProviderAdapterFactoryExt extends RegistryItemProviderAdapterFactory {

	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProviderExt(this);
		}
		return constantItemProvider;
	}
		
	@Override
	public Adapter createRegistryAdapter() {
		if (registryItemProvider == null) {
			registryItemProvider = new RegistryItemProviderExt(this);
		}
		return registryItemProvider;
	}	
}
