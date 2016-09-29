package de.symo.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.symo.ontology.repository.RepositoryManager;

public class Activator implements BundleActivator {

	public static RepositoryManager repositoryManager; 
	
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		repositoryManager = new RepositoryManager();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}
