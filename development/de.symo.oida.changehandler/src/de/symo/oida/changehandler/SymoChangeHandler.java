package de.symo.oida.changehandler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.symo.model.base.ANameItem;
import de.symo.model.base.ModelHelper;
import oida.bridge.observerservice.changehandler.AbstractChangeHandler;

/**
 * 
 * @author Martin Glas, Michael Shamiyeh
 * @since 2017-01-20
 *
 */
public class SymoChangeHandler extends AbstractChangeHandler {

	public SymoChangeHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleAdd(Notification notification) {
		String newElementName = "";
		if (notification.getNewValue() instanceof ANameItem) {
			newElementName = ((ANameItem)notification.getNewValue()).getName();
		}
		System.out.println("Element " + newElementName + " has been created");

		// Get root container
		if (notification.getNewValue() instanceof EObject) {
			EObject rootContainer = ModelHelper.getRootContainer((EObject)notification.getNewValue());
			String ModelOntologyName = ModelHelper.getElementName(rootContainer);

			// GetModelManager
			// GetClass named after the eClass of the eObject

			// GetOntology named after the root container
			// GetClass
		}

		// Get model ontology

		// Add element to root ontology
	}

	@Override
	public void handleAddMany(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleMove(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleNoIndex(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleRemove(Notification notification) {
		String removedElementName = "";
		if (notification.getNewValue() instanceof ANameItem) {
			removedElementName = ((ANameItem)notification.getNewValue()).getName();
		}
		System.out.println("Element" + removedElementName + " has been removed");
	}

	@Override
	public void handleRemoveMany(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleRemovingAdapter(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleResolve(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleSet(Notification notification) {
		String featureName = "";
		String changedElementName = "";
		String oldValue = "";
		String newValue = "";
		if (notification.getFeature() instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature)notification.getFeature());
			featureName = feature.getName();
		}
		if (notification.getNotifier() instanceof ANameItem) {
			changedElementName = ((ANameItem)notification.getNotifier()).getName();
		}
		if (notification.getOldValue() != null) {
			oldValue = notification.getOldValue().toString();
		}
		if (notification.getNewValue() != null) {
			newValue = notification.getNewValue().toString();
		}

		System.out.println("Attribute " + featureName + " of Element " + changedElementName + " has been changed from " + oldValue + " to " + newValue);
	}

	@Override
	public void handleUnset(Notification notification) {
		// TODO Auto-generated method stub
		
	}
}
