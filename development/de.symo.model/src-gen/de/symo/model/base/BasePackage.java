/**
 */
package de.symo.model.base;

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
 * The package base is part of the SYMO4PD Ecore model and  includes all base objects required by other part s of the symo model.
 * <!-- end-model-doc -->
 * @see de.symo.model.base.BaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dlr.de/symo4pd/base/2016/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = de.symo.model.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.AVersionedModelRootImpl <em>AVersioned Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.AVersionedModelRootImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getAVersionedModelRoot()
	 * @generated
	 */
	int AVERSIONED_MODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERSIONED_MODEL_ROOT__META_MODEL = 0;

	/**
	 * The number of structural features of the '<em>AVersioned Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERSIONED_MODEL_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AVersioned Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERSIONED_MODEL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.ANameItemImpl <em>AName Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.ANameItemImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getANameItem()
	 * @generated
	 */
	int ANAME_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAME_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAME_ITEM__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>AName Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAME_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AName Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAME_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.NoteImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.ADataItemImpl <em>AData Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.ADataItemImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getADataItem()
	 * @generated
	 */
	int ADATA_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_ITEM__NAME = ANAME_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_ITEM__DESCRIPTION = ANAME_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_ITEM__ID = ANAME_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_ITEM__NOTES = ANAME_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AData Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_ITEM_FEATURE_COUNT = ANAME_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AData Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_ITEM_OPERATION_COUNT = ANAME_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.AValueDefImpl <em>AValue Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.AValueDefImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getAValueDef()
	 * @generated
	 */
	int AVALUE_DEF = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_DEF__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_DEF__UNCERTAINTY = 1;

	/**
	 * The number of structural features of the '<em>AValue Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_DEF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AValue Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.ValueImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = AVALUE_DEF__VALUE;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__UNCERTAINTY = AVALUE_DEF__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = AVALUE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = AVALUE_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.AParameterDefImpl <em>AParameter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.AParameterDefImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getAParameterDef()
	 * @generated
	 */
	int APARAMETER_DEF = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF__NAME = ADATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF__DESCRIPTION = ADATA_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF__ID = ADATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF__NOTES = ADATA_ITEM__NOTES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF__VALUE = ADATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF__UNIT = ADATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AParameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF_FEATURE_COUNT = ADATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AParameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_DEF_OPERATION_COUNT = ADATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.impl.UnitImpl
	 * @see de.symo.model.base.impl.BasePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = ANAME_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DESCRIPTION = ANAME_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SYMBOL = ANAME_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Si Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SI_UNIT = ANAME_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = ANAME_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = ANAME_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.symo.model.base.IOCLValidated <em>IOCL Validated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.symo.model.base.IOCLValidated
	 * @see de.symo.model.base.impl.BasePackageImpl#getIOCLValidated()
	 * @generated
	 */
	int IOCL_VALIDATED = 8;

	/**
	 * The number of structural features of the '<em>IOCL Validated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCL_VALIDATED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IOCL Validated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCL_VALIDATED_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.symo.model.base.AVersionedModelRoot <em>AVersioned Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVersioned Model Root</em>'.
	 * @see de.symo.model.base.AVersionedModelRoot
	 * @generated
	 */
	EClass getAVersionedModelRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.AVersionedModelRoot#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model</em>'.
	 * @see de.symo.model.base.AVersionedModelRoot#getMetaModel()
	 * @see #getAVersionedModelRoot()
	 * @generated
	 */
	EAttribute getAVersionedModelRoot_MetaModel();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.ANameItem <em>AName Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AName Item</em>'.
	 * @see de.symo.model.base.ANameItem
	 * @generated
	 */
	EClass getANameItem();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.ANameItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.symo.model.base.ANameItem#getName()
	 * @see #getANameItem()
	 * @generated
	 */
	EAttribute getANameItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.ANameItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.symo.model.base.ANameItem#getDescription()
	 * @see #getANameItem()
	 * @generated
	 */
	EAttribute getANameItem_Description();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see de.symo.model.base.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.Note#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.symo.model.base.Note#getText()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.Note#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.symo.model.base.Note#getAuthor()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.symo.model.base.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.base.Note#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.symo.model.base.Note#getChildren()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Children();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.ADataItem <em>AData Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AData Item</em>'.
	 * @see de.symo.model.base.ADataItem
	 * @generated
	 */
	EClass getADataItem();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.ADataItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.symo.model.base.ADataItem#getId()
	 * @see #getADataItem()
	 * @generated
	 */
	EAttribute getADataItem_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.symo.model.base.ADataItem#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see de.symo.model.base.ADataItem#getNotes()
	 * @see #getADataItem()
	 * @generated
	 */
	EReference getADataItem_Notes();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.AValueDef <em>AValue Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AValue Def</em>'.
	 * @see de.symo.model.base.AValueDef
	 * @generated
	 */
	EClass getAValueDef();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.AValueDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.symo.model.base.AValueDef#getValue()
	 * @see #getAValueDef()
	 * @generated
	 */
	EAttribute getAValueDef_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.AValueDef#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see de.symo.model.base.AValueDef#getUncertainty()
	 * @see #getAValueDef()
	 * @generated
	 */
	EAttribute getAValueDef_Uncertainty();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.symo.model.base.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.AParameterDef <em>AParameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AParameter Def</em>'.
	 * @see de.symo.model.base.AParameterDef
	 * @generated
	 */
	EClass getAParameterDef();

	/**
	 * Returns the meta object for the containment reference '{@link de.symo.model.base.AParameterDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.symo.model.base.AParameterDef#getValue()
	 * @see #getAParameterDef()
	 * @generated
	 */
	EReference getAParameterDef_Value();

	/**
	 * Returns the meta object for the reference '{@link de.symo.model.base.AParameterDef#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see de.symo.model.base.AParameterDef#getUnit()
	 * @see #getAParameterDef()
	 * @generated
	 */
	EReference getAParameterDef_Unit();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see de.symo.model.base.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.Unit#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see de.symo.model.base.Unit#getSymbol()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link de.symo.model.base.Unit#isSiUnit <em>Si Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Si Unit</em>'.
	 * @see de.symo.model.base.Unit#isSiUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_SiUnit();

	/**
	 * Returns the meta object for class '{@link de.symo.model.base.IOCLValidated <em>IOCL Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOCL Validated</em>'.
	 * @see de.symo.model.base.IOCLValidated
	 * @generated
	 */
	EClass getIOCLValidated();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link de.symo.model.base.impl.AVersionedModelRootImpl <em>AVersioned Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.AVersionedModelRootImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getAVersionedModelRoot()
		 * @generated
		 */
		EClass AVERSIONED_MODEL_ROOT = eINSTANCE.getAVersionedModelRoot();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERSIONED_MODEL_ROOT__META_MODEL = eINSTANCE.getAVersionedModelRoot_MetaModel();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.ANameItemImpl <em>AName Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.ANameItemImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getANameItem()
		 * @generated
		 */
		EClass ANAME_ITEM = eINSTANCE.getANameItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANAME_ITEM__NAME = eINSTANCE.getANameItem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANAME_ITEM__DESCRIPTION = eINSTANCE.getANameItem_Description();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.NoteImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TEXT = eINSTANCE.getNote_Text();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__AUTHOR = eINSTANCE.getNote_Author();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__CHILDREN = eINSTANCE.getNote_Children();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.ADataItemImpl <em>AData Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.ADataItemImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getADataItem()
		 * @generated
		 */
		EClass ADATA_ITEM = eINSTANCE.getADataItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADATA_ITEM__ID = eINSTANCE.getADataItem_Id();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADATA_ITEM__NOTES = eINSTANCE.getADataItem_Notes();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.AValueDefImpl <em>AValue Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.AValueDefImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getAValueDef()
		 * @generated
		 */
		EClass AVALUE_DEF = eINSTANCE.getAValueDef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVALUE_DEF__VALUE = eINSTANCE.getAValueDef_Value();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVALUE_DEF__UNCERTAINTY = eINSTANCE.getAValueDef_Uncertainty();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.ValueImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.AParameterDefImpl <em>AParameter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.AParameterDefImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getAParameterDef()
		 * @generated
		 */
		EClass APARAMETER_DEF = eINSTANCE.getAParameterDef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APARAMETER_DEF__VALUE = eINSTANCE.getAParameterDef_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APARAMETER_DEF__UNIT = eINSTANCE.getAParameterDef_Unit();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.impl.UnitImpl
		 * @see de.symo.model.base.impl.BasePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__SYMBOL = eINSTANCE.getUnit_Symbol();

		/**
		 * The meta object literal for the '<em><b>Si Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__SI_UNIT = eINSTANCE.getUnit_SiUnit();

		/**
		 * The meta object literal for the '{@link de.symo.model.base.IOCLValidated <em>IOCL Validated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.symo.model.base.IOCLValidated
		 * @see de.symo.model.base.impl.BasePackageImpl#getIOCLValidated()
		 * @generated
		 */
		EClass IOCL_VALIDATED = eINSTANCE.getIOCLValidated();

	}

} //BasePackage
