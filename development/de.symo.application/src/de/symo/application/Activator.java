package de.symo.application;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.symo.adasi.AdapterOfSatori;
import de.symo.service.SymoModelService;
import oida.bridge.observerservice.emf.EMFModelObserverService;
import oida.ontology.service.OIDAOntologyService;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-01-12
 *
 */
public class Activator implements BundleActivator {
	
	@Override
	public void start(BundleContext context) throws Exception {
		AdapterOfSatori.getInstance().initialize(
				SymoModelService.getInstance(),
				OIDAOntologyService.getInstance(),
				EMFModelObserverService.getInstance());
	}

	@Override
	public void stop(BundleContext context) throws Exception {		
	}
}
