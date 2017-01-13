package de.symo.service.modeleditor.event;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-09-01
 * 
 */
public class BasicModelOperationEventArguments {
	private ModelOperation operation;
	private String modelPath;
	private String modelFileName;
	private EObject newEObject;
	
	public ModelOperation getOperation() {
		return operation;
	}

	public void setOperation(ModelOperation operation) {
		this.operation = operation;
	}
	
	public String getModelPath() {
		return modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}
	
	public String getModelFileName() {
		return modelFileName;
	}

	public void setModelFileName(String modelFileName) {
		this.modelFileName = modelFileName;
	}

	public EObject getNewEObject() {
		return newEObject;
	}

	public void setNewEObject(EObject newEObject) {
		this.newEObject = newEObject;
	}

	public BasicModelOperationEventArguments() {
	}
	
	public BasicModelOperationEventArguments(EObject newEObject, ModelOperation operation, String modelPath, String modelFileName) {
		setNewEObject(newEObject);
		setOperation(operation);
		setModelPath(modelPath);
		setModelFileName(modelFileName);
	}
}
