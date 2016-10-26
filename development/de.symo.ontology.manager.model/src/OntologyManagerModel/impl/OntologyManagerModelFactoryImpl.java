/**
 */
package OntologyManagerModel.impl;

import OntologyManagerModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologyManagerModelFactoryImpl extends EFactoryImpl implements OntologyManagerModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntologyManagerModelFactory init() {
		try {
			OntologyManagerModelFactory theOntologyManagerModelFactory = (OntologyManagerModelFactory)EPackage.Registry.INSTANCE.getEFactory(OntologyManagerModelPackage.eNS_URI);
			if (theOntologyManagerModelFactory != null) {
				return theOntologyManagerModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntologyManagerModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyManagerModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OntologyManagerModelPackage.LIBRARY: return createLibrary();
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY: return createOntologyEntry();
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY: return createOntologyRepoEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyEntry createOntologyEntry() {
		OntologyEntryImpl ontologyEntry = new OntologyEntryImpl();
		return ontologyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyRepoEntry createOntologyRepoEntry() {
		OntologyRepoEntryImpl ontologyRepoEntry = new OntologyRepoEntryImpl();
		return ontologyRepoEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyManagerModelPackage getOntologyManagerModelPackage() {
		return (OntologyManagerModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntologyManagerModelPackage getPackage() {
		return OntologyManagerModelPackage.eINSTANCE;
	}

} //OntologyManagerModelFactoryImpl
