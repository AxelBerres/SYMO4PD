/**
 */
package de.symo.model.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AParameter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter defines a configurable value of a system element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.base.AParameterDef#getValue <em>Value</em>}</li>
 *   <li>{@link de.symo.model.base.AParameterDef#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.symo.model.base.BasePackage#getAParameterDef()
 * @model
 * @generated
 */
public interface AParameterDef extends ADataItem {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see de.symo.model.base.BasePackage#getAParameterDef_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link de.symo.model.base.AParameterDef#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see de.symo.model.base.BasePackage#getAParameterDef_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link de.symo.model.base.AParameterDef#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // AParameterDef
