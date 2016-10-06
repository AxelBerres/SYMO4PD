/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.OntologyLibrary#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link model.OntologyLibrary#getName <em>Name</em>}</li>
 *   <li>{@link model.OntologyLibrary#getActiveRepository <em>Active Repository</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getOntologyLibrary()
 * @model
 * @generated
 */
public interface OntologyLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link model.OntologyRepository}.
	 * It is bidirectional and its opposite is '{@link model.OntologyRepository#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see model.ModelPackage#getOntologyLibrary_Repositories()
	 * @see model.OntologyRepository#getLibrary
	 * @model opposite="Library" containment="true" keys="URL"
	 * @generated
	 */
	EList<OntologyRepository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getOntologyLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.OntologyLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Active Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Repository</em>' reference.
	 * @see #setActiveRepository(OntologyRepository)
	 * @see model.ModelPackage#getOntologyLibrary_ActiveRepository()
	 * @model keys="URL"
	 * @generated
	 */
	OntologyRepository getActiveRepository();

	/**
	 * Sets the value of the '{@link model.OntologyLibrary#getActiveRepository <em>Active Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Repository</em>' reference.
	 * @see #getActiveRepository()
	 * @generated
	 */
	void setActiveRepository(OntologyRepository value);

} // OntologyLibrary
