/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Group#getGroupname <em>Groupname</em>}</li>
 *   <li>{@link socialNetworkPackage.Group#getEvent <em>Event</em>}</li>
 *   <li>{@link socialNetworkPackage.Group#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Groupname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupname</em>' attribute.
	 * @see #setGroupname(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getGroup_Groupname()
	 * @model required="true"
	 * @generated
	 */
	String getGroupname();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Group#getGroupname <em>Groupname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupname</em>' attribute.
	 * @see #getGroupname()
	 * @generated
	 */
	void setGroupname(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getGroup_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getGroup_Post()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPost();

} // Group
