/**
 */
package socialNetworkPackage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import socialNetworkPackage.Post;
import socialNetworkPackage.SocialNetworkPackageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PostTest extends TestCase {

	/**
	 * The fixture for this Post test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Post fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PostTest.class);
	}

	/**
	 * Constructs a new Post test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Post test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Post fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Post test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Post getFixture() {
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
		setFixture(SocialNetworkPackageFactory.eINSTANCE.createPost());
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

} //PostTest
