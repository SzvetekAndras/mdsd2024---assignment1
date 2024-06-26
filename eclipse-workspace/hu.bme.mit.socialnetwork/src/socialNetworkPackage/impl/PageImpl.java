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
import org.eclipse.emf.ecore.util.InternalEList;
import socialNetworkPackage.Event;
import socialNetworkPackage.Page;
import socialNetworkPackage.Post;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.PageImpl#getPagename <em>Pagename</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PageImpl#getPost <em>Post</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.PageImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getPagename() <em>Pagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagename()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPagename() <em>Pagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagename()
	 * @generated
	 * @ordered
	 */
	protected String pagename = PAGENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> post;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPagename() {
		return pagename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagename(String newPagename) {
		String oldPagename = pagename;
		pagename = newPagename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.PAGE__PAGENAME, oldPagename, pagename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPost() {
		if (post == null) {
			post = new EObjectContainmentEList<Post>(Post.class, this, SocialNetworkPackagePackage.PAGE__POST);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, SocialNetworkPackagePackage.PAGE__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SocialNetworkPackagePackage.PAGE__POST:
				return ((InternalEList<?>)getPost()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.PAGE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case SocialNetworkPackagePackage.PAGE__PAGENAME:
				return getPagename();
			case SocialNetworkPackagePackage.PAGE__POST:
				return getPost();
			case SocialNetworkPackagePackage.PAGE__EVENT:
				return getEvent();
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
			case SocialNetworkPackagePackage.PAGE__PAGENAME:
				setPagename((String)newValue);
				return;
			case SocialNetworkPackagePackage.PAGE__POST:
				getPost().clear();
				getPost().addAll((Collection<? extends Post>)newValue);
				return;
			case SocialNetworkPackagePackage.PAGE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
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
			case SocialNetworkPackagePackage.PAGE__PAGENAME:
				setPagename(PAGENAME_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.PAGE__POST:
				getPost().clear();
				return;
			case SocialNetworkPackagePackage.PAGE__EVENT:
				getEvent().clear();
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
			case SocialNetworkPackagePackage.PAGE__PAGENAME:
				return PAGENAME_EDEFAULT == null ? pagename != null : !PAGENAME_EDEFAULT.equals(pagename);
			case SocialNetworkPackagePackage.PAGE__POST:
				return post != null && !post.isEmpty();
			case SocialNetworkPackagePackage.PAGE__EVENT:
				return event != null && !event.isEmpty();
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
		result.append(" (pagename: ");
		result.append(pagename);
		result.append(')');
		return result.toString();
	}

} //PageImpl
