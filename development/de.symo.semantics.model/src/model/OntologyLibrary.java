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
 *   <li>{@link model.OntologyLibrary#getOntologies <em>Ontologies</em>}</li>
 *   <li>{@link model.OntologyLibrary#getActiveOntology <em>Active Ontology</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getOntologyLibrary()
 * @model
 * @generated
 */
public interface OntologyLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontologies</b></em>' containment reference list.
	 * The list contents are of type {@link model.Ontology}.
	 * It is bidirectional and its opposite is '{@link model.Ontology#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontologies</em>' containment reference list.
	 * @see model.ModelPackage#getOntologyLibrary_Ontologies()
	 * @see model.Ontology#getLibrary
	 * @model opposite="Library" containment="true" keys="Path"
	 * @generated
	 */
	EList<Ontology> getOntologies();

	/**
	 * Returns the value of the '<em><b>Active Ontology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Ontology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Ontology</em>' reference.
	 * @see #setActiveOntology(Ontology)
	 * @see model.ModelPackage#getOntologyLibrary_ActiveOntology()
	 * @model keys="Path"
	 * @generated
	 */
	Ontology getActiveOntology();

	/**
	 * Sets the value of the '{@link model.OntologyLibrary#getActiveOntology <em>Active Ontology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Ontology</em>' reference.
	 * @see #getActiveOntology()
	 * @generated
	 */
	void setActiveOntology(Ontology value);

} // OntologyLibrary
