/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.OntologyRepository#getURL <em>URL</em>}</li>
 *   <li>{@link model.OntologyRepository#getUsername <em>Username</em>}</li>
 *   <li>{@link model.OntologyRepository#getPassword <em>Password</em>}</li>
 *   <li>{@link model.OntologyRepository#isActive <em>Active</em>}</li>
 *   <li>{@link model.OntologyRepository#getOntology <em>Ontology</em>}</li>
 *   <li>{@link model.OntologyRepository#getMaintenanceOntology <em>Maintenance Ontology</em>}</li>
 *   <li>{@link model.OntologyRepository#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getOntologyRepository()
 * @model
 * @generated
 */
public interface OntologyRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see model.ModelPackage#getOntologyRepository_URL()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see model.ModelPackage#getOntologyRepository_Username()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see model.ModelPackage#getOntologyRepository_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see model.ModelPackage#getOntologyRepository_Active()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' attribute.
	 * @see #setOntology(String)
	 * @see model.ModelPackage#getOntologyRepository_Ontology()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOntology();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#getOntology <em>Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' attribute.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(String value);

	/**
	 * Returns the value of the '<em><b>Maintenance Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Ontology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Ontology</em>' attribute.
	 * @see #setMaintenanceOntology(String)
	 * @see model.ModelPackage#getOntologyRepository_MaintenanceOntology()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMaintenanceOntology();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#getMaintenanceOntology <em>Maintenance Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Ontology</em>' attribute.
	 * @see #getMaintenanceOntology()
	 * @generated
	 */
	void setMaintenanceOntology(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.OntologyLibrary#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(OntologyLibrary)
	 * @see model.ModelPackage#getOntologyRepository_Library()
	 * @see model.OntologyLibrary#getRepositories
	 * @model opposite="Repositories" keys="Name" transient="false"
	 * @generated
	 */
	OntologyLibrary getLibrary();

	/**
	 * Sets the value of the '{@link model.OntologyRepository#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(OntologyLibrary value);

} // OntologyRepository
