/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Ontology#getPath <em>Path</em>}</li>
 *   <li>{@link model.Ontology#getFileName <em>File Name</em>}</li>
 *   <li>{@link model.Ontology#getMaintenanceFileName <em>Maintenance File Name</em>}</li>
 *   <li>{@link model.Ontology#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see model.ModelPackage#getOntology_Path()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link model.Ontology#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see model.ModelPackage#getOntology_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link model.Ontology#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Maintenance File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance File Name</em>' attribute.
	 * @see #setMaintenanceFileName(String)
	 * @see model.ModelPackage#getOntology_MaintenanceFileName()
	 * @model required="true"
	 * @generated
	 */
	String getMaintenanceFileName();

	/**
	 * Sets the value of the '{@link model.Ontology#getMaintenanceFileName <em>Maintenance File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance File Name</em>' attribute.
	 * @see #getMaintenanceFileName()
	 * @generated
	 */
	void setMaintenanceFileName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.OntologyLibrary#getOntologies <em>Ontologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(OntologyLibrary)
	 * @see model.ModelPackage#getOntology_Library()
	 * @see model.OntologyLibrary#getOntologies
	 * @model opposite="Ontologies" transient="false"
	 * @generated
	 */
	OntologyLibrary getLibrary();

	/**
	 * Sets the value of the '{@link model.Ontology#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(OntologyLibrary value);

} // Ontology
