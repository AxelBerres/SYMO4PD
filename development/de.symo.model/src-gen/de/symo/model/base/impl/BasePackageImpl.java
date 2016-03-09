/**
 */
package de.symo.model.base.impl;

import de.symo.model.base.ADataItem;
import de.symo.model.base.ANameItem;
import de.symo.model.base.AParameterDef;
import de.symo.model.base.AValueDef;
import de.symo.model.base.AVersionedModelRoot;
import de.symo.model.base.BaseFactory;
import de.symo.model.base.BasePackage;
import de.symo.model.base.IOCLValidated;
import de.symo.model.base.Note;
import de.symo.model.base.Unit;
import de.symo.model.base.Value;

import de.symo.model.base.util.BaseValidator;

import de.symo.model.registry.RegistryPackage;

import de.symo.model.registry.impl.RegistryPackageImpl;

import de.symo.model.symopd.SymopdPackage;

import de.symo.model.symopd.impl.SymopdPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aVersionedModelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNameItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDataItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aValueDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aParameterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioclValidatedEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.symo.model.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RegistryPackageImpl theRegistryPackage = (RegistryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI) instanceof RegistryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI) : RegistryPackage.eINSTANCE);
		SymopdPackageImpl theSymopdPackage = (SymopdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SymopdPackage.eNS_URI) instanceof SymopdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SymopdPackage.eNS_URI) : SymopdPackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theRegistryPackage.createPackageContents();
		theSymopdPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theRegistryPackage.initializePackageContents();
		theSymopdPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BaseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVersionedModelRoot() {
		return aVersionedModelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVersionedModelRoot_MetaModel() {
		return (EAttribute)aVersionedModelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANameItem() {
		return aNameItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANameItem_Name() {
		return (EAttribute)aNameItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANameItem_Description() {
		return (EAttribute)aNameItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Text() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Author() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Date() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNote_Children() {
		return (EReference)noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADataItem() {
		return aDataItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADataItem_Id() {
		return (EAttribute)aDataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADataItem_Notes() {
		return (EReference)aDataItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAValueDef() {
		return aValueDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAValueDef_Value() {
		return (EAttribute)aValueDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAValueDef_Uncertainty() {
		return (EAttribute)aValueDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAParameterDef() {
		return aParameterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAParameterDef_Value() {
		return (EReference)aParameterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAParameterDef_Unit() {
		return (EReference)aParameterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Symbol() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_SiUnit() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOCLValidated() {
		return ioclValidatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aVersionedModelRootEClass = createEClass(AVERSIONED_MODEL_ROOT);
		createEAttribute(aVersionedModelRootEClass, AVERSIONED_MODEL_ROOT__META_MODEL);

		aNameItemEClass = createEClass(ANAME_ITEM);
		createEAttribute(aNameItemEClass, ANAME_ITEM__NAME);
		createEAttribute(aNameItemEClass, ANAME_ITEM__DESCRIPTION);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__TEXT);
		createEAttribute(noteEClass, NOTE__AUTHOR);
		createEAttribute(noteEClass, NOTE__DATE);
		createEReference(noteEClass, NOTE__CHILDREN);

		aDataItemEClass = createEClass(ADATA_ITEM);
		createEAttribute(aDataItemEClass, ADATA_ITEM__ID);
		createEReference(aDataItemEClass, ADATA_ITEM__NOTES);

		aValueDefEClass = createEClass(AVALUE_DEF);
		createEAttribute(aValueDefEClass, AVALUE_DEF__VALUE);
		createEAttribute(aValueDefEClass, AVALUE_DEF__UNCERTAINTY);

		valueEClass = createEClass(VALUE);

		aParameterDefEClass = createEClass(APARAMETER_DEF);
		createEReference(aParameterDefEClass, APARAMETER_DEF__VALUE);
		createEReference(aParameterDefEClass, APARAMETER_DEF__UNIT);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__SYMBOL);
		createEAttribute(unitEClass, UNIT__SI_UNIT);

		ioclValidatedEClass = createEClass(IOCL_VALIDATED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aDataItemEClass.getESuperTypes().add(this.getANameItem());
		valueEClass.getESuperTypes().add(this.getAValueDef());
		valueEClass.getESuperTypes().add(this.getIOCLValidated());
		aParameterDefEClass.getESuperTypes().add(this.getADataItem());
		unitEClass.getESuperTypes().add(this.getANameItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(aVersionedModelRootEClass, AVersionedModelRoot.class, "AVersionedModelRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAVersionedModelRoot_MetaModel(), ecorePackage.getEString(), "metaModel", "1.00", 0, 1, AVersionedModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aNameItemEClass, ANameItem.class, "ANameItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANameItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ANameItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getANameItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, ANameItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Text(), ecorePackage.getEString(), "text", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Author(), ecorePackage.getEString(), "author", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Date(), ecorePackage.getEString(), "date", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Children(), this.getNote(), null, "children", null, 0, -1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aDataItemEClass, ADataItem.class, "ADataItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADataItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, ADataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADataItem_Notes(), this.getNote(), null, "notes", null, 0, -1, ADataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aValueDefEClass, AValueDef.class, "AValueDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAValueDef_Value(), ecorePackage.getEString(), "value", null, 1, 1, AValueDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAValueDef_Uncertainty(), ecorePackage.getEString(), "uncertainty", null, 0, 1, AValueDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aParameterDefEClass, AParameterDef.class, "AParameterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAParameterDef_Value(), this.getValue(), null, "value", null, 0, 1, AParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAParameterDef_Unit(), this.getUnit(), null, "unit", null, 0, 1, AParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_SiUnit(), ecorePackage.getEBoolean(), "siUnit", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioclValidatedEClass, IOCLValidated.class, "IOCLValidated", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valueEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidNumber"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (valueEClass, 
		   source, 
		   new String[] {
			 "ValidNumber", "Tuple {\r\n\tmessage : String = \'Value must be a valid real number\',\r\n\tstatus : Boolean = value <> null implies value.matches(\'^-?\\\\d*(\\\\d\\\\.|\\\\.\\\\d+)?([eE]-?\\\\d+)?$\')\r\n}.status"
		   });
	}

} //BasePackageImpl
