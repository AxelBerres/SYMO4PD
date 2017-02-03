package de.symo.oida.changehandler;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.symo.model.base.ANameItem;
import de.symo.model.base.ModelHelper;
import de.symo.oida.changehandler.modelhelper.Extractor;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;
import oida.bridge.observerservice.changehandler.AbstractChangeHandler;
import oida.ontology.OntologyClass;
import oida.ontology.manager.IOntologyManager;

/**
 * 
 * @author Martin Glas, Michael Shamiyeh
 * @since 2017-01-20
 *
 */
public class SymoChangeHandler extends AbstractChangeHandler {
	private final String SYMO_MODELONT_NS = "http://symo.local.";
	private final String MODELONT_PREFIX = "modont";
	
	public SymoChangeHandler() {
	}

	@Override
	public void initializeModelOntology(EObject modelContainer, IOntologyManager ontManager) {
		generateLocalNamespace(ontManager);
		generateOntologyClasses(modelContainer, ontManager);
	}

	@Override
	public void handleAdd(Notification notification, IOntologyManager ontManager) {
		String newElementName = "";
		if (notification.getNewValue() instanceof ANameItem) {
			newElementName = ((ANameItem)notification.getNewValue()).getName();
		}
		System.out.println("Element " + newElementName + " has been created");

		// Get root container
		if (notification.getNewValue() instanceof EObject) {
			EObject newEObject = (EObject)notification.getNewValue();
			EObject rootContainer = ModelHelper.getRootContainer(newEObject);
			String modelOntologyName = ModelHelper.getElementName(rootContainer);
			String eClassName = newEObject.eClass().getName();
			String ePackageURI = newEObject.eClass().getEPackage().getNsURI();

			// GetOntologyManager
			// getOntologyManager().getClass(, ePackageURI)
			// GetClass named after the eClass of the eObject

			// GetOntology named after the root container
			// GetClass
		}

		// Get model ontology

		// Add element to root ontology
	}

