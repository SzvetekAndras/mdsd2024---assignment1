/**
 */
package socialNetworkPackage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import socialNetworkPackage.Likes;
import socialNetworkPackage.SocialNetworkPackageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Likes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LikesTest extends TestCase {

	/**
	 * The fixture for this Likes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Likes fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LikesTest.class);
	}

	/**
	 * Constructs a new Likes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LikesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Likes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Likes fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Likes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Likes getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SocialNetworkPackageFactory.eINSTANCE.createLikes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LikesTest
