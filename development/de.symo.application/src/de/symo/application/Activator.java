package de.symo.application;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.symo.adasi.AdapterOfSatori;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-01-12
 *
 */
public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		AdapterOfSatori.getInstance();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
