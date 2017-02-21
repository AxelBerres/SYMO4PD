package de.symo.oida.changehandler;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.symo.model.base.ANameItem;
import de.symo.model.symo.ProjectRepository;
import de.symo.oida.changehandler.modelhelper.Extractor;
import de.symo.oida.changehandler.modelhelper.ModelProviderHelper;
import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;
import oida.bridge.observerservice.changehandler.AbstractChangeHandler;
import oida.ontology.OntologyClass;
import oida.ontology.OntologyEntity;
import oida.ontology.OntologyIndividual;
import oida.ontology.manager.IOntologyManager;
import oida.ontology.manager.OntologyManagerException;

/**
 * 
 * @author Martin Glas, Michael Shamiyeh
 * @since 2017-01-20
 *
 */
public class SymoChangeHandler extends AbstractChangeHandler {
	private final String SYMO_MODELONT_NS = "http://symo.local.";
	private final String MODELONT_PREFIX = "modont";

	private HashMap<EObject, OntologyEntity> emfToOntologyMap = new HashMap<EObject, OntologyEntity>();

	public SymoChangeHandler() {
	}

	@Override
	public void initializeModelOntology(EObject modelContainer, IOntologyManager ontManager) {
		emfToOntologyMap.clear();

		generateLocalNamespace(ontManager);
		generateOntologyClasses(modelContainer, ontManager);
		generateIndividuals(modelContainer, ontManager);

		try {
			ontManager.saveOntology();
		} catch (OntologyManagerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void handleAdd(Notification notification, IOntologyManager ontManager) {
		if (notification.getNewValue() instanceof EObject) {
			EObject newEObject = (EObject)notification.getNewValue();

			OntologyClass oCl = generateOntologyClassWithHierarchy(newEObject.eClass(), ontManager);
			generateOntologyIndividualOfClass(newEObject, oCl, ontManager);
			// EObject rootContainer = ModelHelper.getRootContainer(newEObject);
		}
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
			EObject notifier = (EObject)notification.getNotifier();

			OntologyIndividual oIn = (OntologyIndividual)emfToOntologyMap.get(notifier);
			ontManager.renameEntity(oIn, ((ANameItem)notifier).getName());
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
		String filePath = ontologyManager.getOntology().getOntologyFile().getPath();

		namespace = namespace + filePath.substring(ProjectBrowserPart.getProjectRoot().getAbsolutePath().length() + 1);
		namespace = namespace.replace("\\", ".");
		namespace = namespace.substring(0, namespace.lastIndexOf(".ont."));

		if (!ontologyManager.isNamespaceExisting(MODELONT_PREFIX))
			ontologyManager.addNamespace(MODELONT_PREFIX, namespace);
	}

	private OntologyClass generateOntologyClassWithHierarchy(EClass eClass, IOntologyManager ontologyManager) {
		if (!emfToOntologyMap.containsKey(eClass)) {
			OntologyClass oCl = ontologyManager.createClass(eClass.getName(), MODELONT_PREFIX);
			emfToOntologyMap.put(eClass, oCl);

			for (EClass superClass : eClass.getESuperTypes()) {
				OntologyClass superOCl = generateOntologyClassWithHierarchy(superClass, ontologyManager);
				ontologyManager.assignSubClassToSuperClass(oCl, superOCl);
			}

			return oCl;
		} else
			return (OntologyClass)emfToOntologyMap.get(eClass);
	}

	private OntologyIndividual generateOntologyIndividualOfClass(EObject eObject, OntologyClass ontologyClass, IOntologyManager ontologyManager) {
		if (!emfToOntologyMap.containsKey(eObject)) {
			OntologyIndividual oIn = ontologyManager.createIndividualOfClass(ModelProviderHelper.getModelElementName(eObject), MODELONT_PREFIX, ontologyClass);
			emfToOntologyMap.put(eObject, oIn);
			return oIn;
		} else
			return (OntologyIndividual)emfToOntologyMap.get(eObject);
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
			emfToOntologyMap.put(eClass, oCl);

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

	/**
	 * This method extracts instances as individuals in the tree under a given
	 * EObject.
	 */
	public void generateIndividuals(EObject rootEObject, IOntologyManager ontologyManager) {
		List<EObject> comprisedEObjects = Extractor.getInstanceEObjects(rootEObject);

		// Create Individuals
		for (EObject eObject : comprisedEObjects) {
			OntologyClass oCl = (OntologyClass)emfToOntologyMap.get(eObject.eClass());

			OntologyIndividual oIn;
			if (eObject instanceof ProjectRepository)
				oIn = ontologyManager.createIndividualOfClass("ProjectRepository", MODELONT_PREFIX, oCl);
			else
				oIn = ontologyManager.createIndividualOfClass(ModelProviderHelper.getModelElementName(eObject), MODELONT_PREFIX, oCl);

			emfToOntologyMap.put(eObject, oIn);

			System.out.println("Individual created: '" + oIn.getName() + "'.");
		}
	}
	//
	// // Create properties between individuals
	// for (EObject eObject : comprisedEObjects) {
	//
	// URI individualURI = OntologyHelper.generateURI(targetOntology,
	// renamer.getEObjectName(eObject));
	//
	// for (EStructuralFeature eStructuralFeature : eObject.eClass()
	// .getEAllStructuralFeatures()) {
	//
	// if (eStructuralFeature instanceof EReference) {
	// EReference eReference = (EReference) eStructuralFeature;
	//
	// URI objectPropertyURI = OntologyHelper.generateURI(
	// targetOntology,
	// renamer.getEStructuralFeatureName(eReference));
	// Object referenceTargetObject = eObject.eGet(eReference);
	// // Handle reference with cardinality greater 1
	// if (referenceTargetObject instanceof EList) {
	// @SuppressWarnings("unchecked")
	// EList<EObject> referenceObjectList = (EList<EObject>)
	// referenceTargetObject;
	// for (EObject targetEObject : referenceObjectList) {
	// URI targetIndividualURI = OntologyHelper
	// .generateURI(targetOntology, renamer
	// .getEObjectName(targetEObject));
	//
	// ontologyModel.addObjectPropertyInstance(
	// individualURI, objectPropertyURI,
	// targetIndividualURI);
	//
	// }
	// }
	// // Handle reference with cardinality 1
	// else if (referenceTargetObject instanceof EObject) {
	// EObject referenceEObject = (EObject) referenceTargetObject;
	// URI targetIndividualURI = OntologyHelper.generateURI(
	// targetOntology,
	// renamer.getEObjectName(referenceEObject));
	//
	// ontologyModel.addObjectPropertyInstance(individualURI,
	// objectPropertyURI, targetIndividualURI);
	//
	// }
	// }
	// // Handle attribute
	// else if (eStructuralFeature instanceof EAttribute) {
	// EAttribute eAttribute = (EAttribute) eStructuralFeature;
	// Object eAttributeValue = "";
	// if (eObject.eGet(eAttribute) != null) {
	// eAttributeValue = eObject.eGet(eAttribute);
	// }
	//
	// URI datatypePropertyURI = OntologyHelper.generateURI(
	// targetOntology,
	// renamer.getEStructuralFeatureName(eAttribute));
	//
	// Literal literal = ontologyModel.getOntologyModel()
	// .createTypedLiteral(eAttributeValue);
	// // ontologyModel.addDatatypePropertyInstance(individualURI,
	// // datatypePropertyURI, eAttributeValue);
	// ontologyModel.addDatatypePropertyInstance(individualURI,
	// datatypePropertyURI, literal);
	//
	// }
	//
	// }
	//
	// }
	//
	// }
}
