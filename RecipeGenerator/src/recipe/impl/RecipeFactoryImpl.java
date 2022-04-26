/**
 */
package recipe.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import recipe.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeFactoryImpl extends EFactoryImpl implements RecipeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecipeFactory init() {
		try {
			RecipeFactory theRecipeFactory = (RecipeFactory)EPackage.Registry.INSTANCE.getEFactory(RecipePackage.eNS_URI);
			if (theRecipeFactory != null) {
				return theRecipeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecipeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RecipePackage.MODEL: return createModel();
			case RecipePackage.TRANSITION: return createTransition();
			case RecipePackage.SPEAK_ACTION: return createSpeakAction();
			case RecipePackage.INSTRUCTION_ACTION: return createInstructionAction();
			case RecipePackage.INPUT_ACTION: return createInputAction();
			case RecipePackage.RECIPE_ACTION: return createRecipeAction();
			case RecipePackage.DECISION: return createDecision();
			case RecipePackage.INGREDIENT: return createIngredient();
			case RecipePackage.DEVICE: return createDevice();
			case RecipePackage.TASTE: return createTaste();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RecipePackage.INGREDIENT_TYPE:
				return createIngredient_TypeFromString(eDataType, initialValue);
			case RecipePackage.DEVICE_TYPE:
				return createDevice_TypeFromString(eDataType, initialValue);
			case RecipePackage.TASTE_PREFERENCE:
				return createTaste_PreferenceFromString(eDataType, initialValue);
			case RecipePackage.TIME_RANGE:
				return createTime_RangeFromString(eDataType, initialValue);
			case RecipePackage.TEMPERATURE_RANGE:
				return createTemperature_RangeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RecipePackage.INGREDIENT_TYPE:
				return convertIngredient_TypeToString(eDataType, instanceValue);
			case RecipePackage.DEVICE_TYPE:
				return convertDevice_TypeToString(eDataType, instanceValue);
			case RecipePackage.TASTE_PREFERENCE:
				return convertTaste_PreferenceToString(eDataType, instanceValue);
			case RecipePackage.TIME_RANGE:
				return convertTime_RangeToString(eDataType, instanceValue);
			case RecipePackage.TEMPERATURE_RANGE:
				return convertTemperature_RangeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeakAction createSpeakAction() {
		SpeakActionImpl speakAction = new SpeakActionImpl();
		return speakAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstructionAction createInstructionAction() {
		InstructionActionImpl instructionAction = new InstructionActionImpl();
		return instructionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputAction createInputAction() {
		InputActionImpl inputAction = new InputActionImpl();
		return inputAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipeAction createRecipeAction() {
		RecipeActionImpl recipeAction = new RecipeActionImpl();
		return recipeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingredient createIngredient() {
		IngredientImpl ingredient = new IngredientImpl();
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste createTaste() {
		TasteImpl taste = new TasteImpl();
		return taste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient_Type createIngredient_TypeFromString(EDataType eDataType, String initialValue) {
		Ingredient_Type result = Ingredient_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIngredient_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_Type createDevice_TypeFromString(EDataType eDataType, String initialValue) {
		Device_Type result = Device_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDevice_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taste_Preference createTaste_PreferenceFromString(EDataType eDataType, String initialValue) {
		Taste_Preference result = Taste_Preference.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaste_PreferenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time_Range createTime_RangeFromString(EDataType eDataType, String initialValue) {
		Time_Range result = Time_Range.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTime_RangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temperature_Range createTemperature_RangeFromString(EDataType eDataType, String initialValue) {
		Temperature_Range result = Temperature_Range.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemperature_RangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipePackage getRecipePackage() {
		return (RecipePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecipePackage getPackage() {
		return RecipePackage.eINSTANCE;
	}

} //RecipeFactoryImpl
