/**
 */
package model.impl;

import model.ModelPackage;
import model.OntologyLibrary;
import model.OntologyRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.OntologyRepositoryImpl#getURL <em>URL</em>}</li>
 *   <li>{@link model.impl.OntologyRepositoryImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link model.impl.OntologyRepositoryImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link model.impl.OntologyRepositoryImpl#isActive <em>Active</em>}</li>
 *   <li>{@link model.impl.OntologyRepositoryImpl#getOntology <em>Ontology</em>}</li>
 *   <li>{@link model.impl.OntologyRepositoryImpl#getMaintenanceOntology <em>Maintenance Ontology</em>}</li>
 *   <li>{@link model.impl.OntologyRepositoryImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyRepositoryImpl extends MinimalEObjectImpl.Container implements OntologyRepository {
	/**
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOntology() <em>Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntology() <em>Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected String ontology = ONTOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintenanceOntology() <em>Maintenance Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceOntology()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTENANCE_ONTOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintenanceOntology() <em>Maintenance Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceOntology()
	 * @generated
	 * @ordered
	 */
	protected String maintenanceOntology = MAINTENANCE_ONTOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ONTOLOGY_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURL() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURL(String newURL) {
		String oldURL = url;
		url = newURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__URL, oldURL, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOntology() {
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntology(String newOntology) {
		String oldOntology = ontology;
		ontology = newOntology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__ONTOLOGY, oldOntology, ontology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintenanceOntology() {
		return maintenanceOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceOntology(String newMaintenanceOntology) {
		String oldMaintenanceOntology = maintenanceOntology;
		maintenanceOntology = newMaintenanceOntology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY, oldMaintenanceOntology, maintenanceOntology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyLibrary getLibrary() {
		if (eContainerFeatureID() != ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY) return null;
		return (OntologyLibrary)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(OntologyLibrary newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(OntologyLibrary newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES, OntologyLibrary.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((OntologyLibrary)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				return basicSetLibrary(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES, OntologyLibrary.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ONTOLOGY_REPOSITORY__URL:
				return getURL();
			case ModelPackage.ONTOLOGY_REPOSITORY__USERNAME:
				return getUsername();
			case ModelPackage.ONTOLOGY_REPOSITORY__PASSWORD:
				return getPassword();
			case ModelPackage.ONTOLOGY_REPOSITORY__ACTIVE:
				return isActive();
			case ModelPackage.ONTOLOGY_REPOSITORY__ONTOLOGY:
				return getOntology();
			case ModelPackage.ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY:
				return getMaintenanceOntology();
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				return getLibrary();
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
			case ModelPackage.ONTOLOGY_REPOSITORY__URL:
				setURL((String)newValue);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__USERNAME:
				setUsername((String)newValue);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__PASSWORD:
				setPassword((String)newValue);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__ONTOLOGY:
				setOntology((String)newValue);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY:
				setMaintenanceOntology((String)newValue);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				setLibrary((OntologyLibrary)newValue);
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
			case ModelPackage.ONTOLOGY_REPOSITORY__URL:
				setURL(URL_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__ONTOLOGY:
				setOntology(ONTOLOGY_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY:
				setMaintenanceOntology(MAINTENANCE_ONTOLOGY_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				setLibrary((OntologyLibrary)null);
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
			case ModelPackage.ONTOLOGY_REPOSITORY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case ModelPackage.ONTOLOGY_REPOSITORY__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ModelPackage.ONTOLOGY_REPOSITORY__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ModelPackage.ONTOLOGY_REPOSITORY__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case ModelPackage.ONTOLOGY_REPOSITORY__ONTOLOGY:
				return ONTOLOGY_EDEFAULT == null ? ontology != null : !ONTOLOGY_EDEFAULT.equals(ontology);
			case ModelPackage.ONTOLOGY_REPOSITORY__MAINTENANCE_ONTOLOGY:
				return MAINTENANCE_ONTOLOGY_EDEFAULT == null ? maintenanceOntology != null : !MAINTENANCE_ONTOLOGY_EDEFAULT.equals(maintenanceOntology);
			case ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY:
				return getLibrary() != null;
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
		result.append(" (URL: ");
		result.append(url);
		result.append(", Username: ");
		result.append(username);
		result.append(", Password: ");
		result.append(password);
		result.append(", Active: ");
		result.append(active);
		result.append(", Ontology: ");
		result.append(ontology);
		result.append(", MaintenanceOntology: ");
		result.append(maintenanceOntology);
		result.append(')');
		return result.toString();
	}

} //OntologyRepositoryImpl
