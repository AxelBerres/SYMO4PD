/**
 */
package de.symo.model.registry;

import de.symo.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * The package registry contains all model elements to the description of lists of global definitions. These may be, for example, units and constants.
 * <!-- end-model-doc -->
 * @see de.symo.model.registry.RegistryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface RegistryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "registry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dlr.de/symo4pd/registry/2016/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistryPackage eINSTANCE = de.symo.model.registry.impl.RegistryPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.symo.model.registry.impl.RegistryImpl <em>Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.registry.impl.RegistryImpl
	 * @see de.symo.model.registry.impl.RegistryPackageImpl#getRegistry()
	 * @generated
	 */
	int REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__NAME = BasePackage.ANAME_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__DESCRIPTION = BasePackage.ANAME_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__META_MODEL = BasePackage.ANAME_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__UNITS = BasePackage.ANAME_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__CONSTANTS = BasePackage.ANAME_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__STEREOTYPES = BasePackage.ANAME_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__PARAMETERS = BasePackage.ANAME_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FEATURE_COUNT = BasePackage.ANAME_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OPERATION_COUNT = BasePackage.ANAME_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.registry.impl.UnitRefImpl <em>Unit Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.registry.impl.UnitRefImpl
	 * @see de.symo.model.registry.impl.RegistryPackageImpl#getUnitRef()
	 * @generated
	 */
	int UNIT_REF = 1;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF__CONVERSION_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Target Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF__TARGET_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Unit Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.symo.model.registry.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.registry.impl.MeasurementImpl
	 * @see de.symo.model.registry.impl.RegistryPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = BasePackage.UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = BasePackage.UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__SYMBOL = BasePackage.UNIT__SYMBOL;

	/**
	 * The feature id for the '<em><b>Si Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__SI_UNIT = BasePackage.UNIT__SI_UNIT;

	/**
	 * The feature id for the '<em><b>Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UNIT_REF = BasePackage.UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = BasePackage.UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = BasePackage.UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.registry.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.registry.impl.ParameterImpl
	 * @see de.symo.model.registry.impl.RegistryPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = BasePackage.APARAMETER_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = BasePackage.APARAMETER_DEF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = BasePackage.APARAMETER_DEF__ID;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NOTES = BasePackage.APARAMETER_DEF__NOTES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = BasePackage.APARAMETER_DEF__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = BasePackage.APARAMETER_DEF__UNIT;

	/**
	 * The feature id for the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ESTIMATED = BasePackage.APARAMETER_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTANT = BasePackage.APARAMETER_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = BasePackage.APARAMETER_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = BasePackage.APARAMETER_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.registry.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.registry.impl.ConstantImpl
	 * @see de.symo.model.registry.impl.RegistryPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = BasePackage.APARAMETER_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DESCRIPTION = BasePackage.APARAMETER_DEF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ID = BasePackage.APARAMETER_DEF__ID;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NOTES = BasePackage.APARAMETER_DEF__NOTES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = BasePackage.APARAMETER_DEF__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__UNIT = BasePackage.APARAMETER_DEF__UNIT;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = BasePackage.APARAMETER_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = BasePackage.APARAMETER_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.registry.impl.StereotypeImpl <em>Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.registry.impl.StereotypeImpl
	 * @see de.symo.model.registry.impl.RegistryPackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAME = BasePackage.ADATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__DESCRIPTION = BasePackage.ADATA_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ID = BasePackage.ADATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NOTES = BasePackage.ADATA_ITEM__NOTES;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ICON = BasePackage.ADATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ICON_BASE64 = BasePackage.ADATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = BasePackage.ADATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_OPERATION_COUNT = BasePackage.ADATA_ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.symo.model.registry.Registry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry</em>'.
	 * @see de.symo.model.registry.Registry
	 * @generated
	 */
	EClass getRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.registry.Registry#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.symo.model.registry.Registry#getUnits()
	 * @see #getRegistry()
	 * @generated
	 */
	EReference getRegistry_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.registry.Registry#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see de.symo.model.registry.Registry#getConstants()
	 * @see #getRegistry()
	 * @generated
	 */
	EReference getRegistry_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.registry.Registry#getStereotypes <em>Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stereotypes</em>'.
	 * @see de.symo.model.registry.Registry#getStereotypes()
	 * @see #getRegistry()
	 * @generated
	 */
	EReference getRegistry_Stereotypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.registry.Registry#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.symo.model.registry.Registry#getParameters()
	 * @see #getRegistry()
	 * @generated
	 */
	EReference getRegistry_Parameters();

	/**
	 * Returns the meta object for class '{@link de.symo.model.registry.UnitRef <em>Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Ref</em>'.
	 * @see de.symo.model.registry.UnitRef
	 * @generated
	 */
	EClass getUnitRef();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.registry.UnitRef#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see de.symo.model.registry.UnitRef#getConversionFactor()
	 * @see #getUnitRef()
	 * @generated
	 */
	EAttribute getUnitRef_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link de.symo.model.registry.UnitRef#getTargetUnit <em>Target Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Unit</em>'.
	 * @see de.symo.model.registry.UnitRef#getTargetUnit()
	 * @see #getUnitRef()
	 * @generated
	 */
	EReference getUnitRef_TargetUnit();

	/**
	 * Returns the meta object for class '{@link de.symo.model.registry.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see de.symo.model.registry.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.registry.Measurement#getUnitRef <em>Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Ref</em>'.
	 * @see de.symo.model.registry.Measurement#getUnitRef()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_UnitRef();

	/**
	 * Returns the meta object for class '{@link de.symo.model.registry.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.symo.model.registry.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.registry.Parameter#isEstimated <em>Estimated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated</em>'.
	 * @see de.symo.model.registry.Parameter#isEstimated()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Estimated();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.registry.Parameter#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see de.symo.model.registry.Parameter#isConstant()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Constant();

	/**
	 * Returns the meta object for class '{@link de.symo.model.registry.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see de.symo.model.registry.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link de.symo.model.registry.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype</em>'.
	 * @see de.symo.model.registry.Stereotype
	 * @generated
	 */
	EClass getStereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.registry.Stereotype#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.symo.model.registry.Stereotype#getIcon()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_Icon();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.registry.Stereotype#getIconBase64 <em>Icon Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Base64</em>'.
	 * @see de.symo.model.registry.Stereotype#getIconBase64()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_IconBase64();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegistryFactory getRegistryFactory();

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
		 * The meta object literal for the '{@link de.symo.model.registry.impl.RegistryImpl <em>Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.registry.impl.RegistryImpl
		 * @see de.symo.model.registry.impl.RegistryPackageImpl#getRegistry()
		 * @generated
		 */
		EClass REGISTRY = eINSTANCE.getRegistry();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY__UNITS = eINSTANCE.getRegistry_Units();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY__CONSTANTS = eINSTANCE.getRegistry_Constants();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY__STEREOTYPES = eINSTANCE.getRegistry_Stereotypes();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY__PARAMETERS = eINSTANCE.getRegistry_Parameters();

		/**
		 * The meta object literal for the '{@link de.symo.model.registry.impl.UnitRefImpl <em>Unit Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.registry.impl.UnitRefImpl
		 * @see de.symo.model.registry.impl.RegistryPackageImpl#getUnitRef()
		 * @generated
		 */
		EClass UNIT_REF = eINSTANCE.getUnitRef();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_REF__CONVERSION_FACTOR = eINSTANCE.getUnitRef_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Target Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_REF__TARGET_UNIT = eINSTANCE.getUnitRef_TargetUnit();

		/**
		 * The meta object literal for the '{@link de.symo.model.registry.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.registry.impl.MeasurementImpl
		 * @see de.symo.model.registry.impl.RegistryPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Unit Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__UNIT_REF = eINSTANCE.getMeasurement_UnitRef();

		/**
		 * The meta object literal for the '{@link de.symo.model.registry.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.registry.impl.ParameterImpl
		 * @see de.symo.model.registry.impl.RegistryPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Estimated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ESTIMATED = eINSTANCE.getParameter_Estimated();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONSTANT = eINSTANCE.getParameter_Constant();

		/**
		 * The meta object literal for the '{@link de.symo.model.registry.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.registry.impl.ConstantImpl
		 * @see de.symo.model.registry.impl.RegistryPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link de.symo.model.registry.impl.StereotypeImpl <em>Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.registry.impl.StereotypeImpl
		 * @see de.symo.model.registry.impl.RegistryPackageImpl#getStereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__ICON = eINSTANCE.getStereotype_Icon();

		/**
		 * The meta object literal for the '<em><b>Icon Base64</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__ICON_BASE64 = eINSTANCE.getStereotype_IconBase64();

	}

} //RegistryPackage
