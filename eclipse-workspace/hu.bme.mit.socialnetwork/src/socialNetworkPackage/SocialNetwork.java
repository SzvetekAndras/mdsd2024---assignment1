/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getPeople <em>People</em>}</li>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getSnname <em>Snname</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork()
 * @model
 * @generated
 */
public interface SocialNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

	/**
	 * Returns the value of the '<em><b>Snname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snname</em>' attribute.
	 * @see #setSnname(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_Snname()
	 * @model required="true"
	 * @generated
	 */
	String getSnname();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.SocialNetwork#getSnname <em>Snname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snname</em>' attribute.
	 * @see #getSnname()
	 * @generated
	 */
	void setSnname(String value);

} // SocialNetwork
