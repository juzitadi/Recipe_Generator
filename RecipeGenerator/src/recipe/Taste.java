/**
 */
package recipe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.Taste#getTaste <em>Taste</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getTaste()
 * @model
 * @generated
 */
public interface Taste extends Variable {
	/**
	 * Returns the value of the '<em><b>Taste</b></em>' attribute.
	 * The literals are from the enumeration {@link recipe.Taste_Preference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taste</em>' attribute.
	 * @see recipe.Taste_Preference
	 * @see #setTaste(Taste_Preference)
	 * @see recipe.RecipePackage#getTaste_Taste()
	 * @model
	 * @generated
	 */
	Taste_Preference getTaste();

	/**
	 * Sets the value of the '{@link recipe.Taste#getTaste <em>Taste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taste</em>' attribute.
	 * @see recipe.Taste_Preference
	 * @see #getTaste()
	 * @generated
	 */
	void setTaste(Taste_Preference value);

} // Taste
