/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Page#getPagename <em>Pagename</em>}</li>
 *   <li>{@link socialNetworkPackage.Page#getPost <em>Post</em>}</li>
 *   <li>{@link socialNetworkPackage.Page#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Pagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagename</em>' attribute.
	 * @see #setPagename(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPage_Pagename()
	 * @model required="true"
	 * @generated
	 */
	String getPagename();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Page#getPagename <em>Pagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagename</em>' attribute.
	 * @see #getPagename()
	 * @generated
	 */
	void setPagename(String value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPage_Post()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPost();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPage_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

} // Page
