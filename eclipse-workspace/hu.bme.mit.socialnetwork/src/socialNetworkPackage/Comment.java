/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Comment#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.Comment#getCommenttext <em>Commenttext</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Likes</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Likes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getComment_Likes()
	 * @model
	 * @generated
	 */
	EList<Likes> getLikes();

	/**
	 * Returns the value of the '<em><b>Commenttext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commenttext</em>' attribute.
	 * @see #setCommenttext(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getComment_Commenttext()
	 * @model required="true"
	 * @generated
	 */
	String getCommenttext();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Comment#getCommenttext <em>Commenttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commenttext</em>' attribute.
	 * @see #getCommenttext()
	 * @generated
	 */
	void setCommenttext(String value);

} // Comment
