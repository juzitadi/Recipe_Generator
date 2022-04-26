/*
* 
*/
package recipe.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import recipe.diagram.edit.commands.DecisionCreateCommand;
import recipe.diagram.edit.commands.InputActionCreateCommand;
import recipe.diagram.edit.commands.InstructionActionCreateCommand;
import recipe.diagram.edit.commands.ModelCreateCommand;
import recipe.diagram.edit.commands.RecipeActionCreateCommand;
import recipe.diagram.edit.commands.SpeakActionCreateCommand;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends RecipeBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ModelItemSemanticEditPolicy() {
		super(RecipeElementTypes.Model_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeElementTypes.SpeakAction_2001 == req.getElementType()) {
			return getGEFWrapper(new SpeakActionCreateCommand(req));
		}
		if (RecipeElementTypes.InstructionAction_2002 == req.getElementType()) {
			return getGEFWrapper(new InstructionActionCreateCommand(req));
		}
		if (RecipeElementTypes.InputAction_2003 == req.getElementType()) {
			return getGEFWrapper(new InputActionCreateCommand(req));
		}
		if (RecipeElementTypes.RecipeAction_2006 == req.getElementType()) {
			return getGEFWrapper(new RecipeActionCreateCommand(req));
		}
		if (RecipeElementTypes.Model_2004 == req.getElementType()) {
			return getGEFWrapper(new ModelCreateCommand(req));
		}
		if (RecipeElementTypes.Decision_2005 == req.getElementType()) {
			return getGEFWrapper(new DecisionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
