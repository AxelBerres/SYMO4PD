package de.symo.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		context.registerService(ISymoModelService.class.getName(), SymoModelService.getInstance(), null);
		System.out.println("SYMO4PD Model Service: Service registered.");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
