/**
 */
package recipe;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.InputAction#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getInputAction()
 * @model annotation="gmf.node figure='rounded'"
 * @generated
 */
public interface InputAction extends Action {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see recipe.RecipePackage#getInputAction_Variables()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Variable> getVariables();

} // InputAction
