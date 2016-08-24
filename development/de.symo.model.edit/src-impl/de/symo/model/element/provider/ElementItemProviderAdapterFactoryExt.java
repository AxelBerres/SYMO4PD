package de.symo.model.element.provider;

import org.eclipse.emf.common.notify.Adapter;

import de.symo.model.element.provider.ParameterItemProviderExt;
import de.symo.model.element.provider.StereotypeItemProviderExt;
import de.symo.model.element.provider.ValueItemProviderExt;

public class ElementItemProviderAdapterFactoryExt extends  ElementItemProviderAdapterFactory {

	
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProviderExt(this);
		}
		return parameterItemProvider;
	}

	@Override
	public Adapter createStereotypeAdapter() {
		if (stereotypeItemProvider == null) {
			stereotypeItemProvider = new StereotypeItemProviderExt(this);
		}
		return stereotypeItemProvider;
	}

	@Override
	public Adapter createValueAdapter() {
		if (valueItemProvider == null) {
			valueItemProvider = new ValueItemProviderExt(this);
		}

		return valueItemProvider;
	}
	
	@Override
	public Adapter createMeasurementAdapter() {
		if (measurementItemProvider == null) {
			measurementItemProvider = new MeasurementItemProviderExt(this);
		}
		return measurementItemProvider;
	}
}
