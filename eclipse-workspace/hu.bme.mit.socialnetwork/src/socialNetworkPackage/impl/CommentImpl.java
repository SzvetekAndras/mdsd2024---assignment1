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
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.CommentImpl#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.CommentImpl#getCommenttext <em>Commenttext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
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
	 * The default value of the '{@link #getCommenttext() <em>Commenttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommenttext()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTTEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommenttext() <em>Commenttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommenttext()
	 * @generated
	 * @ordered
	 */
	protected String commenttext = COMMENTTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Likes> getLikes() {
		if (likes == null) {
			likes = new EObjectResolvingEList<Likes>(Likes.class, this, SocialNetworkPackagePackage.COMMENT__LIKES);
		}
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommenttext() {
		return commenttext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommenttext(String newCommenttext) {
		String oldCommenttext = commenttext;
		commenttext = newCommenttext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.COMMENT__COMMENTTEXT, oldCommenttext, commenttext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.COMMENT__LIKES:
				return getLikes();
			case SocialNetworkPackagePackage.COMMENT__COMMENTTEXT:
				return getCommenttext();
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
			case SocialNetworkPackagePackage.COMMENT__LIKES:
				getLikes().clear();
				getLikes().addAll((Collection<? extends Likes>)newValue);
				return;
			case SocialNetworkPackagePackage.COMMENT__COMMENTTEXT:
				setCommenttext((String)newValue);
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
			case SocialNetworkPackagePackage.COMMENT__LIKES:
				getLikes().clear();
				return;
			case SocialNetworkPackagePackage.COMMENT__COMMENTTEXT:
				setCommenttext(COMMENTTEXT_EDEFAULT);
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
			case SocialNetworkPackagePackage.COMMENT__LIKES:
				return likes != null && !likes.isEmpty();
			case SocialNetworkPackagePackage.COMMENT__COMMENTTEXT:
				return COMMENTTEXT_EDEFAULT == null ? commenttext != null : !COMMENTTEXT_EDEFAULT.equals(commenttext);
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
		result.append(" (commenttext: ");
		result.append(commenttext);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
