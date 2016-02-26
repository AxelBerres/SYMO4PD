/**
 */
package de.symo.model.registry;

import de.symo.model.base.Unit;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measuement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.Measuement#getUnitRef <em>Unit Ref</em>}</li>
 * </ul>
 *
 * @see de.symo.model.registry.RegistryPackage#getMeasuement()
 * @model
 * @generated
 */
public interface Measuement extends Unit {

	/**
	 * Returns the value of the '<em><b>Unit Ref</b></em>' containment reference list.
	 * The list contents are of type {@link de.symo.model.registry.UnitRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Ref</em>' containment reference list.
	 * @see de.symo.model.registry.RegistryPackage#getMeasuement_UnitRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitRef> getUnitRef();
} // Measuement
