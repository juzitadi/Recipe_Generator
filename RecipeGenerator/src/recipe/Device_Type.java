/**
 */
package recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage#getDevice_Type()
 * @model
 * @generated
 */
public enum Device_Type implements Enumerator {
	/**
	 * The '<em><b>OVEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVEN_VALUE
	 * @generated
	 * @ordered
	 */
	OVEN(1, "OVEN", "OVEN"),

	/**
	 * The '<em><b>ELECTRIC MIXER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_MIXER_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRIC_MIXER(2, "ELECTRIC_MIXER", "ELECTRIC_MIXER"),

	/**
	 * The '<em><b>PAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN_VALUE
	 * @generated
	 * @ordered
	 */
	PAN(3, "PAN", "PAN");

	/**
	 * The '<em><b>OVEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVEN_VALUE = 1;

	/**
	 * The '<em><b>ELECTRIC MIXER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_MIXER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_MIXER_VALUE = 2;

	/**
	 * The '<em><b>PAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Device_Type[] VALUES_ARRAY =
		new Device_Type[] {
			OVEN,
			ELECTRIC_MIXER,
			PAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Device_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Device_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Device_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Device_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Device_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Device_Type get(int value) {
		switch (value) {
			case OVEN_VALUE: return OVEN;
			case ELECTRIC_MIXER_VALUE: return ELECTRIC_MIXER;
			case PAN_VALUE: return PAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Device_Type(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Device_Type