	@Override
	public void handleAddMany(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleMove(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleNoIndex(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub
	}

	@Override
	public void handleRemove(Notification notification, IOntologyManager ontManager) {
		String removedElementName = "";
		if (notification.getNewValue() instanceof ANameItem) {
			removedElementName = ((ANameItem)notification.getNewValue()).getName();
		}
		System.out.println("Element" + removedElementName + " has been removed");
	}

	@Override
	public void handleRemoveMany(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub
	}

	@Override
	public void handleRemovingAdapter(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub
	}

	@Override
	public void handleResolve(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub
	}

	@Override
	public void handleSet(Notification notification, IOntologyManager ontManager) {
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
	public void handleUnset(Notification notification, IOntologyManager ontManager) {
		// TODO Auto-generated method stub
	}
	
	private void generateLocalNamespace(IOntologyManager ontologyManager) {
		String namespace = SYMO_MODELONT_NS;
		String filePath = ontologyManager.getOntology().getOntologyEntry().getPath();
		
		namespace = namespace + filePath.substring(ProjectBrowserPart.getProjectRoot().getAbsolutePath().length() + 1);		
		namespace = namespace.replace("\\", ".");
		namespace = namespace.substring(0, namespace.lastIndexOf(".ont."));
		
		ontologyManager.addNamespace(MODELONT_PREFIX, namespace);
	}
	
	/**
	 * This methods generates ontology classes representing model classes which
	 * have instance objects in the model.
	 */
	private void generateOntologyClasses(EObject rootEObject, IOntologyManager ontologyManager) {
		List<EClass> classesOfInstances = Extractor.getAllClassesOfInstanceEObjects(rootEObject);
		
		// Create all classes which have instances in the model
		for (EClass eClass : classesOfInstances) {
			OntologyClass oCl = ontologyManager.createClass(eClass.getName(), MODELONT_PREFIX);
			System.out.println("Class created: '" + oCl.getName() + "'.");
		}

		// Create taxonomy between classes
		for (EClass eClass : classesOfInstances) {
			if (!eClass.getESuperTypes().isEmpty()) {
				OntologyClass subClass = ontologyManager.getClass(eClass.getName(), MODELONT_PREFIX);
				
				for (EClass eSuperType : eClass.getESuperTypes()) {
					OntologyClass superClass = ontologyManager.getClass(eSuperType.getName(), MODELONT_PREFIX);
					
					if (!subClass.getSuperClasses().contains(superClass))
						ontologyManager.assignSubClassToSuperClass(subClass, superClass);
				}
			}
		}
	}

//	/**
//	 * This method extracts instances as individuals in the tree under a given
//	 * EObject.
//	 * 
//	 */
//	public void generateIndividuals() {
//
//		List<EObject> comprisedEObjects = extractor.getInstanceEObjects();
//
//		// Create Individuals
//		for (EObject eObject : comprisedEObjects) {
//
//			URI individualURI = OntologyHelper.generateURI(targetOntology,
//					renamer.getEObjectName(eObject));
//			if (!ontologyModel.containsIndividual(individualURI)) {
//				URI classURI = OntologyHelper.generateURI(targetOntology,
//						renamer.getEClassName(eObject.eClass()));
//				if (!ontologyModel.isClassExisting(classURI)) {
//					ontologyModel.addOntClass(classURI);
//				}
//				OntClass ontologyClass = ontologyModel
//						.getOntologyClass(classURI);
//				ontologyModel.addIndividual(individualURI, ontologyClass);
//
//			}
//		}
//
//		// Create properties between individuals
//		for (EObject eObject : comprisedEObjects) {
//
//			URI individualURI = OntologyHelper.generateURI(targetOntology,
//					renamer.getEObjectName(eObject));
//
//			for (EStructuralFeature eStructuralFeature : eObject.eClass()
//					.getEAllStructuralFeatures()) {
//
//				if (eStructuralFeature instanceof EReference) {
//					EReference eReference = (EReference) eStructuralFeature;
//
//					URI objectPropertyURI = OntologyHelper.generateURI(
//							targetOntology,
//							renamer.getEStructuralFeatureName(eReference));
//					Object referenceTargetObject = eObject.eGet(eReference);
//					// Handle reference with cardinality greater 1
//					if (referenceTargetObject instanceof EList) {
//						@SuppressWarnings("unchecked")
//						EList<EObject> referenceObjectList = (EList<EObject>) referenceTargetObject;
//						for (EObject targetEObject : referenceObjectList) {
//							URI targetIndividualURI = OntologyHelper
//									.generateURI(targetOntology, renamer
//											.getEObjectName(targetEObject));
//
//							ontologyModel.addObjectPropertyInstance(
//									individualURI, objectPropertyURI,
//									targetIndividualURI);
//
//						}
//					}
//					// Handle reference with cardinality 1
//					else if (referenceTargetObject instanceof EObject) {
//						EObject referenceEObject = (EObject) referenceTargetObject;
//						URI targetIndividualURI = OntologyHelper.generateURI(
//								targetOntology,
//								renamer.getEObjectName(referenceEObject));
//
//						ontologyModel.addObjectPropertyInstance(individualURI,
//								objectPropertyURI, targetIndividualURI);
//
//					}
//				}
//				// Handle attribute
//				else if (eStructuralFeature instanceof EAttribute) {
//					EAttribute eAttribute = (EAttribute) eStructuralFeature;
//					Object eAttributeValue = "";
//					if (eObject.eGet(eAttribute) != null) {
//						eAttributeValue = eObject.eGet(eAttribute);
//					}
//
//					URI datatypePropertyURI = OntologyHelper.generateURI(
//							targetOntology,
//							renamer.getEStructuralFeatureName(eAttribute));
//
//					Literal literal = ontologyModel.getOntologyModel()
//							.createTypedLiteral(eAttributeValue);
//					// ontologyModel.addDatatypePropertyInstance(individualURI,
//					// datatypePropertyURI, eAttributeValue);
//					ontologyModel.addDatatypePropertyInstance(individualURI,
//							datatypePropertyURI, literal);
//
//				}
//
//			}
//
//		}
//
//	}
}
