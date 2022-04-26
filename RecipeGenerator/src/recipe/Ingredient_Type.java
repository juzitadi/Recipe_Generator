/**
 */
package recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ingredient Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see recipe.RecipePackage#getIngredient_Type()
 * @model
 * @generated
 */
public enum Ingredient_Type implements Enumerator {
	/**
	 * The '<em><b>MILK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILK_VALUE
	 * @generated
	 * @ordered
	 */
	MILK(1, "MILK", "MILK"),

	/**
	 * The '<em><b>BUTTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTER_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTER(2, "BUTTER", "BUTTER"),

	/**
	 * The '<em><b>SUGAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGAR_VALUE
	 * @generated
	 * @ordered
	 */
	SUGAR(3, "SUGAR", "SUGAR"),

	/**
	 * The '<em><b>EGG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGG_VALUE
	 * @generated
	 * @ordered
	 */
	EGG(4, "EGG", "EGG"),

	/**
	 * The '<em><b>CHOCOLATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOCOLATE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOCOLATE(5, "CHOCOLATE", "CHOCOLATE"),

	/**
	 * The '<em><b>FLOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOUR_VALUE
	 * @generated
	 * @ordered
	 */
	FLOUR(6, "FLOUR", "FLOUR"),

	/**
	 * The '<em><b>SALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALT_VALUE
	 * @generated
	 * @ordered
	 */
	SALT(7, "SALT", "SALT"),

	/**
	 * The '<em><b>OIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_VALUE
	 * @generated
	 * @ordered
	 */
	OIL(8, "OIL", "OIL");

	/**
	 * The '<em><b>MILK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MILK_VALUE = 1;

	/**
	 * The '<em><b>BUTTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTER_VALUE = 2;

	/**
	 * The '<em><b>SUGAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUGAR_VALUE = 3;

	/**
	 * The '<em><b>EGG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EGG_VALUE = 4;

	/**
	 * The '<em><b>CHOCOLATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOCOLATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHOCOLATE_VALUE = 5;

	/**
	 * The '<em><b>FLOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOUR_VALUE = 6;

	/**
	 * The '<em><b>SALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SALT_VALUE = 7;

	/**
	 * The '<em><b>OIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OIL_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ingredient Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Ingredient_Type[] VALUES_ARRAY =
		new Ingredient_Type[] {
			MILK,
			BUTTER,
			SUGAR,
			EGG,
			CHOCOLATE,
			FLOUR,
			SALT,
			OIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ingredient Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Ingredient_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ingredient Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ingredient_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ingredient_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ingredient Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ingredient_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ingredient_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ingredient Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ingredient_Type get(int value) {
		switch (value) {
			case MILK_VALUE: return MILK;
			case BUTTER_VALUE: return BUTTER;
			case SUGAR_VALUE: return SUGAR;
			case EGG_VALUE: return EGG;
			case CHOCOLATE_VALUE: return CHOCOLATE;
			case FLOUR_VALUE: return FLOUR;
			case SALT_VALUE: return SALT;
			case OIL_VALUE: return OIL;
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
	private Ingredient_Type(int value, String name, String literal) {
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
	
} //Ingredient_Type
