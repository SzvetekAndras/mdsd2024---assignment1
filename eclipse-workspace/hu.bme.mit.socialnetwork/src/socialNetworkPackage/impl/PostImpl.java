/**
 */
package socialNetworkPackage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import socialNetworkPackage.Comment;
import socialNetworkPackage.Likes;
import socialNetworkPackage.Post;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.PostImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PostImpl#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PostImpl#getPosttext <em>Posttext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostImpl extends MinimalEObjectImpl.Container implements Post {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;
	/**
	 * The cached value of the '{@link #getLikes() <em>Likes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected EList<Likes> likes;

	/**
	 * The default value of the '{@link #getPosttext() <em>Posttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosttext()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTTEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPosttext() <em>Posttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosttext()
	 * @generated
	 * @ordered
	 */
	protected String posttext = POSTTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.POST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectResolvingEList<Comment>(Comment.class, this, SocialNetworkPackagePackage.POST__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Likes> getLikes() {
		if (likes == null) {
			likes = new EObjectResolvingEList<Likes>(Likes.class, this, SocialNetworkPackagePackage.POST__LIKES);
		}
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosttext() {
		return posttext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosttext(String newPosttext) {
		String oldPosttext = posttext;
		posttext = newPosttext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.POST__POSTTEXT, oldPosttext, posttext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.POST__COMMENT:
				return getComment();
			case SocialNetworkPackagePackage.POST__LIKES:
				return getLikes();
			case SocialNetworkPackagePackage.POST__POSTTEXT:
				return getPosttext();
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
			case SocialNetworkPackagePackage.POST__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case SocialNetworkPackagePackage.POST__LIKES:
				getLikes().clear();
				getLikes().addAll((Collection<? extends Likes>)newValue);
				return;
			case SocialNetworkPackagePackage.POST__POSTTEXT:
				setPosttext((String)newValue);
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
			case SocialNetworkPackagePackage.POST__COMMENT:
				getComment().clear();
				return;
			case SocialNetworkPackagePackage.POST__LIKES:
				getLikes().clear();
				return;
			case SocialNetworkPackagePackage.POST__POSTTEXT:
				setPosttext(POSTTEXT_EDEFAULT);
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
			case SocialNetworkPackagePackage.POST__COMMENT:
				return comment != null && !comment.isEmpty();
			case SocialNetworkPackagePackage.POST__LIKES:
				return likes != null && !likes.isEmpty();
			case SocialNetworkPackagePackage.POST__POSTTEXT:
				return POSTTEXT_EDEFAULT == null ? posttext != null : !POSTTEXT_EDEFAULT.equals(posttext);
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
		result.append(" (posttext: ");
		result.append(posttext);
		result.append(')');
		return result.toString();
	}

} //PostImpl
