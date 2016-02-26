/**
 */
package de.symo.model.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A standardized quantity of measurement of a physical quantity. The use of SI units shall be prefered.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.base.Unit#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link de.symo.model.base.Unit#isSiUnit <em>Si Unit</em>}</li>
 * </ul>
 *
 * @see de.symo.model.base.BasePackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit extends ANameItem {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see de.symo.model.base.BasePackage#getUnit_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link de.symo.model.base.Unit#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Si Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Unit</em>' attribute.
	 * @see #setSiUnit(boolean)
	 * @see de.symo.model.base.BasePackage#getUnit_SiUnit()
	 * @model
	 * @generated
	 */
	boolean isSiUnit();

	/**
	 * Sets the value of the '{@link de.symo.model.base.Unit#isSiUnit <em>Si Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Si Unit</em>' attribute.
	 * @see #isSiUnit()
	 * @generated
	 */
	void setSiUnit(boolean value);

} // Unit
