/**
 */
package recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Taste Preference</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage#getTaste_Preference()
 * @model
 * @generated
 */
public enum Taste_Preference implements Enumerator {
	/**
	 * The '<em><b>MORE SWEET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE_SWEET_VALUE
	 * @generated
	 * @ordered
	 */
	MORE_SWEET(1, "MORE_SWEET", "MORE_SWEET"),

	/**
	 * The '<em><b>AVERAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE(2, "AVERAGE", "AVERAGE"),

	/**
	 * The '<em><b>LIGHT SWEET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_SWEET_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_SWEET(3, "LIGHT_SWEET", "LIGHT_SWEET");

	/**
	 * The '<em><b>MORE SWEET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE_SWEET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MORE_SWEET_VALUE = 1;

	/**
	 * The '<em><b>AVERAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_VALUE = 2;

	/**
	 * The '<em><b>LIGHT SWEET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_SWEET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_SWEET_VALUE = 3;

	/**
	 * An array of all the '<em><b>Taste Preference</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Taste_Preference[] VALUES_ARRAY =
		new Taste_Preference[] {
			MORE_SWEET,
			AVERAGE,
			LIGHT_SWEET,
		};

	/**
	 * A public read-only list of all the '<em><b>Taste Preference</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Taste_Preference> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Taste Preference</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Taste_Preference get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Taste_Preference result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Taste Preference</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Taste_Preference getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Taste_Preference result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Taste Preference</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Taste_Preference get(int value) {
		switch (value) {
			case MORE_SWEET_VALUE: return MORE_SWEET;
			case AVERAGE_VALUE: return AVERAGE;
			case LIGHT_SWEET_VALUE: return LIGHT_SWEET;
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
	private Taste_Preference(int value, String name, String literal) {
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
	
} //Taste_Preference
