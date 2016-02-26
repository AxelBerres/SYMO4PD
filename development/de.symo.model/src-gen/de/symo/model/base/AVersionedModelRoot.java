/**
 */
package de.symo.model.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVersioned Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a version number for a model file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.base.AVersionedModelRoot#getMetaModel <em>Meta Model</em>}</li>
 * </ul>
 *
 * @see de.symo.model.base.BasePackage#getAVersionedModelRoot()
 * @model abstract="true"
 * @generated
 */
public interface AVersionedModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' attribute.
	 * The default value is <code>"1.00"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the version of the meta model as a string like 1.00. The version number has to be set as the default literature property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Model</em>' attribute.
	 * @see #isSetMetaModel()
	 * @see #unsetMetaModel()
	 * @see #setMetaModel(String)
	 * @see de.symo.model.base.BasePackage#getAVersionedModelRoot_MetaModel()
	 * @model default="1.00" unsettable="true"
	 * @generated
	 */
	String getMetaModel();

	/**
	 * Sets the value of the '{@link de.symo.model.base.AVersionedModelRoot#getMetaModel <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' attribute.
	 * @see #isSetMetaModel()
	 * @see #unsetMetaModel()
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(String value);

	/**
	 * Unsets the value of the '{@link de.symo.model.base.AVersionedModelRoot#getMetaModel <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMetaModel()
	 * @see #getMetaModel()
	 * @see #setMetaModel(String)
	 * @generated
	 */
	void unsetMetaModel();

	/**
	 * Returns whether the value of the '{@link de.symo.model.base.AVersionedModelRoot#getMetaModel <em>Meta Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Meta Model</em>' attribute is set.
	 * @see #unsetMetaModel()
	 * @see #getMetaModel()
	 * @see #setMetaModel(String)
	 * @generated
	 */
	boolean isSetMetaModel();

} // AVersionedModelRoot
