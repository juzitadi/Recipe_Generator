/*
 * 
 */
package recipe.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import recipe.RecipePackage;
import recipe.diagram.edit.parts.DecisionEditPart;
import recipe.diagram.edit.parts.DeviceEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.InputActionEditPart;
import recipe.diagram.edit.parts.InstructionActionEditPart;
import recipe.diagram.edit.parts.Model2EditPart;
import recipe.diagram.edit.parts.ModelEditPart;
import recipe.diagram.edit.parts.RecipeActionEditPart;
import recipe.diagram.edit.parts.SpeakActionEditPart;
import recipe.diagram.edit.parts.TasteEditPart;
import recipe.diagram.edit.parts.TransitionEditPart;
import recipe.diagram.part.RecipeDiagramEditorPlugin;

/**
 * @generated
 */
public class RecipeElementTypes {

	/**
	* @generated
	*/
	private RecipeElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			RecipeDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Model_1000 = getElementType("RecipeGenerator.diagram.Model_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SpeakAction_2001 = getElementType("RecipeGenerator.diagram.SpeakAction_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InstructionAction_2002 = getElementType(
			"RecipeGenerator.diagram.InstructionAction_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputAction_2003 = getElementType("RecipeGenerator.diagram.InputAction_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RecipeAction_2006 = getElementType("RecipeGenerator.diagram.RecipeAction_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Model_2004 = getElementType("RecipeGenerator.diagram.Model_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Decision_2005 = getElementType("RecipeGenerator.diagram.Decision_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ingredient_3001 = getElementType("RecipeGenerator.diagram.Ingredient_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Device_3002 = getElementType("RecipeGenerator.diagram.Device_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Taste_3003 = getElementType("RecipeGenerator.diagram.Taste_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transition_4001 = getElementType("RecipeGenerator.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Model_1000, RecipePackage.eINSTANCE.getModel());

			elements.put(SpeakAction_2001, RecipePackage.eINSTANCE.getSpeakAction());

			elements.put(InstructionAction_2002, RecipePackage.eINSTANCE.getInstructionAction());

			elements.put(InputAction_2003, RecipePackage.eINSTANCE.getInputAction());

			elements.put(RecipeAction_2006, RecipePackage.eINSTANCE.getRecipeAction());

			elements.put(Model_2004, RecipePackage.eINSTANCE.getModel());

			elements.put(Decision_2005, RecipePackage.eINSTANCE.getDecision());

			elements.put(Ingredient_3001, RecipePackage.eINSTANCE.getIngredient());

			elements.put(Device_3002, RecipePackage.eINSTANCE.getDevice());

			elements.put(Taste_3003, RecipePackage.eINSTANCE.getTaste());

			elements.put(Transition_4001, RecipePackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(SpeakAction_2001);
			KNOWN_ELEMENT_TYPES.add(InstructionAction_2002);
			KNOWN_ELEMENT_TYPES.add(InputAction_2003);
			KNOWN_ELEMENT_TYPES.add(RecipeAction_2006);
			KNOWN_ELEMENT_TYPES.add(Model_2004);
			KNOWN_ELEMENT_TYPES.add(Decision_2005);
			KNOWN_ELEMENT_TYPES.add(Ingredient_3001);
			KNOWN_ELEMENT_TYPES.add(Device_3002);
			KNOWN_ELEMENT_TYPES.add(Taste_3003);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModelEditPart.VISUAL_ID:
			return Model_1000;
		case SpeakActionEditPart.VISUAL_ID:
			return SpeakAction_2001;
		case InstructionActionEditPart.VISUAL_ID:
			return InstructionAction_2002;
		case InputActionEditPart.VISUAL_ID:
			return InputAction_2003;
		case RecipeActionEditPart.VISUAL_ID:
			return RecipeAction_2006;
		case Model2EditPart.VISUAL_ID:
			return Model_2004;
		case DecisionEditPart.VISUAL_ID:
			return Decision_2005;
		case IngredientEditPart.VISUAL_ID:
			return Ingredient_3001;
		case DeviceEditPart.VISUAL_ID:
			return Device_3002;
		case TasteEditPart.VISUAL_ID:
			return Taste_3003;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return recipe.diagram.providers.RecipeElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return recipe.diagram.providers.RecipeElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return recipe.diagram.providers.RecipeElementTypes.getElement(elementTypeAdapter);
		}
	};

}
