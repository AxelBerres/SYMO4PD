/**
 */
package de.symo.model.registry.impl;

import de.symo.model.base.impl.ADataItemImpl;

import de.symo.model.registry.RegistryPackage;
import de.symo.model.registry.Stereotype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.symo.model.registry.impl.StereotypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.symo.model.registry.impl.StereotypeImpl#getIconBase64 <em>Icon Base64</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeImpl extends ADataItemImpl implements Stereotype {
	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = "No icon integrated into registry. Enter path to icon here.";

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconBase64() <em>Icon Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconBase64()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_BASE64_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconBase64() <em>Icon Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconBase64()
	 * @generated
	 * @ordered
	 */
	protected String iconBase64 = ICON_BASE64_EDEFAULT;

	/**
	 * This is true if the Icon Base64 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iconBase64ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.STEREOTYPE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconBase64() {
		return iconBase64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconBase64(String newIconBase64) {
		String oldIconBase64 = iconBase64;
		iconBase64 = newIconBase64;
		boolean oldIconBase64ESet = iconBase64ESet;
		iconBase64ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.STEREOTYPE__ICON_BASE64, oldIconBase64, iconBase64, !oldIconBase64ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIconBase64() {
		String oldIconBase64 = iconBase64;
		boolean oldIconBase64ESet = iconBase64ESet;
		iconBase64 = ICON_BASE64_EDEFAULT;
		iconBase64ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.STEREOTYPE__ICON_BASE64, oldIconBase64, ICON_BASE64_EDEFAULT, oldIconBase64ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIconBase64() {
		return iconBase64ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistryPackage.STEREOTYPE__ICON:
				return getIcon();
			case RegistryPackage.STEREOTYPE__ICON_BASE64:
				return getIconBase64();
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
			case RegistryPackage.STEREOTYPE__ICON:
				setIcon((String)newValue);
				return;
			case RegistryPackage.STEREOTYPE__ICON_BASE64:
				setIconBase64((String)newValue);
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
			case RegistryPackage.STEREOTYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case RegistryPackage.STEREOTYPE__ICON_BASE64:
				unsetIconBase64();
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
			case RegistryPackage.STEREOTYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case RegistryPackage.STEREOTYPE__ICON_BASE64:
				return isSetIconBase64();
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
		result.append(" (icon: ");
		result.append(icon);
		result.append(", iconBase64: ");
		if (iconBase64ESet) result.append(iconBase64); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StereotypeImpl
