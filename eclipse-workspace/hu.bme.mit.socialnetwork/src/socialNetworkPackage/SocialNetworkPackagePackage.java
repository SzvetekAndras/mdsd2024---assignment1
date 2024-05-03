/**
 */
package socialNetworkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see socialNetworkPackage.SocialNetworkPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SocialNetworkPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "socialNetworkPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.socialnetwork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.socialnetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SocialNetworkPackagePackage eINSTANCE = socialNetworkPackage.impl.SocialNetworkPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.SocialNetworkImpl <em>Social Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.SocialNetworkImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getSocialNetwork()
	 * @generated
	 */
	int SOCIAL_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__PEOPLE = 0;

	/**
	 * The feature id for the '<em><b>Snname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__SNNAME = 1;

	/**
	 * The number of structural features of the '<em>Social Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Social Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.PersonImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__POSTS = 1;

	/**
	 * The feature id for the '<em><b>Personname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONNAME = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PAGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GROUP = 7;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIKES = 8;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.PostImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPost()
	 * @generated
	 */
	int POST = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LIKES = 1;

	/**
	 * The feature id for the '<em><b>Posttext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__POSTTEXT = 2;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.EventImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Eventname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENTNAME = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__POST = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.PageImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 4;

	/**
	 * The feature id for the '<em><b>Pagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGENAME = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__POST = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EVENT = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.CommentImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LIKES = 0;

	/**
	 * The feature id for the '<em><b>Commenttext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTTEXT = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.GroupImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Groupname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPNAME = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POST = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.LikesImpl <em>Likes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.LikesImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getLikes()
	 * @generated
	 */
	int LIKES = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Likes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Likes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.SocialNetwork <em>Social Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Network</em>'.
	 * @see socialNetworkPackage.SocialNetwork
	 * @generated
	 */
	EClass getSocialNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.SocialNetwork#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getPeople()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_People();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.SocialNetwork#getSnname <em>Snname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snname</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getSnname()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EAttribute getSocialNetwork_Snname();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see socialNetworkPackage.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see socialNetworkPackage.Person#getParent()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Person#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see socialNetworkPackage.Person#getPosts()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Posts();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Person#getPersonname <em>Personname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personname</em>'.
	 * @see socialNetworkPackage.Person#getPersonname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Personname();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Person#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see socialNetworkPackage.Person#getComment()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Person#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see socialNetworkPackage.Person#getPage()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Page();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Person#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see socialNetworkPackage.Person#getGroup()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Person#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Likes</em>'.
	 * @see socialNetworkPackage.Person#getLikes()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Likes();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see socialNetworkPackage.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see socialNetworkPackage.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see socialNetworkPackage.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Post#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comment</em>'.
	 * @see socialNetworkPackage.Post#getComment()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Comment();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Post#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Likes</em>'.
	 * @see socialNetworkPackage.Post#getLikes()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Likes();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Post#getPosttext <em>Posttext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posttext</em>'.
	 * @see socialNetworkPackage.Post#getPosttext()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Posttext();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see socialNetworkPackage.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Event#getEventname <em>Eventname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eventname</em>'.
	 * @see socialNetworkPackage.Event#getEventname()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Eventname();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Event#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see socialNetworkPackage.Event#getPost()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Post();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see socialNetworkPackage.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Page#getPagename <em>Pagename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagename</em>'.
	 * @see socialNetworkPackage.Page#getPagename()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Pagename();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Page#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see socialNetworkPackage.Page#getPost()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Page#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see socialNetworkPackage.Page#getEvent()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Event();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see socialNetworkPackage.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Comment#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Likes</em>'.
	 * @see socialNetworkPackage.Comment#getLikes()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Likes();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Comment#getCommenttext <em>Commenttext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commenttext</em>'.
	 * @see socialNetworkPackage.Comment#getCommenttext()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Commenttext();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see socialNetworkPackage.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Group#getGroupname <em>Groupname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groupname</em>'.
	 * @see socialNetworkPackage.Group#getGroupname()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Groupname();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Group#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see socialNetworkPackage.Group#getEvent()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Group#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see socialNetworkPackage.Group#getPost()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Post();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Likes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Likes</em>'.
	 * @see socialNetworkPackage.Likes
	 * @generated
	 */
	EClass getLikes();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Likes#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see socialNetworkPackage.Likes#getType()
	 * @see #getLikes()
	 * @generated
	 */
	EAttribute getLikes_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SocialNetworkPackageFactory getSocialNetworkPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.SocialNetworkImpl <em>Social Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.SocialNetworkImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getSocialNetwork()
		 * @generated
		 */
		EClass SOCIAL_NETWORK = eINSTANCE.getSocialNetwork();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__PEOPLE = eINSTANCE.getSocialNetwork_People();

		/**
		 * The meta object literal for the '<em><b>Snname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_NETWORK__SNNAME = eINSTANCE.getSocialNetwork_Snname();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.PersonImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENT = eINSTANCE.getPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__POSTS = eINSTANCE.getPerson_Posts();

		/**
		 * The meta object literal for the '<em><b>Personname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSONNAME = eINSTANCE.getPerson_Personname();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__COMMENT = eINSTANCE.getPerson_Comment();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PAGE = eINSTANCE.getPerson_Page();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__GROUP = eINSTANCE.getPerson_Group();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LIKES = eINSTANCE.getPerson_Likes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.PostImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__COMMENT = eINSTANCE.getPost_Comment();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__LIKES = eINSTANCE.getPost_Likes();

		/**
		 * The meta object literal for the '<em><b>Posttext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__POSTTEXT = eINSTANCE.getPost_Posttext();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.EventImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Eventname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENTNAME = eINSTANCE.getEvent_Eventname();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__POST = eINSTANCE.getEvent_Post();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.PageImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Pagename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PAGENAME = eINSTANCE.getPage_Pagename();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__POST = eINSTANCE.getPage_Post();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__EVENT = eINSTANCE.getPage_Event();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.CommentImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__LIKES = eINSTANCE.getComment_Likes();

		/**
		 * The meta object literal for the '<em><b>Commenttext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENTTEXT = eINSTANCE.getComment_Commenttext();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.GroupImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Groupname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__GROUPNAME = eINSTANCE.getGroup_Groupname();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__EVENT = eINSTANCE.getGroup_Event();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__POST = eINSTANCE.getGroup_Post();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.LikesImpl <em>Likes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.LikesImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getLikes()
		 * @generated
		 */
		EClass LIKES = eINSTANCE.getLikes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKES__TYPE = eINSTANCE.getLikes_Type();

	}

} //SocialNetworkPackagePackage
