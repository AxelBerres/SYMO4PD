/**
 */
package de.symo.model.registry.impl;

import de.symo.model.registry.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistryFactoryImpl extends EFactoryImpl implements RegistryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegistryFactory init() {
		try {
			RegistryFactory theRegistryFactory = (RegistryFactory)EPackage.Registry.INSTANCE.getEFactory(RegistryPackage.eNS_URI);
			if (theRegistryFactory != null) {
				return theRegistryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegistryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RegistryPackage.REGISTRY: return createRegistry();
			case RegistryPackage.UNIT_REF: return createUnitRef();
			case RegistryPackage.MEASUREMENT: return createMeasurement();
			case RegistryPackage.PARAMETER: return createParameter();
			case RegistryPackage.CONSTANT: return createConstant();
			case RegistryPackage.STEREOTYPE: return createStereotype();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registry createRegistry() {
		RegistryImpl registry = new RegistryImpl();
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRef createUnitRef() {
		UnitRefImpl unitRef = new UnitRefImpl();
		return unitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackage getRegistryPackage() {
		return (RegistryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegistryPackage getPackage() {
		return RegistryPackage.eINSTANCE;
	}

} //RegistryFactoryImpl
