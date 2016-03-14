package de.symo.model.base.provider;

import org.eclipse.emf.common.notify.Adapter;

public class BaseItemProviderAdapterFactoryExt extends  BaseItemProviderAdapterFactory {

	@Override
	public Adapter createValueAdapter() {
		if (valueItemProvider == null) {
			valueItemProvider = new ValueItemProviderExt(this);
		}

		return valueItemProvider;
	}
}
