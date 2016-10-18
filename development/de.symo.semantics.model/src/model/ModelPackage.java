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
	 * The meta object id for the '{@link model.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.OntologyImpl
	 * @see model.impl.ModelPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__PATH = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__FILE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Maintenance File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__MAINTENANCE_FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__LIBRARY = 3;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__PATH = ONTOLOGY__PATH;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__FILE_NAME = ONTOLOGY__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Maintenance File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__MAINTENANCE_FILE_NAME = ONTOLOGY__MAINTENANCE_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__LIBRARY = ONTOLOGY__LIBRARY;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__URL = ONTOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__USERNAME = ONTOLOGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY__PASSWORD = ONTOLOGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ontology Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY_FEATURE_COUNT = ONTOLOGY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ontology Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_REPOSITORY_OPERATION_COUNT = ONTOLOGY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Ontologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY__ONTOLOGIES = 0;

	/**
	 * The feature id for the '<em><b>Active Ontology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY = 1;

	/**
	 * The number of structural features of the '<em>Ontology Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LIBRARY_FEATURE_COUNT = 2;

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
	 * Returns the meta object for class '{@link model.OntologyLibrary <em>Ontology Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Library</em>'.
	 * @see model.OntologyLibrary
	 * @generated
	 */
	EClass getOntologyLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link model.OntologyLibrary#getOntologies <em>Ontologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontologies</em>'.
	 * @see model.OntologyLibrary#getOntologies()
	 * @see #getOntologyLibrary()
	 * @generated
	 */
	EReference getOntologyLibrary_Ontologies();

	/**
	 * Returns the meta object for the reference '{@link model.OntologyLibrary#getActiveOntology <em>Active Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Ontology</em>'.
	 * @see model.OntologyLibrary#getActiveOntology()
	 * @see #getOntologyLibrary()
	 * @generated
	 */
	EReference getOntologyLibrary_ActiveOntology();

	/**
	 * Returns the meta object for class '{@link model.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see model.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the attribute '{@link model.Ontology#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see model.Ontology#getPath()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_Path();

	/**
	 * Returns the meta object for the attribute '{@link model.Ontology#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see model.Ontology#getFileName()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_FileName();

	/**
	 * Returns the meta object for the attribute '{@link model.Ontology#getMaintenanceFileName <em>Maintenance File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintenance File Name</em>'.
	 * @see model.Ontology#getMaintenanceFileName()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_MaintenanceFileName();

	/**
	 * Returns the meta object for the container reference '{@link model.Ontology#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see model.Ontology#getLibrary()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Library();

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
		 * The meta object literal for the '{@link model.impl.OntologyLibraryImpl <em>Ontology Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OntologyLibraryImpl
		 * @see model.impl.ModelPackageImpl#getOntologyLibrary()
		 * @generated
		 */
		EClass ONTOLOGY_LIBRARY = eINSTANCE.getOntologyLibrary();

		/**
		 * The meta object literal for the '<em><b>Ontologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_LIBRARY__ONTOLOGIES = eINSTANCE.getOntologyLibrary_Ontologies();

		/**
		 * The meta object literal for the '<em><b>Active Ontology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY = eINSTANCE.getOntologyLibrary_ActiveOntology();

		/**
		 * The meta object literal for the '{@link model.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OntologyImpl
		 * @see model.impl.ModelPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__PATH = eINSTANCE.getOntology_Path();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__FILE_NAME = eINSTANCE.getOntology_FileName();

		/**
		 * The meta object literal for the '<em><b>Maintenance File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__MAINTENANCE_FILE_NAME = eINSTANCE.getOntology_MaintenanceFileName();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__LIBRARY = eINSTANCE.getOntology_Library();

	}

} //ModelPackage
