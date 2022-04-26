/*
* 
*/
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.DeviceCreateCommand;
import recipe.diagram.edit.commands.IngredientCreateCommand;
import recipe.diagram.edit.commands.TasteCreateCommand;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class InputActionInputActionVariablesCompartmentItemSemanticEditPolicy extends RecipeBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputActionInputActionVariablesCompartmentItemSemanticEditPolicy() {
		super(RecipeElementTypes.InputAction_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeElementTypes.Ingredient_3001 == req.getElementType()) {
			return getGEFWrapper(new IngredientCreateCommand(req));
		}
		if (RecipeElementTypes.Device_3002 == req.getElementType()) {
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (RecipeElementTypes.Taste_3003 == req.getElementType()) {
			return getGEFWrapper(new TasteCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
