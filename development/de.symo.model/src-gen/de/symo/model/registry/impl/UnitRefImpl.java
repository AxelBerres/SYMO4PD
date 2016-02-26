/**
 */
package de.symo.model.registry.impl;

import de.symo.model.base.Unit;

import de.symo.model.registry.RegistryPackage;
import de.symo.model.registry.UnitRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.impl.UnitRefImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link de.symo.model.registry.impl.UnitRefImpl#getTargetUnit <em>Target Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitRefImpl extends MinimalEObjectImpl.Container implements UnitRef {
	/**
	 * The default value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Double CONVERSION_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected Double conversionFactor = CONVERSION_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetUnit() <em>Target Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit targetUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.UNIT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionFactor(Double newConversionFactor) {
		Double oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.UNIT_REF__CONVERSION_FACTOR, oldConversionFactor, conversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getTargetUnit() {
		if (targetUnit != null && targetUnit.eIsProxy()) {
			InternalEObject oldTargetUnit = (InternalEObject)targetUnit;
			targetUnit = (Unit)eResolveProxy(oldTargetUnit);
			if (targetUnit != oldTargetUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegistryPackage.UNIT_REF__TARGET_UNIT, oldTargetUnit, targetUnit));
			}
		}
		return targetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetTargetUnit() {
		return targetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUnit(Unit newTargetUnit) {
		Unit oldTargetUnit = targetUnit;
		targetUnit = newTargetUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.UNIT_REF__TARGET_UNIT, oldTargetUnit, targetUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistryPackage.UNIT_REF__CONVERSION_FACTOR:
				return getConversionFactor();
			case RegistryPackage.UNIT_REF__TARGET_UNIT:
				if (resolve) return getTargetUnit();
				return basicGetTargetUnit();
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
			case RegistryPackage.UNIT_REF__CONVERSION_FACTOR:
				setConversionFactor((Double)newValue);
				return;
			case RegistryPackage.UNIT_REF__TARGET_UNIT:
				setTargetUnit((Unit)newValue);
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
			case RegistryPackage.UNIT_REF__CONVERSION_FACTOR:
				setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
				return;
			case RegistryPackage.UNIT_REF__TARGET_UNIT:
				setTargetUnit((Unit)null);
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
			case RegistryPackage.UNIT_REF__CONVERSION_FACTOR:
				return CONVERSION_FACTOR_EDEFAULT == null ? conversionFactor != null : !CONVERSION_FACTOR_EDEFAULT.equals(conversionFactor);
			case RegistryPackage.UNIT_REF__TARGET_UNIT:
				return targetUnit != null;
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
		result.append(" (conversionFactor: ");
		result.append(conversionFactor);
		result.append(')');
		return result.toString();
	}

} //UnitRefImpl
