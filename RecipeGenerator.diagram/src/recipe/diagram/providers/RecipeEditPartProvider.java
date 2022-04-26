/*
 * 
 */
package recipe.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import recipe.diagram.edit.parts.ModelEditPart;
import recipe.diagram.edit.parts.RecipeEditPartFactory;
import recipe.diagram.part.RecipeVisualIDRegistry;

/**
 * @generated
 */
public class RecipeEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public RecipeEditPartProvider() {
		super(new RecipeEditPartFactory(), RecipeVisualIDRegistry.TYPED_INSTANCE, ModelEditPart.MODEL_ID);
	}

}
