package de.symo.service;

import java.util.Observer;

import org.eclipse.emf.ecore.EObject;

public interface ISymoModelService {
	void reportModelOpenedEvent(EObject obj, String modelPath, String fileName);
	void reportModelCreatedEvent(EObject obj, String modelPath, String fileName);
	void reportModelSavedEvent(EObject obj, String modelPath, String fileName);
	void registerModelObserver(Observer o);
	void deRegisterModelObserver(Observer o);
}
