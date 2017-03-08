package de.symo.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.ecore.EObject;

import de.symo.model.service.modeleditor.event.BasicModelOperationEventArguments;
import de.symo.model.service.modeleditor.event.ModelOperation;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-09-01
 * 
 */
@Creatable
@Singleton
public class SymoModelService extends Observable implements ISymoModelService {
	private List<Observer> registeredModelObservers = new ArrayList<Observer>();

	public SymoModelService() {
		System.out.println("SYMO4PD Model Service: Initialized.");
	}
	
	@Override
	public void reportModelOpenedEvent(EObject obj, String modelPath, String fileName) {
		for (Observer modelObserver : registeredModelObservers)
			modelObserver.update(this, new BasicModelOperationEventArguments(obj, ModelOperation.OPEN, modelPath, fileName));
	}
	
	@Override
	public void reportModelCreatedEvent(EObject obj, String modelPath, String fileName) {
		for (Observer modelObserver : registeredModelObservers)
			modelObserver.update(this, new BasicModelOperationEventArguments(obj, ModelOperation.CREATE, modelPath, fileName));
	}
	
	@Override
	public void reportModelSavedEvent(EObject obj, String modelPath, String fileName) {
		for (Observer modelObserver : registeredModelObservers)
			modelObserver.update(this, new BasicModelOperationEventArguments(obj, ModelOperation.SAVE, modelPath, fileName));
	}
	
	@Override
	public void reportModelClosedEvent(EObject obj, String modelPath, String fileName) {
		for (Observer modelObserver : registeredModelObservers)
			modelObserver.update(this, new BasicModelOperationEventArguments(obj, ModelOperation.CLOSE, modelPath, fileName));
	}
	
	@Override
	public void registerModelObserver(Observer o) {
		registeredModelObservers.add(o);
		System.out.println("SYMO4PD Model Service: Model Observer registered: " + o.toString());
	}
	
	@Override
	public void deRegisterModelObserver(Observer o) {
		registeredModelObservers.remove(o);
	}
}
