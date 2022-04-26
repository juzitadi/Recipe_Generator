/*
 * 
 */
package recipe.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import recipe.diagram.part.RecipeVisualIDRegistry;

/**
 * @generated
 */
public class RecipeEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RecipeVisualIDRegistry.getVisualID(view)) {

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case SpeakActionEditPart.VISUAL_ID:
				return new SpeakActionEditPart(view);

			case SpeakActionTextEditPart.VISUAL_ID:
				return new SpeakActionTextEditPart(view);

			case InstructionActionEditPart.VISUAL_ID:
				return new InstructionActionEditPart(view);

			case InstructionActionTextEditPart.VISUAL_ID:
				return new InstructionActionTextEditPart(view);

			case InputActionEditPart.VISUAL_ID:
				return new InputActionEditPart(view);

			case InputActionTextEditPart.VISUAL_ID:
				return new InputActionTextEditPart(view);

			case RecipeActionEditPart.VISUAL_ID:
				return new RecipeActionEditPart(view);

			case RecipeActionTextEditPart.VISUAL_ID:
				return new RecipeActionTextEditPart(view);

			case Model2EditPart.VISUAL_ID:
				return new Model2EditPart(view);

			case ModelNameEditPart.VISUAL_ID:
				return new ModelNameEditPart(view);

			case DecisionEditPart.VISUAL_ID:
				return new DecisionEditPart(view);

			case DecisionTextEditPart.VISUAL_ID:
				return new DecisionTextEditPart(view);

			case IngredientEditPart.VISUAL_ID:
				return new IngredientEditPart(view);

			case IngredientNameTypeEditPart.VISUAL_ID:
				return new IngredientNameTypeEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case DeviceNameTypeEditPart.VISUAL_ID:
				return new DeviceNameTypeEditPart(view);

			case TasteEditPart.VISUAL_ID:
				return new TasteEditPart(view);

			case TasteNameTypeEditPart.VISUAL_ID:
				return new TasteNameTypeEditPart(view);

			case InputActionInputActionVariablesCompartmentEditPart.VISUAL_ID:
				return new InputActionInputActionVariablesCompartmentEditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionTextEditPart.VISUAL_ID:
				return new TransitionTextEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
