/**
 */
package recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Range</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage#getTime_Range()
 * @model
 * @generated
 */
public enum Time_Range implements Enumerator {
	/**
	 * The '<em><b>LESS 30MINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_30MINS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_30MINS(1, "LESS_30MINS", "LESS_30MINS"),

	/**
	 * The '<em><b>USE 30MINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_30MINS_VALUE
	 * @generated
	 * @ordered
	 */
	USE_30MINS(2, "USE_30MINS", "USE_30MINS"),

	/**
	 * The '<em><b>OVER 30MINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_30MINS_VALUE
	 * @generated
	 * @ordered
	 */
	OVER_30MINS(3, "OVER_30MINS", "OVER_30MINS");

	/**
	 * The '<em><b>LESS 30MINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_30MINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_30MINS_VALUE = 1;

	/**
	 * The '<em><b>USE 30MINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_30MINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USE_30MINS_VALUE = 2;

	/**
	 * The '<em><b>OVER 30MINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_30MINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVER_30MINS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Time Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Time_Range[] VALUES_ARRAY =
		new Time_Range[] {
			LESS_30MINS,
			USE_30MINS,
			OVER_30MINS,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Time_Range> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Range</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Time_Range get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Time_Range result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Range</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Time_Range getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Time_Range result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Range</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Time_Range get(int value) {
		switch (value) {
			case LESS_30MINS_VALUE: return LESS_30MINS;
			case USE_30MINS_VALUE: return USE_30MINS;
			case OVER_30MINS_VALUE: return OVER_30MINS;
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
	private Time_Range(int value, String name, String literal) {
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
	
} //Time_Range
