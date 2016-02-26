/**
 */
package de.symo.model.symopd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The symopd package is part of the SYMO4PD Ecore model and  includes all the basic elements to describe a technical system. This includes the description of the system structure and the system behavior. In addition, the organization of systems in system component libraries and project repositories.
 * <!-- end-model-doc -->
 * @see de.symo.model.symopd.SymopdFactory
 * @model kind="package"
 * @generated
 */
public interface SymopdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "symopd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dlr.de/symo/model/2016/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "symo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymopdPackage eINSTANCE = de.symo.model.symopd.impl.SymopdPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.symo.model.symopd.impl.SystemComponentImpl <em>System Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.symopd.impl.SystemComponentImpl
	 * @see de.symo.model.symopd.impl.SymopdPackageImpl#getSystemComponent()
	 * @generated
	 */
	int SYSTEM_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.symo.model.symopd.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component</em>'.
	 * @see de.symo.model.symopd.SystemComponent
	 * @generated
	 */
	EClass getSystemComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymopdFactory getSymopdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.symo.model.symopd.impl.SystemComponentImpl <em>System Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.symopd.impl.SystemComponentImpl
		 * @see de.symo.model.symopd.impl.SymopdPackageImpl#getSystemComponent()
		 * @generated
		 */
		EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

	}

} //SymopdPackage
