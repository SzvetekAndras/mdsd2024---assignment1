/**
 */
package socialNetworkPackage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import socialNetworkPackage.SocialNetwork;
import socialNetworkPackage.SocialNetworkPackageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialNetworkTest extends TestCase {

	/**
	 * The fixture for this Social Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialNetwork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SocialNetworkTest.class);
	}

	/**
	 * Constructs a new Social Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Social Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SocialNetwork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Social Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialNetwork getFixture() {
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
		setFixture(SocialNetworkPackageFactory.eINSTANCE.createSocialNetwork());
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

} //SocialNetworkTest
