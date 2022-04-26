/**
 */
package recipe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import recipe.Device;
import recipe.Ingredient;
import recipe.RecipeAction;
import recipe.RecipePackage;
import recipe.Taste;
import recipe.Taste_Preference;
import recipe.Temperature_Range;
import recipe.Time_Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.RecipeActionImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link recipe.impl.RecipeActionImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link recipe.impl.RecipeActionImpl#getTaste <em>Taste</em>}</li>
 *   <li>{@link recipe.impl.RecipeActionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link recipe.impl.RecipeActionImpl#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeActionImpl extends ActionImpl implements RecipeAction {
	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredients;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getTaste() <em>Taste</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaste()
	 * @generated
	 * @ordered
	 */
	protected Taste taste;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Time_Range TIME_EDEFAULT = Time_Range.LESS_30MINS;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time_Range time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Temperature_Range TEMPERATURE_EDEFAULT = Temperature_Range.LESS_150C;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected Temperature_Range temperature = TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.RECIPE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ingredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectResolvingEList<Ingredient>(Ingredient.class, this, RecipePackage.RECIPE_ACTION__INGREDIENTS);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<Device>(Device.class, this, RecipePackage.RECIPE_ACTION__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste getTaste() {
		if (taste != null && taste.eIsProxy()) {
			InternalEObject oldTaste = (InternalEObject)taste;
			taste = (Taste)eResolveProxy(oldTaste);
			if (taste != oldTaste) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.RECIPE_ACTION__TASTE, oldTaste, taste));
			}
		}
		return taste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taste basicGetTaste() {
		return taste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaste(Taste newTaste) {
		Taste oldTaste = taste;
		taste = newTaste;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE_ACTION__TASTE, oldTaste, taste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time_Range getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Time_Range newTime) {
		Time_Range oldTime = time;
		time = newTime == null ? TIME_EDEFAULT : newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE_ACTION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temperature_Range getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(Temperature_Range newTemperature) {
		Temperature_Range oldTemperature = temperature;
		temperature = newTemperature == null ? TEMPERATURE_EDEFAULT : newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE_ACTION__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.RECIPE_ACTION__INGREDIENTS:
				return getIngredients();
			case RecipePackage.RECIPE_ACTION__DEVICES:
				return getDevices();
			case RecipePackage.RECIPE_ACTION__TASTE:
				if (resolve) return getTaste();
				return basicGetTaste();
			case RecipePackage.RECIPE_ACTION__TIME:
				return getTime();
			case RecipePackage.RECIPE_ACTION__TEMPERATURE:
				return getTemperature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecipePackage.RECIPE_ACTION__INGREDIENTS:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends Ingredient>)newValue);
				return;
			case RecipePackage.RECIPE_ACTION__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case RecipePackage.RECIPE_ACTION__TASTE:
				setTaste((Taste)newValue);
				return;
			case RecipePackage.RECIPE_ACTION__TIME:
				setTime((Time_Range)newValue);
				return;
			case RecipePackage.RECIPE_ACTION__TEMPERATURE:
				setTemperature((Temperature_Range)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecipePackage.RECIPE_ACTION__INGREDIENTS:
				getIngredients().clear();
				return;
			case RecipePackage.RECIPE_ACTION__DEVICES:
				getDevices().clear();
				return;
			case RecipePackage.RECIPE_ACTION__TASTE:
				setTaste((Taste)null);
				return;
			case RecipePackage.RECIPE_ACTION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case RecipePackage.RECIPE_ACTION__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecipePackage.RECIPE_ACTION__INGREDIENTS:
				return ingredients != null && !ingredients.isEmpty();
			case RecipePackage.RECIPE_ACTION__DEVICES:
				return devices != null && !devices.isEmpty();
			case RecipePackage.RECIPE_ACTION__TASTE:
				return taste != null;
			case RecipePackage.RECIPE_ACTION__TIME:
				return time != TIME_EDEFAULT;
			case RecipePackage.RECIPE_ACTION__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(')');
		return result.toString();
	}

} //RecipeActionImpl
