/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.Ontology;
import model.OntologyLibrary;
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
 *   <li>{@link model.impl.OntologyLibraryImpl#getOntologies <em>Ontologies</em>}</li>
 *   <li>{@link model.impl.OntologyLibraryImpl#getActiveOntology <em>Active Ontology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyLibraryImpl extends MinimalEObjectImpl.Container implements OntologyLibrary {
	/**
	 * The cached value of the '{@link #getOntologies() <em>Ontologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontology> ontologies;

	/**
	 * The cached value of the '{@link #getActiveOntology() <em>Active Ontology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveOntology()
	 * @generated
	 * @ordered
	 */
	protected Ontology activeOntology;

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
	public EList<Ontology> getOntologies() {
		if (ontologies == null) {
			ontologies = new EObjectContainmentWithInverseEList<Ontology>(Ontology.class, this, ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES, ModelPackage.ONTOLOGY__LIBRARY);
		}
		return ontologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getActiveOntology() {
		if (activeOntology != null && activeOntology.eIsProxy()) {
			InternalEObject oldActiveOntology = (InternalEObject)activeOntology;
			activeOntology = (Ontology)eResolveProxy(oldActiveOntology);
			if (activeOntology != oldActiveOntology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY, oldActiveOntology, activeOntology));
			}
		}
		return activeOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology basicGetActiveOntology() {
		return activeOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveOntology(Ontology newActiveOntology) {
		Ontology oldActiveOntology = activeOntology;
		activeOntology = newActiveOntology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY, oldActiveOntology, activeOntology));
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
			case ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOntologies()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES:
				return ((InternalEList<?>)getOntologies()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES:
				return getOntologies();
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY:
				if (resolve) return getActiveOntology();
				return basicGetActiveOntology();
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
			case ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES:
				getOntologies().clear();
				getOntologies().addAll((Collection<? extends Ontology>)newValue);
				return;
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY:
				setActiveOntology((Ontology)newValue);
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
			case ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES:
				getOntologies().clear();
				return;
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY:
				setActiveOntology((Ontology)null);
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
			case ModelPackage.ONTOLOGY_LIBRARY__ONTOLOGIES:
				return ontologies != null && !ontologies.isEmpty();
			case ModelPackage.ONTOLOGY_LIBRARY__ACTIVE_ONTOLOGY:
				return activeOntology != null;
		}
		return super.eIsSet(featureID);
	}

} //OntologyLibraryImpl
