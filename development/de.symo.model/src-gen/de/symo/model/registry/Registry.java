/**
 */
package de.symo.model.registry;

import de.symo.model.base.ANameItem;
import de.symo.model.base.AVersionedModelRoot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The registry contains lists of global definitions of disciplines, units, constants.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.Registry#getUnits <em>Units</em>}</li>
 *   <li>{@link de.symo.model.registry.Registry#getConstants <em>Constants</em>}</li>
 *   <li>{@link de.symo.model.registry.Registry#getStereotypes <em>Stereotypes</em>}</li>
 *   <li>{@link de.symo.model.registry.Registry#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.symo.model.registry.RegistryPackage#getRegistry()
 * @model
 * @generated
 */
public interface Registry extends ANameItem, AVersionedModelRoot {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.symo.model.registry.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see de.symo.model.registry.RegistryPackage#getRegistry_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measurement> getUnits();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link de.symo.model.registry.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see de.symo.model.registry.RegistryPackage#getRegistry_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

	/**
	 * Returns the value of the '<em><b>Stereotypes</b></em>' containment reference list.
	 * The list contents are of type {@link de.symo.model.registry.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotypes</em>' containment reference list.
	 * @see de.symo.model.registry.RegistryPackage#getRegistry_Stereotypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stereotype> getStereotypes();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.symo.model.registry.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.symo.model.registry.RegistryPackage#getRegistry_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Registry
