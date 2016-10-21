/**
 */
package OntologyManagerModel;

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
 * @see OntologyManagerModel.OntologyManagerModelFactory
 * @model kind="package"
 * @generated
 */
public interface OntologyManagerModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OntologyManagerModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/OntologyManagerModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OntologyManagerModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntologyManagerModelPackage eINSTANCE = OntologyManagerModel.impl.OntologyManagerModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link OntologyManagerModel.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntologyManagerModel.impl.LibraryImpl
	 * @see OntologyManagerModel.impl.OntologyManagerModelPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Ontology Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ONTOLOGY_ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OntologyManagerModel.impl.OntologyEntryImpl <em>Ontology Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntologyManagerModel.impl.OntologyEntryImpl
	 * @see OntologyManagerModel.impl.OntologyManagerModelPackageImpl#getOntologyEntry()
	 * @generated
	 */
	int ONTOLOGY_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENTRY__PATH = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENTRY__FILE = 1;

	/**
	 * The feature id for the '<em><b>Maintenance File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENTRY__MAINTENANCE_FILE = 2;

	/**
	 * The number of structural features of the '<em>Ontology Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ontology Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENTRY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link OntologyManagerModel.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see OntologyManagerModel.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link OntologyManagerModel.Library#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see OntologyManagerModel.Library#getOwner()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Owner();

	/**
	 * Returns the meta object for the attribute '{@link OntologyManagerModel.Library#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see OntologyManagerModel.Library#getCreationDate()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link OntologyManagerModel.Library#getOntologyEntries <em>Ontology Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontology Entries</em>'.
	 * @see OntologyManagerModel.Library#getOntologyEntries()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_OntologyEntries();

	/**
	 * Returns the meta object for class '{@link OntologyManagerModel.OntologyEntry <em>Ontology Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Entry</em>'.
	 * @see OntologyManagerModel.OntologyEntry
	 * @generated
	 */
	EClass getOntologyEntry();

	/**
	 * Returns the meta object for the attribute '{@link OntologyManagerModel.OntologyEntry#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see OntologyManagerModel.OntologyEntry#getPath()
	 * @see #getOntologyEntry()
	 * @generated
	 */
	EAttribute getOntologyEntry_Path();

	/**
	 * Returns the meta object for the attribute '{@link OntologyManagerModel.OntologyEntry#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see OntologyManagerModel.OntologyEntry#getFile()
	 * @see #getOntologyEntry()
	 * @generated
	 */
	EAttribute getOntologyEntry_File();

	/**
	 * Returns the meta object for the attribute '{@link OntologyManagerModel.OntologyEntry#getMaintenanceFile <em>Maintenance File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintenance File</em>'.
	 * @see OntologyManagerModel.OntologyEntry#getMaintenanceFile()
	 * @see #getOntologyEntry()
	 * @generated
	 */
	EAttribute getOntologyEntry_MaintenanceFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntologyManagerModelFactory getOntologyManagerModelFactory();

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
		 * The meta object literal for the '{@link OntologyManagerModel.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntologyManagerModel.impl.LibraryImpl
		 * @see OntologyManagerModel.impl.OntologyManagerModelPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__OWNER = eINSTANCE.getLibrary_Owner();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__CREATION_DATE = eINSTANCE.getLibrary_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Ontology Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__ONTOLOGY_ENTRIES = eINSTANCE.getLibrary_OntologyEntries();

		/**
		 * The meta object literal for the '{@link OntologyManagerModel.impl.OntologyEntryImpl <em>Ontology Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntologyManagerModel.impl.OntologyEntryImpl
		 * @see OntologyManagerModel.impl.OntologyManagerModelPackageImpl#getOntologyEntry()
		 * @generated
		 */
		EClass ONTOLOGY_ENTRY = eINSTANCE.getOntologyEntry();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_ENTRY__PATH = eINSTANCE.getOntologyEntry_Path();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_ENTRY__FILE = eINSTANCE.getOntologyEntry_File();

		/**
		 * The meta object literal for the '<em><b>Maintenance File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_ENTRY__MAINTENANCE_FILE = eINSTANCE.getOntologyEntry_MaintenanceFile();

	}

} //OntologyManagerModelPackage
