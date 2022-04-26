/**
 */
package recipe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.Ingredient#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link recipe.Ingredient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends Variable {
	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' attribute.
	 * The literals are from the enumeration {@link recipe.Ingredient_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' attribute.
	 * @see recipe.Ingredient_Type
	 * @see #setIngredient(Ingredient_Type)
	 * @see recipe.RecipePackage#getIngredient_Ingredient()
	 * @model
	 * @generated
	 */
	Ingredient_Type getIngredient();

	/**
	 * Sets the value of the '{@link recipe.Ingredient#getIngredient <em>Ingredient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingredient</em>' attribute.
	 * @see recipe.Ingredient_Type
	 * @see #getIngredient()
	 * @generated
	 */
	void setIngredient(Ingredient_Type value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(String)
	 * @see recipe.RecipePackage#getIngredient_Amount()
	 * @model
	 * @generated
	 */
	String getAmount();

	/**
	 * Sets the value of the '{@link recipe.Ingredient#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(String value);

} // Ingredient
