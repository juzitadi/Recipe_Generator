/**
 */
package recipe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.RecipeAction#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link recipe.RecipeAction#getDevices <em>Devices</em>}</li>
 *   <li>{@link recipe.RecipeAction#getTaste <em>Taste</em>}</li>
 *   <li>{@link recipe.RecipeAction#getTime <em>Time</em>}</li>
 *   <li>{@link recipe.RecipeAction#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getRecipeAction()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface RecipeAction extends Action {
	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' reference list.
	 * The list contents are of type {@link recipe.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' reference list.
	 * @see recipe.RecipePackage#getRecipeAction_Ingredients()
	 * @model
	 * @generated
	 */
	EList<Ingredient> getIngredients();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link recipe.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see recipe.RecipePackage#getRecipeAction_Devices()
	 * @model
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Taste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taste</em>' reference.
	 * @see #setTaste(Taste)
	 * @see recipe.RecipePackage#getRecipeAction_Taste()
	 * @model
	 * @generated
	 */
	Taste getTaste();

	/**
	 * Sets the value of the '{@link recipe.RecipeAction#getTaste <em>Taste</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taste</em>' reference.
	 * @see #getTaste()
	 * @generated
	 */
	void setTaste(Taste value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The literals are from the enumeration {@link recipe.Time_Range}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see recipe.Time_Range
	 * @see #setTime(Time_Range)
	 * @see recipe.RecipePackage#getRecipeAction_Time()
	 * @model
	 * @generated
	 */
	Time_Range getTime();

	/**
	 * Sets the value of the '{@link recipe.RecipeAction#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see recipe.Time_Range
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time_Range value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The literals are from the enumeration {@link recipe.Temperature_Range}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see recipe.Temperature_Range
	 * @see #setTemperature(Temperature_Range)
	 * @see recipe.RecipePackage#getRecipeAction_Temperature()
	 * @model
	 * @generated
	 */
	Temperature_Range getTemperature();

	/**
	 * Sets the value of the '{@link recipe.RecipeAction#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see recipe.Temperature_Range
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Temperature_Range value);

} // RecipeAction
