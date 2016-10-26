/**
 */
package OntologyManagerModel.impl;

import OntologyManagerModel.OntologyEntry;
import OntologyManagerModel.OntologyManagerModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OntologyManagerModel.impl.OntologyEntryImpl#getPath <em>Path</em>}</li>
 *   <li>{@link OntologyManagerModel.impl.OntologyEntryImpl#getFile <em>File</em>}</li>
 *   <li>{@link OntologyManagerModel.impl.OntologyEntryImpl#getMaintenanceFile <em>Maintenance File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyEntryImpl extends MinimalEObjectImpl.Container implements OntologyEntry {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintenanceFile() <em>Maintenance File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceFile()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTENANCE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintenanceFile() <em>Maintenance File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceFile()
	 * @generated
	 * @ordered
	 */
	protected String maintenanceFile = MAINTENANCE_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologyManagerModelPackage.Literals.ONTOLOGY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyManagerModelPackage.ONTOLOGY_ENTRY__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyManagerModelPackage.ONTOLOGY_ENTRY__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintenanceFile() {
		return maintenanceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceFile(String newMaintenanceFile) {
		String oldMaintenanceFile = maintenanceFile;
		maintenanceFile = newMaintenanceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyManagerModelPackage.ONTOLOGY_ENTRY__MAINTENANCE_FILE, oldMaintenanceFile, maintenanceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__PATH:
				return getPath();
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__FILE:
				return getFile();
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__MAINTENANCE_FILE:
				return getMaintenanceFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__PATH:
				setPath((String)newValue);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__FILE:
				setFile((String)newValue);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__MAINTENANCE_FILE:
				setMaintenanceFile((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__MAINTENANCE_FILE:
				setMaintenanceFile(MAINTENANCE_FILE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case OntologyManagerModelPackage.ONTOLOGY_ENTRY__MAINTENANCE_FILE:
				return MAINTENANCE_FILE_EDEFAULT == null ? maintenanceFile != null : !MAINTENANCE_FILE_EDEFAULT.equals(maintenanceFile);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(", file: ");
		result.append(file);
		result.append(", maintenanceFile: ");
		result.append(maintenanceFile);
		result.append(')');
		return result.toString();
	}

} //OntologyEntryImpl
