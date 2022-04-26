/*
 * 
 */
package recipe.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import recipe.RecipePackage;
import recipe.diagram.edit.parts.DecisionTextEditPart;
import recipe.diagram.edit.parts.DeviceNameTypeEditPart;
import recipe.diagram.edit.parts.IngredientNameTypeEditPart;
import recipe.diagram.edit.parts.InputActionTextEditPart;
import recipe.diagram.edit.parts.InstructionActionTextEditPart;
import recipe.diagram.edit.parts.ModelNameEditPart;
import recipe.diagram.edit.parts.RecipeActionTextEditPart;
import recipe.diagram.edit.parts.SpeakActionTextEditPart;
import recipe.diagram.edit.parts.TasteNameTypeEditPart;
import recipe.diagram.edit.parts.TransitionTextEditPart;
import recipe.diagram.parsers.MessageFormatParser;
import recipe.diagram.part.RecipeVisualIDRegistry;

/**
 * @generated
 */
public class RecipeParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser speakActionText_5001Parser;

	/**
	* @generated
	*/
	private IParser getSpeakActionText_5001Parser() {
		if (speakActionText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getStep_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			speakActionText_5001Parser = parser;
		}
		return speakActionText_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser instructionActionText_5002Parser;

	/**
	* @generated
	*/
	private IParser getInstructionActionText_5002Parser() {
		if (instructionActionText_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getStep_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			instructionActionText_5002Parser = parser;
		}
		return instructionActionText_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser inputActionText_5003Parser;

	/**
	* @generated
	*/
	private IParser getInputActionText_5003Parser() {
		if (inputActionText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getStep_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputActionText_5003Parser = parser;
		}
		return inputActionText_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser recipeActionText_5008Parser;

	/**
	* @generated
	*/
	private IParser getRecipeActionText_5008Parser() {
		if (recipeActionText_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getStep_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recipeActionText_5008Parser = parser;
		}
		return recipeActionText_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser modelName_5004Parser;

	/**
	* @generated
	*/
	private IParser getModelName_5004Parser() {
		if (modelName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getModel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelName_5004Parser = parser;
		}
		return modelName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser decisionText_5005Parser;

	/**
	* @generated
	*/
	private IParser getDecisionText_5005Parser() {
		if (decisionText_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getStep_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			decisionText_5005Parser = parser;
		}
		return decisionText_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser ingredientNameType_5006Parser;

	/**
	* @generated
	*/
	private IParser getIngredientNameType_5006Parser() {
		if (ingredientNameType_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getVariable_Name(),
					RecipePackage.eINSTANCE.getVariable_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			ingredientNameType_5006Parser = parser;
		}
		return ingredientNameType_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser deviceNameType_5007Parser;

	/**
	* @generated
	*/
	private IParser getDeviceNameType_5007Parser() {
		if (deviceNameType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getVariable_Name(),
					RecipePackage.eINSTANCE.getVariable_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			deviceNameType_5007Parser = parser;
		}
		return deviceNameType_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser tasteNameType_5009Parser;

	/**
	* @generated
	*/
	private IParser getTasteNameType_5009Parser() {
		if (tasteNameType_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getVariable_Name(),
					RecipePackage.eINSTANCE.getVariable_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			tasteNameType_5009Parser = parser;
		}
		return tasteNameType_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser transitionText_6001Parser;

	/**
	* @generated
	*/
	private IParser getTransitionText_6001Parser() {
		if (transitionText_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE.getTransition_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionText_6001Parser = parser;
		}
		return transitionText_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SpeakActionTextEditPart.VISUAL_ID:
			return getSpeakActionText_5001Parser();
		case InstructionActionTextEditPart.VISUAL_ID:
			return getInstructionActionText_5002Parser();
		case InputActionTextEditPart.VISUAL_ID:
			return getInputActionText_5003Parser();
		case RecipeActionTextEditPart.VISUAL_ID:
			return getRecipeActionText_5008Parser();
		case ModelNameEditPart.VISUAL_ID:
			return getModelName_5004Parser();
		case DecisionTextEditPart.VISUAL_ID:
			return getDecisionText_5005Parser();
		case IngredientNameTypeEditPart.VISUAL_ID:
			return getIngredientNameType_5006Parser();
		case DeviceNameTypeEditPart.VISUAL_ID:
			return getDeviceNameType_5007Parser();
		case TasteNameTypeEditPart.VISUAL_ID:
			return getTasteNameType_5009Parser();
		case TransitionTextEditPart.VISUAL_ID:
			return getTransitionText_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RecipeVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RecipeVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RecipeElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
