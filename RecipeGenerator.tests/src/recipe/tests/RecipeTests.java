/**
 */
package recipe.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>recipe</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RecipeTests("recipe Tests");
		suite.addTestSuite(SpeakActionTest.class);
		suite.addTestSuite(InstructionActionTest.class);
		suite.addTestSuite(InputActionTest.class);
		suite.addTestSuite(RecipeActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeTests(String name) {
		super(name);
	}

} //RecipeTests
