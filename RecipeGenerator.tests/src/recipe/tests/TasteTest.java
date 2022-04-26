/**
 */
package recipe.tests;

import junit.textui.TestRunner;

import recipe.RecipeFactory;
import recipe.Taste;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Taste</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasteTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TasteTest.class);
	}

	/**
	 * Constructs a new Taste test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Taste test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Taste getFixture() {
		return (Taste)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RecipeFactory.eINSTANCE.createTaste());
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

} //TasteTest
