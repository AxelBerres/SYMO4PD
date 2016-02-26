/**
 */
package de.symo.model.registry.impl;

import de.symo.model.base.AVersionedModelRoot;
import de.symo.model.base.BasePackage;

import de.symo.model.base.impl.ANameItemImpl;

import de.symo.model.registry.Constant;
import de.symo.model.registry.Measuement;
import de.symo.model.registry.Registry;
import de.symo.model.registry.RegistryPackage;
import de.symo.model.registry.Stereotype;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.impl.RegistryImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link de.symo.model.registry.impl.RegistryImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link de.symo.model.registry.impl.RegistryImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link de.symo.model.registry.impl.RegistryImpl#getSteretypes <em>Steretypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistryImpl extends ANameItemImpl implements Registry {
	/**
	 * The default value of the '{@link #getMetaModel() <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_EDEFAULT = "1.00";

	/**
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected String metaModel = META_MODEL_EDEFAULT;

	/**
	 * This is true if the Meta Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metaModelESet;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Measuement> units;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The cached value of the '{@link #getSteretypes() <em>Steretypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteretypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> steretypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModel() {
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModel(String newMetaModel) {
		String oldMetaModel = metaModel;
		metaModel = newMetaModel;
		boolean oldMetaModelESet = metaModelESet;
		metaModelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY__META_MODEL, oldMetaModel, metaModel, !oldMetaModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMetaModel() {
		String oldMetaModel = metaModel;
		boolean oldMetaModelESet = metaModelESet;
		metaModel = META_MODEL_EDEFAULT;
		metaModelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.REGISTRY__META_MODEL, oldMetaModel, META_MODEL_EDEFAULT, oldMetaModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetaModel() {
		return metaModelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measuement> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Measuement>(Measuement.class, this, RegistryPackage.REGISTRY__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<Constant>(Constant.class, this, RegistryPackage.REGISTRY__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getSteretypes() {
		if (steretypes == null) {
			steretypes = new EObjectContainmentEList<Stereotype>(Stereotype.class, this, RegistryPackage.REGISTRY__STERETYPES);
		}
		return steretypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REGISTRY__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case RegistryPackage.REGISTRY__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case RegistryPackage.REGISTRY__STERETYPES:
				return ((InternalEList<?>)getSteretypes()).basicRemove(otherEnd, msgs);
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
			case RegistryPackage.REGISTRY__META_MODEL:
				return getMetaModel();
			case RegistryPackage.REGISTRY__UNITS:
				return getUnits();
			case RegistryPackage.REGISTRY__CONSTANTS:
				return getConstants();
			case RegistryPackage.REGISTRY__STERETYPES:
				return getSteretypes();
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
			case RegistryPackage.REGISTRY__META_MODEL:
				setMetaModel((String)newValue);
				return;
			case RegistryPackage.REGISTRY__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Measuement>)newValue);
				return;
			case RegistryPackage.REGISTRY__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case RegistryPackage.REGISTRY__STERETYPES:
				getSteretypes().clear();
				getSteretypes().addAll((Collection<? extends Stereotype>)newValue);
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
			case RegistryPackage.REGISTRY__META_MODEL:
				unsetMetaModel();
				return;
			case RegistryPackage.REGISTRY__UNITS:
				getUnits().clear();
				return;
			case RegistryPackage.REGISTRY__CONSTANTS:
				getConstants().clear();
				return;
			case RegistryPackage.REGISTRY__STERETYPES:
				getSteretypes().clear();
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
			case RegistryPackage.REGISTRY__META_MODEL:
				return isSetMetaModel();
			case RegistryPackage.REGISTRY__UNITS:
				return units != null && !units.isEmpty();
			case RegistryPackage.REGISTRY__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case RegistryPackage.REGISTRY__STERETYPES:
				return steretypes != null && !steretypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AVersionedModelRoot.class) {
			switch (derivedFeatureID) {
				case RegistryPackage.REGISTRY__META_MODEL: return BasePackage.AVERSIONED_MODEL_ROOT__META_MODEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AVersionedModelRoot.class) {
			switch (baseFeatureID) {
				case BasePackage.AVERSIONED_MODEL_ROOT__META_MODEL: return RegistryPackage.REGISTRY__META_MODEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (metaModel: ");
		if (metaModelESet) result.append(metaModel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegistryImpl
