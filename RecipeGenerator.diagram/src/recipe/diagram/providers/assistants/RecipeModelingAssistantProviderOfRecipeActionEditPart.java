/*
 * 
 */
package recipe.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import recipe.diagram.edit.parts.DecisionEditPart;
import recipe.diagram.edit.parts.InputActionEditPart;
import recipe.diagram.edit.parts.InstructionActionEditPart;
import recipe.diagram.edit.parts.Model2EditPart;
import recipe.diagram.edit.parts.RecipeActionEditPart;
import recipe.diagram.edit.parts.SpeakActionEditPart;
import recipe.diagram.providers.RecipeElementTypes;
import recipe.diagram.providers.RecipeModelingAssistantProvider;

/**
 * @generated
 */
public class RecipeModelingAssistantProviderOfRecipeActionEditPart extends RecipeModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RecipeActionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RecipeActionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RecipeElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RecipeActionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RecipeActionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SpeakActionEditPart) {
			types.add(RecipeElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InstructionActionEditPart) {
			types.add(RecipeElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InputActionEditPart) {
			types.add(RecipeElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof RecipeActionEditPart) {
			types.add(RecipeElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Model2EditPart) {
			types.add(RecipeElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof DecisionEditPart) {
			types.add(RecipeElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RecipeActionEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RecipeActionEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RecipeElementTypes.Transition_4001) {
			types.add(RecipeElementTypes.SpeakAction_2001);
			types.add(RecipeElementTypes.InstructionAction_2002);
			types.add(RecipeElementTypes.InputAction_2003);
			types.add(RecipeElementTypes.RecipeAction_2006);
			types.add(RecipeElementTypes.Model_2004);
			types.add(RecipeElementTypes.Decision_2005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RecipeActionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RecipeActionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RecipeElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RecipeActionEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RecipeActionEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RecipeElementTypes.Transition_4001) {
			types.add(RecipeElementTypes.SpeakAction_2001);
			types.add(RecipeElementTypes.InstructionAction_2002);
			types.add(RecipeElementTypes.InputAction_2003);
			types.add(RecipeElementTypes.RecipeAction_2006);
			types.add(RecipeElementTypes.Model_2004);
			types.add(RecipeElementTypes.Decision_2005);
		}
		return types;
	}

}
