package de.symo.model.service;

import org.eclipse.e4.core.di.InjectorFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		InjectorFactory.getDefault().addBinding(ISymoModelService.class).implementedBy(SymoModelService.class);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
