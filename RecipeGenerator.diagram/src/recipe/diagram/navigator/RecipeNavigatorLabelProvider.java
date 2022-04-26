/*
* 
*/
package recipe.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import recipe.Model;
import recipe.diagram.edit.parts.DecisionEditPart;
import recipe.diagram.edit.parts.DecisionTextEditPart;
import recipe.diagram.edit.parts.DeviceEditPart;
import recipe.diagram.edit.parts.DeviceNameTypeEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.IngredientNameTypeEditPart;
import recipe.diagram.edit.parts.InputActionEditPart;
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
import recipe.diagram.part.RecipeDiagramEditorPlugin;
import recipe.diagram.part.RecipeVisualIDRegistry;
import recipe.diagram.providers.RecipeElementTypes;
import recipe.diagram.providers.RecipeParserProvider;

/**
 * @generated
 */
public class RecipeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		RecipeDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		RecipeDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RecipeNavigatorItem && !isOwnView(((RecipeNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof RecipeNavigatorGroup) {
			RecipeNavigatorGroup group = (RecipeNavigatorGroup) element;
			return RecipeDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof RecipeNavigatorItem) {
			RecipeNavigatorItem navigatorItem = (RecipeNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?flowchart?Model", RecipeElementTypes.Model_1000); //$NON-NLS-1$
		case SpeakActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?flowchart?SpeakAction", RecipeElementTypes.SpeakAction_2001); //$NON-NLS-1$
		case InstructionActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?flowchart?InstructionAction", //$NON-NLS-1$
					RecipeElementTypes.InstructionAction_2002);
		case InputActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?flowchart?InputAction", RecipeElementTypes.InputAction_2003); //$NON-NLS-1$
		case Model2EditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?flowchart?Model", RecipeElementTypes.Model_2004); //$NON-NLS-1$
		case DecisionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?flowchart?Decision", RecipeElementTypes.Decision_2005); //$NON-NLS-1$
		case RecipeActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?flowchart?RecipeAction", RecipeElementTypes.RecipeAction_2006); //$NON-NLS-1$
		case IngredientEditPart.VISUAL_ID:
			return getImage("Navigator?Node?flowchart?Ingredient", RecipeElementTypes.Ingredient_3001); //$NON-NLS-1$
		case DeviceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?flowchart?Device", RecipeElementTypes.Device_3002); //$NON-NLS-1$
		case TasteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?flowchart?Taste", RecipeElementTypes.Taste_3003); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?flowchart?Transition", RecipeElementTypes.Transition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RecipeDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && RecipeElementTypes.isKnownElementType(elementType)) {
			image = RecipeElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof RecipeNavigatorGroup) {
			RecipeNavigatorGroup group = (RecipeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RecipeNavigatorItem) {
			RecipeNavigatorItem navigatorItem = (RecipeNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case SpeakActionEditPart.VISUAL_ID:
			return getSpeakAction_2001Text(view);
		case InstructionActionEditPart.VISUAL_ID:
			return getInstructionAction_2002Text(view);
		case InputActionEditPart.VISUAL_ID:
			return getInputAction_2003Text(view);
		case Model2EditPart.VISUAL_ID:
			return getModel_2004Text(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2005Text(view);
		case RecipeActionEditPart.VISUAL_ID:
			return getRecipeAction_2006Text(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_3001Text(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_3002Text(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_3003Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getModel_1000Text(View view) {
		Model domainModelElement = (Model) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSpeakAction_2001Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.SpeakAction_2001,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(SpeakActionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInstructionAction_2002Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.InstructionAction_2002,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(InstructionActionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputAction_2003Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.InputAction_2003,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(InputActionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModel_2004Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.Model_2004,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(ModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDecision_2005Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.Decision_2005,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(DecisionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecipeAction_2006Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.RecipeAction_2006,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(RecipeActionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIngredient_3001Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.Ingredient_3001,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(IngredientNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDevice_3002Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.Device_3002,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(DeviceNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaste_3003Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.Taste_3003,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(TasteNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransition_4001Text(View view) {
		IParser parser = RecipeParserProvider.getParser(RecipeElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(TransitionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ModelEditPart.MODEL_ID.equals(RecipeVisualIDRegistry.getModelID(view));
	}

}
