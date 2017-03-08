package de.symo.adasi;

import org.eclipse.e4.core.di.InjectorFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@SuppressWarnings("restriction")
	@Override
	public void start(BundleContext context) throws Exception {
		InjectorFactory.getDefault().addBinding(IAdapterOfSatori.class).implementedBy(AdapterOfSatori.class);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}
}