/**
 */
package de.symo.model.symopd.impl;

import de.symo.model.base.BasePackage;

import de.symo.model.base.impl.BasePackageImpl;

import de.symo.model.registry.RegistryPackage;

import de.symo.model.registry.impl.RegistryPackageImpl;

import de.symo.model.symopd.SymopdFactory;
import de.symo.model.symopd.SymopdPackage;
import de.symo.model.symopd.SystemComponent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymopdPackageImpl extends EPackageImpl implements SymopdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentEClass = null;

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
	 * @see de.symo.model.symopd.SymopdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymopdPackageImpl() {
		super(eNS_URI, SymopdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymopdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymopdPackage init() {
		if (isInited) return (SymopdPackage)EPackage.Registry.INSTANCE.getEPackage(SymopdPackage.eNS_URI);

		// Obtain or create and register package
		SymopdPackageImpl theSymopdPackage = (SymopdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymopdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymopdPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		RegistryPackageImpl theRegistryPackage = (RegistryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI) instanceof RegistryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI) : RegistryPackage.eINSTANCE);

		// Create package meta-data objects
		theSymopdPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theRegistryPackage.createPackageContents();

		// Initialize created meta-data
		theSymopdPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theRegistryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymopdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymopdPackage.eNS_URI, theSymopdPackage);
		return theSymopdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemComponent() {
		return systemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymopdFactory getSymopdFactory() {
		return (SymopdFactory)getEFactoryInstance();
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
		systemComponentEClass = createEClass(SYSTEM_COMPONENT);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SymopdPackageImpl
