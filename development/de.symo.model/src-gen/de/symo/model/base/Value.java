/**
 */
package de.symo.model.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the value of a parameter. In addition the value will be checked for correct content. For this model element, change notification is activated.
 * <!-- end-model-doc -->
 *
 *
 * @see de.symo.model.base.BasePackage#getValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidNumber='Tuple {\r\n\tmessage : String = \'Value must be a valid real number\',\r\n\tstatus : Boolean = value <> null implies value.matches(\'^-?\\\\d*(\\\\d\\\\.|\\\\.\\\\d+)?([eE]-?\\\\d+)?$\')\r\n}.status'"
 * @generated
 */
public interface Value extends AValueDef, IOCLValidated {
} // Value
