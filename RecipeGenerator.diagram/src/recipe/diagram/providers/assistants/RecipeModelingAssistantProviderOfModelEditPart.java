/*
 * 
 */
package recipe.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import recipe.diagram.providers.RecipeElementTypes;
import recipe.diagram.providers.RecipeModelingAssistantProvider;

/**
 * @generated
 */
public class RecipeModelingAssistantProviderOfModelEditPart extends RecipeModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RecipeElementTypes.SpeakAction_2001);
		types.add(RecipeElementTypes.InstructionAction_2002);
		types.add(RecipeElementTypes.InputAction_2003);
		types.add(RecipeElementTypes.RecipeAction_2006);
		types.add(RecipeElementTypes.Model_2004);
		types.add(RecipeElementTypes.Decision_2005);
		return types;
	}

}
