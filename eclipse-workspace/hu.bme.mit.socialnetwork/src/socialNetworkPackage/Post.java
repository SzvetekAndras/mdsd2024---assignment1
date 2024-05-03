/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Post#getComment <em>Comment</em>}</li>
 *   <li>{@link socialNetworkPackage.Post#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.Post#getPosttext <em>Posttext</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPost()
 * @model
 * @generated
 */
public interface Post extends EObject {

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPost_Comment()
	 * @model
	 * @generated
	 */
	EList<Comment> getComment();

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Likes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPost_Likes()
	 * @model
	 * @generated
	 */
	EList<Likes> getLikes();

	/**
	 * Returns the value of the '<em><b>Posttext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posttext</em>' attribute.
	 * @see #setPosttext(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPost_Posttext()
	 * @model required="true"
	 * @generated
	 */
	String getPosttext();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Post#getPosttext <em>Posttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posttext</em>' attribute.
	 * @see #getPosttext()
	 * @generated
	 */
	void setPosttext(String value);
} // Post
