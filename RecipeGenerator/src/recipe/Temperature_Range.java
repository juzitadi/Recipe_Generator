/**
 */
package recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temperature Range</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage#getTemperature_Range()
 * @model
 * @generated
 */
public enum Temperature_Range implements Enumerator {
	/**
	 * The '<em><b>LESS 150C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_150C_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_150C(1, "LESS_150C", "LESS_150C"),

	/**
	 * The '<em><b>USE150C 180C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE150C_180C_VALUE
	 * @generated
	 * @ordered
	 */
	USE150C_180C(2, "USE150C_180C", "USE150C_180C"),

	/**
	 * The '<em><b>Over 180C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_180C_VALUE
	 * @generated
	 * @ordered
	 */
	OVER_180C(3, "Over_180C", "Over_180C");

	/**
	 * The '<em><b>LESS 150C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_150C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_150C_VALUE = 1;

	/**
	 * The '<em><b>USE150C 180C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE150C_180C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USE150C_180C_VALUE = 2;

	/**
	 * The '<em><b>Over 180C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_180C
	 * @model name="Over_180C"
	 * @generated
	 * @ordered
	 */
	public static final int OVER_180C_VALUE = 3;

	/**
	 * An array of all the '<em><b>Temperature Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Temperature_Range[] VALUES_ARRAY =
		new Temperature_Range[] {
			LESS_150C,
			USE150C_180C,
			OVER_180C,
		};

	/**
	 * A public read-only list of all the '<em><b>Temperature Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Temperature_Range> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temperature Range</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Temperature_Range get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Temperature_Range result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temperature Range</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Temperature_Range getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Temperature_Range result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temperature Range</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Temperature_Range get(int value) {
		switch (value) {
			case LESS_150C_VALUE: return LESS_150C;
			case USE150C_180C_VALUE: return USE150C_180C;
			case OVER_180C_VALUE: return OVER_180C;
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
	private Temperature_Range(int value, String name, String literal) {
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
	
} //Temperature_Range
