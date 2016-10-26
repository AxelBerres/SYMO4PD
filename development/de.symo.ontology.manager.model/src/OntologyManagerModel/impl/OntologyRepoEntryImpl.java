/**
 */
package OntologyManagerModel.impl;

import OntologyManagerModel.OntologyManagerModelPackage;
import OntologyManagerModel.OntologyRepoEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Repo Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OntologyManagerModel.impl.OntologyRepoEntryImpl#getRepoURL <em>Repo URL</em>}</li>
 *   <li>{@link OntologyManagerModel.impl.OntologyRepoEntryImpl#getGitServerUsername <em>Git Server Username</em>}</li>
 *   <li>{@link OntologyManagerModel.impl.OntologyRepoEntryImpl#getGitServerPassword <em>Git Server Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyRepoEntryImpl extends OntologyEntryImpl implements OntologyRepoEntry {
	/**
	 * The default value of the '{@link #getRepoURL() <em>Repo URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REPO_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepoURL() <em>Repo URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoURL()
	 * @generated
	 * @ordered
	 */
	protected String repoURL = REPO_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGitServerUsername() <em>Git Server Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitServerUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_SERVER_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGitServerUsername() <em>Git Server Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitServerUsername()
	 * @generated
	 * @ordered
	 */
	protected String gitServerUsername = GIT_SERVER_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGitServerPassword() <em>Git Server Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitServerPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_SERVER_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGitServerPassword() <em>Git Server Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitServerPassword()
	 * @generated
	 * @ordered
	 */
	protected String gitServerPassword = GIT_SERVER_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyRepoEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologyManagerModelPackage.Literals.ONTOLOGY_REPO_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepoURL() {
		return repoURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepoURL(String newRepoURL) {
		String oldRepoURL = repoURL;
		repoURL = newRepoURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__REPO_URL, oldRepoURL, repoURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGitServerUsername() {
		return gitServerUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGitServerUsername(String newGitServerUsername) {
		String oldGitServerUsername = gitServerUsername;
		gitServerUsername = newGitServerUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_USERNAME, oldGitServerUsername, gitServerUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGitServerPassword() {
		return gitServerPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGitServerPassword(String newGitServerPassword) {
		String oldGitServerPassword = gitServerPassword;
		gitServerPassword = newGitServerPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_PASSWORD, oldGitServerPassword, gitServerPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__REPO_URL:
				return getRepoURL();
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_USERNAME:
				return getGitServerUsername();
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_PASSWORD:
				return getGitServerPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__REPO_URL:
				setRepoURL((String)newValue);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_USERNAME:
				setGitServerUsername((String)newValue);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_PASSWORD:
				setGitServerPassword((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__REPO_URL:
				setRepoURL(REPO_URL_EDEFAULT);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_USERNAME:
				setGitServerUsername(GIT_SERVER_USERNAME_EDEFAULT);
				return;
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_PASSWORD:
				setGitServerPassword(GIT_SERVER_PASSWORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__REPO_URL:
				return REPO_URL_EDEFAULT == null ? repoURL != null : !REPO_URL_EDEFAULT.equals(repoURL);
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_USERNAME:
				return GIT_SERVER_USERNAME_EDEFAULT == null ? gitServerUsername != null : !GIT_SERVER_USERNAME_EDEFAULT.equals(gitServerUsername);
			case OntologyManagerModelPackage.ONTOLOGY_REPO_ENTRY__GIT_SERVER_PASSWORD:
				return GIT_SERVER_PASSWORD_EDEFAULT == null ? gitServerPassword != null : !GIT_SERVER_PASSWORD_EDEFAULT.equals(gitServerPassword);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (repoURL: ");
		result.append(repoURL);
		result.append(", gitServerUsername: ");
		result.append(gitServerUsername);
		result.append(", gitServerPassword: ");
		result.append(gitServerPassword);
		result.append(')');
		return result.toString();
	}

} //OntologyRepoEntryImpl
