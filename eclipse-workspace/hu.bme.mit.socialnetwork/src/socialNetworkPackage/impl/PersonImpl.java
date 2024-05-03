/**
 */
package socialNetworkPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import socialNetworkPackage.Comment;
import socialNetworkPackage.Group;
import socialNetworkPackage.Likes;
import socialNetworkPackage.Page;
import socialNetworkPackage.Person;
import socialNetworkPackage.Post;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getPage <em>Page</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PersonImpl#getLikes <em>Likes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> parent;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * The default value of the '{@link #getPersonname() <em>Personname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonname()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonname() <em>Personname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonname()
	 * @generated
	 * @ordered
	 */
	protected String personname = PERSONNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getLikes() <em>Likes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected EList<Likes> likes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getParent() {
		if (parent == null) {
			parent = new EObjectResolvingEList<Person>(Person.class, this, SocialNetworkPackagePackage.PERSON__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectContainmentEList<Post>(Post.class, this, SocialNetworkPackagePackage.PERSON__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonname() {
		return personname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonname(String newPersonname) {
		String oldPersonname = personname;
		personname = newPersonname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.PERSON__PERSONNAME, oldPersonname, personname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this, SocialNetworkPackagePackage.PERSON__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, SocialNetworkPackagePackage.PERSON__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, SocialNetworkPackagePackage.PERSON__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Likes> getLikes() {
		if (likes == null) {
			likes = new EObjectContainmentEList<Likes>(Likes.class, this, SocialNetworkPackagePackage.PERSON__LIKES);
		}
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.PERSON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SocialNetworkPackagePackage.PERSON__POSTS:
				return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.PERSON__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.PERSON__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.PERSON__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.PERSON__LIKES:
				return ((InternalEList<?>)getLikes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.PERSON__PARENT:
				return getParent();
			case SocialNetworkPackagePackage.PERSON__POSTS:
				return getPosts();
			case SocialNetworkPackagePackage.PERSON__PERSONNAME:
				return getPersonname();
			case SocialNetworkPackagePackage.PERSON__COMMENT:
				return getComment();
			case SocialNetworkPackagePackage.PERSON__PAGE:
				return getPage();
			case SocialNetworkPackagePackage.PERSON__ID:
				return getId();
			case SocialNetworkPackagePackage.PERSON__EMAIL:
				return getEmail();
			case SocialNetworkPackagePackage.PERSON__GROUP:
				return getGroup();
			case SocialNetworkPackagePackage.PERSON__LIKES:
				return getLikes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SocialNetworkPackagePackage.PERSON__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Person>)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection<? extends Post>)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__PERSONNAME:
				setPersonname((String)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends Page>)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__ID:
				setId((String)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case SocialNetworkPackagePackage.PERSON__LIKES:
				getLikes().clear();
				getLikes().addAll((Collection<? extends Likes>)newValue);
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
			case SocialNetworkPackagePackage.PERSON__PARENT:
				getParent().clear();
				return;
			case SocialNetworkPackagePackage.PERSON__POSTS:
				getPosts().clear();
				return;
			case SocialNetworkPackagePackage.PERSON__PERSONNAME:
				setPersonname(PERSONNAME_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.PERSON__COMMENT:
				getComment().clear();
				return;
			case SocialNetworkPackagePackage.PERSON__PAGE:
				getPage().clear();
				return;
			case SocialNetworkPackagePackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.PERSON__GROUP:
				getGroup().clear();
				return;
			case SocialNetworkPackagePackage.PERSON__LIKES:
				getLikes().clear();
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
			case SocialNetworkPackagePackage.PERSON__PARENT:
				return parent != null && !parent.isEmpty();
			case SocialNetworkPackagePackage.PERSON__POSTS:
				return posts != null && !posts.isEmpty();
			case SocialNetworkPackagePackage.PERSON__PERSONNAME:
				return PERSONNAME_EDEFAULT == null ? personname != null : !PERSONNAME_EDEFAULT.equals(personname);
			case SocialNetworkPackagePackage.PERSON__COMMENT:
				return comment != null && !comment.isEmpty();
			case SocialNetworkPackagePackage.PERSON__PAGE:
				return page != null && !page.isEmpty();
			case SocialNetworkPackagePackage.PERSON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SocialNetworkPackagePackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case SocialNetworkPackagePackage.PERSON__GROUP:
				return group != null && !group.isEmpty();
			case SocialNetworkPackagePackage.PERSON__LIKES:
				return likes != null && !likes.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (personname: ");
		result.append(personname);
		result.append(", Id: ");
		result.append(id);
		result.append(", Email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
