/**
 */
package de.symo.model.registry;

import de.symo.model.base.ADataItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a sereotype. The steretype implies a is a releation of the used object. For a later representation an icons is included.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.Stereotype#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.symo.model.registry.Stereotype#getIconBase64 <em>Icon Base64</em>}</li>
 * </ul>
 *
 * @see de.symo.model.registry.RegistryPackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends ADataItem {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * The default value is <code>"No icon integrated into registry. Enter path to icon here."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.symo.model.registry.RegistryPackage#getStereotype_Icon()
	 * @model default="No icon integrated into registry. Enter path to icon here."
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.symo.model.registry.Stereotype#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Icon Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Base64</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Base64</em>' attribute.
	 * @see #isSetIconBase64()
	 * @see #unsetIconBase64()
	 * @see #setIconBase64(String)
	 * @see de.symo.model.registry.RegistryPackage#getStereotype_IconBase64()
	 * @model unsettable="true"
	 * @generated
	 */
	String getIconBase64();

	/**
	 * Sets the value of the '{@link de.symo.model.registry.Stereotype#getIconBase64 <em>Icon Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Base64</em>' attribute.
	 * @see #isSetIconBase64()
	 * @see #unsetIconBase64()
	 * @see #getIconBase64()
	 * @generated
	 */
	void setIconBase64(String value);

	/**
	 * Unsets the value of the '{@link de.symo.model.registry.Stereotype#getIconBase64 <em>Icon Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIconBase64()
	 * @see #getIconBase64()
	 * @see #setIconBase64(String)
	 * @generated
	 */
	void unsetIconBase64();

	/**
	 * Returns whether the value of the '{@link de.symo.model.registry.Stereotype#getIconBase64 <em>Icon Base64</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Icon Base64</em>' attribute is set.
	 * @see #unsetIconBase64()
	 * @see #getIconBase64()
	 * @see #setIconBase64(String)
	 * @generated
	 */
	boolean isSetIconBase64();

} // Stereotype
