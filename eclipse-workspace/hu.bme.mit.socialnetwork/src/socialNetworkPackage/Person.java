/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Person#getParent <em>Parent</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getPosts <em>Posts</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getPersonname <em>Personname</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getComment <em>Comment</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getPage <em>Page</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getId <em>Id</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getGroup <em>Group</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getLikes <em>Likes</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Parent()
	 * @model upper="2"
	 * @generated
	 */
	EList<Person> getParent();

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Posts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Personname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personname</em>' attribute.
	 * @see #setPersonname(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Personname()
	 * @model required="true"
	 * @generated
	 */
	String getPersonname();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Person#getPersonname <em>Personname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personname</em>' attribute.
	 * @see #getPersonname()
	 * @generated
	 */
	void setPersonname(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComment();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPage();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Likes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Likes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Likes> getLikes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Id()
	 * @model default="0" id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Person
