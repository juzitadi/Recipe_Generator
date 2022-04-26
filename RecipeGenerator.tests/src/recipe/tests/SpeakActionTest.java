/**
 */
package recipe.tests;

import junit.textui.TestRunner;

import recipe.RecipeFactory;
import recipe.SpeakAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Speak Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeakActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpeakActionTest.class);
	}

	/**
	 * Constructs a new Speak Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeakActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Speak Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpeakAction getFixture() {
		return (SpeakAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RecipeFactory.eINSTANCE.createSpeakAction());
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

} //SpeakActionTest
