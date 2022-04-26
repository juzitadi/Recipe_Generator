/**
 */
package recipe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.Device#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Variable {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * The literals are from the enumeration {@link recipe.Device_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see recipe.Device_Type
	 * @see #setDevice(Device_Type)
	 * @see recipe.RecipePackage#getDevice_Device()
	 * @model
	 * @generated
	 */
	Device_Type getDevice();

	/**
	 * Sets the value of the '{@link recipe.Device#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see recipe.Device_Type
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device_Type value);

} // Device
