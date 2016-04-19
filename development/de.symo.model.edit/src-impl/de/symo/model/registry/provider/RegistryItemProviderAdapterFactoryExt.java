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
	public Adapter createMeasurementAdapter() {
		if (measurementItemProvider == null) {
			measurementItemProvider = new MeasurementItemProviderExt(this);
		}
		return measurementItemProvider;
	}
	
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProviderExt(this);
		}
		return parameterItemProvider;
	}
	
	@Override
	public Adapter createRegistryAdapter() {
		if (registryItemProvider == null) {
			registryItemProvider = new RegistryItemProviderExt(this);
		}
		return registryItemProvider;
	}
	
	@Override
	public Adapter createStereotypeAdapter() {
		if (stereotypeItemProvider == null) {
			stereotypeItemProvider = new StereotypeItemProviderExt(this);
		}
		return stereotypeItemProvider;
	}

	@Override
	public Adapter createUnitRefAdapter() {
		if (unitRefItemProvider==null) {
			unitRefItemProvider = new UnitRefItemProviderExt(this);
		}
		return unitRefItemProvider;
 	}
}
