/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.OntologyLibrary;
import model.OntologyRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.OntologyLibraryImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link model.impl.OntologyLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.OntologyLibraryImpl#getActiveRepository <em>Active Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyLibraryImpl extends MinimalEObjectImpl.Container implements OntologyLibrary {
	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyRepository> repositories;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveRepository() <em>Active Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveRepository()
	 * @generated
	 * @ordered
	 */
	protected OntologyRepository activeRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ONTOLOGY_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologyRepository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentWithInverseEList<OntologyRepository>(OntologyRepository.class, this, ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES, ModelPackage.ONTOLOGY_REPOSITORY__LIBRARY);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyRepository getActiveRepository() {
		if (activeRepository != null && activeRepository.eIsProxy()) {
			InternalEObject oldActiveRepository = (InternalEObject)activeRepository;
			activeRepository = (OntologyRepository)eResolveProxy(oldActiveRepository);
			if (activeRepository != oldActiveRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY, oldActiveRepository, activeRepository));
			}
		}
		return activeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyRepository basicGetActiveRepository() {
		return activeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveRepository(OntologyRepository newActiveRepository) {
		OntologyRepository oldActiveRepository = activeRepository;
		activeRepository = newActiveRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY, oldActiveRepository, activeRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRepositories()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES:
				return getRepositories();
			case ModelPackage.ONTOLOGY_LIBRARY__NAME:
				return getName();
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY:
				if (resolve) return getActiveRepository();
				return basicGetActiveRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends OntologyRepository>)newValue);
				return;
			case ModelPackage.ONTOLOGY_LIBRARY__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY:
				setActiveRepository((OntologyRepository)newValue);
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
			case ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES:
				getRepositories().clear();
				return;
			case ModelPackage.ONTOLOGY_LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY:
				setActiveRepository((OntologyRepository)null);
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
			case ModelPackage.ONTOLOGY_LIBRARY__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case ModelPackage.ONTOLOGY_LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_REPOSITORY:
				return activeRepository != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OntologyLibraryImpl
