/**
 */
package OntologyManagerModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Repo Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OntologyManagerModel.OntologyRepoEntry#getRepoURL <em>Repo URL</em>}</li>
 *   <li>{@link OntologyManagerModel.OntologyRepoEntry#getGitServerUsername <em>Git Server Username</em>}</li>
 *   <li>{@link OntologyManagerModel.OntologyRepoEntry#getGitServerPassword <em>Git Server Password</em>}</li>
 * </ul>
 *
 * @see OntologyManagerModel.OntologyManagerModelPackage#getOntologyRepoEntry()
 * @model
 * @generated
 */
public interface OntologyRepoEntry extends OntologyEntry {
	/**
	 * Returns the value of the '<em><b>Repo URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo URL</em>' attribute.
	 * @see #setRepoURL(String)
	 * @see OntologyManagerModel.OntologyManagerModelPackage#getOntologyRepoEntry_RepoURL()
	 * @model
	 * @generated
	 */
	String getRepoURL();

	/**
	 * Sets the value of the '{@link OntologyManagerModel.OntologyRepoEntry#getRepoURL <em>Repo URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo URL</em>' attribute.
	 * @see #getRepoURL()
	 * @generated
	 */
	void setRepoURL(String value);

	/**
	 * Returns the value of the '<em><b>Git Server Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Git Server Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git Server Username</em>' attribute.
	 * @see #setGitServerUsername(String)
	 * @see OntologyManagerModel.OntologyManagerModelPackage#getOntologyRepoEntry_GitServerUsername()
	 * @model
	 * @generated
	 */
	String getGitServerUsername();

	/**
	 * Sets the value of the '{@link OntologyManagerModel.OntologyRepoEntry#getGitServerUsername <em>Git Server Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git Server Username</em>' attribute.
	 * @see #getGitServerUsername()
	 * @generated
	 */
	void setGitServerUsername(String value);

	/**
	 * Returns the value of the '<em><b>Git Server Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Git Server Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git Server Password</em>' attribute.
	 * @see #setGitServerPassword(String)
	 * @see OntologyManagerModel.OntologyManagerModelPackage#getOntologyRepoEntry_GitServerPassword()
	 * @model
	 * @generated
	 */
	String getGitServerPassword();

	/**
	 * Sets the value of the '{@link OntologyManagerModel.OntologyRepoEntry#getGitServerPassword <em>Git Server Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git Server Password</em>' attribute.
	 * @see #getGitServerPassword()
	 * @generated
	 */
	void setGitServerPassword(String value);

} // OntologyRepoEntry
