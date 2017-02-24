package de.symo.adasi;

import java.io.File;
import java.util.Observable;

import de.symo.service.ISymoModelService;
import de.symo.service.modeleditor.event.BasicModelOperationEventArguments;
import oida.bridge.observerservice.emf.EMFModelObserverService;
import oida.ontology.manager.IOntologyManager;
import oida.ontology.manager.OntologyManagerException;
import oida.ontology.service.IOIDAOntologyService;
import oida.ontologyMgr.OntologyFile;
import oida.util.OIDAUtil;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-01-10
 */
public class AdapterOfSatori implements IAdapterOfSatori {
	private final String MODELONTOLOGY_SUBDIRECTORY = "\\ont";
	private final String OWL_POSTFIX = ".owl";

	private static AdapterOfSatori instance;

	public static AdapterOfSatori getInstance() {
		if (instance == null)
			instance = new AdapterOfSatori();

		return instance;
	}

	private ISymoModelService modelService;
	private IOIDAOntologyService oidaService;
	private EMFModelObserverService oidaBridge;

	private AdapterOfSatori() {
	}

	public void initialize(ISymoModelService modelService, IOIDAOntologyService oidaService, EMFModelObserverService oidaBridge) {
		this.modelService = modelService;
		this.oidaService = oidaService;
		this.oidaBridge = oidaBridge;

		this.modelService.registerModelObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		BasicModelOperationEventArguments operationArgs = (BasicModelOperationEventArguments)arg;
		System.out.println(operationArgs.getOperation().toString() + ": " + operationArgs.getNewEObject().toString());

		switch (operationArgs.getOperation()) {
		case OPEN:
			if (!checkAndCreateModelOntologySubdirectory(operationArgs.getModelPath())) {
				System.out.println("ADASI: Model Ontology directory does not exist and could not be created.");
			} else {
				try {
					OntologyFile modelOntologyfile = OIDAUtil.getOntologyFile(new File(operationArgs.getModelPath() + MODELONTOLOGY_SUBDIRECTORY + operationArgs.getModelFileName() + OWL_POSTFIX));
					IOntologyManager modelOntologyManager = oidaService.getOntologyManager(modelOntologyfile, false);
					
					if (modelOntologyManager == null) {
						modelOntologyManager = oidaService.getOntologyManager(modelOntologyfile, true);
						modelOntologyManager.addImportDeclaration(oidaService.getMereology().getOntology());
					}
					
					oidaBridge.addEMFModelForObservation(operationArgs.getNewEObject(), modelOntologyManager);
				} catch (OntologyManagerException e) {
					e.printStackTrace();
				}
			}
			break;
		case REMOVE:
			break;
		default:
			break;
		}
	}

	private boolean checkAndCreateModelOntologySubdirectory(String modelPath) {
		File modelDirectory = new File(modelPath);

		if (!modelDirectory.exists() || !modelDirectory.isDirectory())
			return false;

		File modelOntologyDirectory = new File(modelPath + MODELONTOLOGY_SUBDIRECTORY);
		if (!modelOntologyDirectory.exists()) {
			return modelOntologyDirectory.mkdir();
		}

		return true;
	}
}
