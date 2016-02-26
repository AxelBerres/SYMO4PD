/**
 */
package de.symo.model.registry;

import de.symo.model.base.Unit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.UnitRef#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link de.symo.model.registry.UnitRef#getTargetUnit <em>Target Unit</em>}</li>
 * </ul>
 *
 * @see de.symo.model.registry.RegistryPackage#getUnitRef()
 * @model
 * @generated
 */
public interface UnitRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute.
	 * @see #setConversionFactor(Double)
	 * @see de.symo.model.registry.RegistryPackage#getUnitRef_ConversionFactor()
	 * @model
	 * @generated
	 */
	Double getConversionFactor();

	/**
	 * Sets the value of the '{@link de.symo.model.registry.UnitRef#getConversionFactor <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' attribute.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(Double value);

	/**
	 * Returns the value of the '<em><b>Target Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Unit</em>' reference.
	 * @see #setTargetUnit(Unit)
	 * @see de.symo.model.registry.RegistryPackage#getUnitRef_TargetUnit()
	 * @model required="true"
	 * @generated
	 */
	Unit getTargetUnit();

	/**
	 * Sets the value of the '{@link de.symo.model.registry.UnitRef#getTargetUnit <em>Target Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Unit</em>' reference.
	 * @see #getTargetUnit()
	 * @generated
	 */
	void setTargetUnit(Unit value);

} // UnitRef
