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
public class RecipeModelingAssistantProviderOfSpeakActionEditPart extends RecipeModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SpeakActionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SpeakActionEditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((SpeakActionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SpeakActionEditPart source,
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
		return doGetTypesForTarget((SpeakActionEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SpeakActionEditPart source, IElementType relationshipType) {
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
		return doGetRelTypesOnTarget((SpeakActionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(SpeakActionEditPart target) {
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
		return doGetTypesForSource((SpeakActionEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(SpeakActionEditPart target, IElementType relationshipType) {
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
