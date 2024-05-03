/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Event#getEventname <em>Eventname</em>}</li>
 *   <li>{@link socialNetworkPackage.Event#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Eventname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventname</em>' attribute.
	 * @see #setEventname(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getEvent_Eventname()
	 * @model required="true"
	 * @generated
	 */
	String getEventname();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Event#getEventname <em>Eventname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventname</em>' attribute.
	 * @see #getEventname()
	 * @generated
	 */
	void setEventname(String value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getEvent_Post()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPost();

} // Event
