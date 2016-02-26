/**
 */
package de.symo.model.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AValue Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a value as a string with a uncertainty. Base class for different types of Values. For this class, change notification will be omitted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.base.AValueDef#getValue <em>Value</em>}</li>
 *   <li>{@link de.symo.model.base.AValueDef#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @see de.symo.model.base.BasePackage#getAValueDef()
 * @model abstract="true"
 * @generated
 */
public interface AValueDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.symo.model.base.BasePackage#getAValueDef_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.symo.model.base.AValueDef#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uncertainty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see #setUncertainty(String)
	 * @see de.symo.model.base.BasePackage#getAValueDef_Uncertainty()
	 * @model
	 * @generated
	 */
	String getUncertainty();

	/**
	 * Sets the value of the '{@link de.symo.model.base.AValueDef#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(String value);

} // AValueDef
