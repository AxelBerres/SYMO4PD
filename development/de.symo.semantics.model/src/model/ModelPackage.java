/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.symo.semantics/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.OntologyRepositoryImpl <em>Ontology Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.OntologyRepositoryImpl
	 * @see model.impl.ModelPackageImpl#getOntologyRepository()
	 * @generated
	 */
	int ONTOLOGY_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__URL = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__ONTOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Maintenance Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY = 5;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__LIBRARY = 6;

	/**
	 * The number of structural features of the '<em>Ontology Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Ontology Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.OntologyLibraryImpl <em>Ontology Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.OntologyLibraryImpl
	 * @see model.impl.ModelPackageImpl#getOntologyLibrary()
	 * @generated
	 */
	int ONTOLOGY_LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY__REPOSITORIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Active Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Ontology Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ontology Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.OntologyRepository <em>Ontology Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Repository</em>'.
	 * @see model.OntologyRepository
	 * @generated
	 */
	EClass getOntologyRepository();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyRepository#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see model.OntologyRepository#getURL()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EAttribute getOntologyRepository_URL();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyRepository#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see model.OntologyRepository#getUsername()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EAttribute getOntologyRepository_Username();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyRepository#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see model.OntologyRepository#getPassword()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EAttribute getOntologyRepository_Password();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyRepository#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see model.OntologyRepository#isActive()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EAttribute getOntologyRepository_Active();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyRepository#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology</em>'.
	 * @see model.OntologyRepository#getOntology()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EAttribute getOntologyRepository_Ontology();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyRepository#getMaintenanceOntology <em>Maintenance Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintenance Ontology</em>'.
	 * @see model.OntologyRepository#getMaintenanceOntology()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EAttribute getOntologyRepository_MaintenanceOntology();

	/**
	 * Returns the meta object for the container reference '{@link model.OntologyRepository#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see model.OntologyRepository#getLibrary()
	 * @see #getOntologyRepository()
	 * @generated
	 */
	EReference getOntologyRepository_Library();

	/**
	 * Returns the meta object for class '{@link model.OntologyLibrary <em>Ontology Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Library</em>'.
	 * @see model.OntologyLibrary
	 * @generated
	 */
	EClass getOntologyLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link model.OntologyLibrary#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see model.OntologyLibrary#getRepositories()
	 * @see #getOntologyLibrary()
	 * @generated
	 */
	EReference getOntologyLibrary_Repositories();

	/**
	 * Returns the meta object for the attribute '{@link model.OntologyLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.OntologyLibrary#getName()
	 * @see #getOntologyLibrary()
	 * @generated
	 */
	EAttribute getOntologyLibrary_Name();

	/**
	 * Returns the meta object for the reference '{@link model.OntologyLibrary#getActiveRepository <em>Active Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Repository</em>'.
	 * @see model.OntologyLibrary#getActiveRepository()
	 * @see #getOntologyLibrary()
	 * @generated
	 */
	EReference getOntologyLibrary_ActiveRepository();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.OntologyRepositoryImpl <em>Ontology Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OntologyRepositoryImpl
		 * @see model.impl.ModelPackageImpl#getOntologyRepository()
		 * @generated
		 */
		EClass ONTOLOGY_REPOSITORY = eINSTANCE.getOntologyRepository();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_REPOSITORY__URL = eINSTANCE.getOntologyRepository_URL();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_REPOSITORY__USERNAME = eINSTANCE.getOntologyRepository_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_REPOSITORY__PASSWORD = eINSTANCE.getOntologyRepository_Password();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_REPOSITORY__ACTIVE = eINSTANCE.getOntologyRepository_Active();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_REPOSITORY__ONTOLOGY = eINSTANCE.getOntologyRepository_Ontology();

		/**
		 * The meta object literal for the '<em><b>Maintenance Ontology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY = eINSTANCE.getOntologyRepository_MaintenanceOntology();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_REPOSITORY__LIBRARY = eINSTANCE.getOntologyRepository_Library();

		/**
		 * The meta object literal for the '{@link model.impl.OntologyLibraryImpl <em>Ontology Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OntologyLibraryImpl
		 * @see model.impl.ModelPackageImpl#getOntologyLibrary()
		 * @generated
		 */
		EClass ONTOLOGY_LIBRARY = eINSTANCE.getOntologyLibrary();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_LIBRARY__REPOSITORIES = eINSTANCE.getOntologyLibrary_Repositories();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_LIBRARY__NAME = eINSTANCE.getOntologyLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Active Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY = eINSTANCE.getOntologyLibrary_ActiveRepository();

	}

} //ModelPackage
