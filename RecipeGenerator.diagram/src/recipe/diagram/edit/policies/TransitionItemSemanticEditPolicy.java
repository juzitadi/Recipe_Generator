/*
* 
*/
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class TransitionItemSemanticEditPolicy extends RecipeBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransitionItemSemanticEditPolicy() {
		super(RecipeElementTypes.Transition_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
