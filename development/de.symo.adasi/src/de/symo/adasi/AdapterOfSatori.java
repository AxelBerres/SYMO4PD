package de.symo.adasi;

import java.io.File;
import java.util.Observable;

import de.symo.service.ISymoModelService;
import de.symo.service.modeleditor.event.BasicModelOperationEventArguments;
import oida.bridge.service.IOIDABridge;
import oida.bridge.service.OIDABridgeException;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-01-10
 */
public class AdapterOfSatori implements IAdapterOfSatori {
	private final String MODELONTOLOGY_SUBDIRECTORY = "\\ont";
	private final String OWL_POSTFIX = ".owl";

	private ISymoModelService modelService;
	private IOIDABridge oidaBridge;

	private static AdapterOfSatori instance;

	public static AdapterOfSatori getInstance() {
		if (instance == null)
			instance = new AdapterOfSatori();

		return instance;
	}
	
	private AdapterOfSatori() {
	}

	public void initialize(ISymoModelService modelService, IOIDABridge oidaBridge) {
		this.modelService = modelService;
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
					oidaBridge.addChangeHandler(operationArgs.getNewEObject(), new File(operationArgs.getModelPath() + MODELONTOLOGY_SUBDIRECTORY + operationArgs.getModelFileName() + OWL_POSTFIX));
				} catch (OIDABridgeException e) {
					e.printStackTrace();
				}
			}
			break;
		case REMOVE:
			System.out.println("ADASI TODO: Remove OIDA Model Ontology!");
			break;
		case SAVE:
			oidaBridge.saveModelOntology(operationArgs.getNewEObject());
			break;
		case CLOSE:
			oidaBridge.removeChangeHandler(operationArgs.getNewEObject());
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
