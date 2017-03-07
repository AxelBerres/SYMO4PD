package de.symo.adasi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.symo.service.SymoModelService;
import oida.bridge.service.OIDABridge;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		AdapterOfSatori.getInstance().initialize(SymoModelService.getInstance(), OIDABridge.getInstance());

		context.registerService(IAdapterOfSatori.class.getName(), AdapterOfSatori.getInstance(), null);
		System.out.println("SYMO4PD ADASI: Service registered.");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}
}