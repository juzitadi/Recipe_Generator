/*
* 
*/
package recipe.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import recipe.Model;
import recipe.RecipePackage;
import recipe.diagram.edit.parts.DecisionEditPart;
import recipe.diagram.edit.parts.DecisionTextEditPart;
import recipe.diagram.edit.parts.DeviceEditPart;
import recipe.diagram.edit.parts.DeviceNameTypeEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.IngredientNameTypeEditPart;
import recipe.diagram.edit.parts.InputActionEditPart;
import recipe.diagram.edit.parts.InputActionInputActionVariablesCompartmentEditPart;
import recipe.diagram.edit.parts.InputActionTextEditPart;
import recipe.diagram.edit.parts.InstructionActionEditPart;
import recipe.diagram.edit.parts.InstructionActionTextEditPart;
import recipe.diagram.edit.parts.Model2EditPart;
import recipe.diagram.edit.parts.ModelEditPart;
import recipe.diagram.edit.parts.ModelNameEditPart;
import recipe.diagram.edit.parts.RecipeActionEditPart;
import recipe.diagram.edit.parts.RecipeActionTextEditPart;
import recipe.diagram.edit.parts.SpeakActionEditPart;
import recipe.diagram.edit.parts.SpeakActionTextEditPart;
import recipe.diagram.edit.parts.TasteEditPart;
import recipe.diagram.edit.parts.TasteNameTypeEditPart;
import recipe.diagram.edit.parts.TransitionEditPart;
import recipe.diagram.edit.parts.TransitionTextEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RecipeVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "RecipeGenerator.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelEditPart.MODEL_ID.equals(view.getType())) {
				return ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return recipe.diagram.part.RecipeVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				RecipeDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RecipePackage.eINSTANCE.getModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = recipe.diagram.part.RecipeVisualIDRegistry.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID) && !"recipe".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = recipe.diagram.part.RecipeVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelEditPart.VISUAL_ID:
			if (RecipePackage.eINSTANCE.getSpeakAction().isSuperTypeOf(domainElement.eClass())) {
				return SpeakActionEditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getInstructionAction().isSuperTypeOf(domainElement.eClass())) {
				return InstructionActionEditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getInputAction().isSuperTypeOf(domainElement.eClass())) {
				return InputActionEditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getRecipeAction().isSuperTypeOf(domainElement.eClass())) {
				return RecipeActionEditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getModel().isSuperTypeOf(domainElement.eClass())) {
				return Model2EditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getDecision().isSuperTypeOf(domainElement.eClass())) {
				return DecisionEditPart.VISUAL_ID;
			}
			break;
		case InputActionInputActionVariablesCompartmentEditPart.VISUAL_ID:
			if (RecipePackage.eINSTANCE.getIngredient().isSuperTypeOf(domainElement.eClass())) {
				return IngredientEditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (RecipePackage.eINSTANCE.getTaste().isSuperTypeOf(domainElement.eClass())) {
				return TasteEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = recipe.diagram.part.RecipeVisualIDRegistry.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID) && !"recipe".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = recipe.diagram.part.RecipeVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelEditPart.VISUAL_ID:
			if (SpeakActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstructionActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecipeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Model2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpeakActionEditPart.VISUAL_ID:
			if (SpeakActionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstructionActionEditPart.VISUAL_ID:
			if (InstructionActionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputActionEditPart.VISUAL_ID:
			if (InputActionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputActionInputActionVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeActionEditPart.VISUAL_ID:
			if (RecipeActionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Model2EditPart.VISUAL_ID:
			if (ModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DecisionEditPart.VISUAL_ID:
			if (DecisionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IngredientEditPart.VISUAL_ID:
			if (IngredientNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TasteEditPart.VISUAL_ID:
			if (TasteNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputActionInputActionVariablesCompartmentEditPart.VISUAL_ID:
			if (IngredientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TasteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RecipePackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Model element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case InputActionInputActionVariablesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ModelEditPart.VISUAL_ID:
			return false;
		case SpeakActionEditPart.VISUAL_ID:
		case InstructionActionEditPart.VISUAL_ID:
		case Model2EditPart.VISUAL_ID:
		case DecisionEditPart.VISUAL_ID:
		case RecipeActionEditPart.VISUAL_ID:
		case IngredientEditPart.VISUAL_ID:
		case DeviceEditPart.VISUAL_ID:
		case TasteEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return recipe.diagram.part.RecipeVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return recipe.diagram.part.RecipeVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return recipe.diagram.part.RecipeVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return recipe.diagram.part.RecipeVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return recipe.diagram.part.RecipeVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return recipe.diagram.part.RecipeVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
