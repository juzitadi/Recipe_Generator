/*
* 
*/
package recipe.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import recipe.Decision;
import recipe.InputAction;
import recipe.InstructionAction;
import recipe.Model;
import recipe.RecipeAction;
import recipe.RecipePackage;
import recipe.SpeakAction;
import recipe.Step;
import recipe.Transition;
import recipe.Variable;
import recipe.diagram.edit.parts.DecisionEditPart;
import recipe.diagram.edit.parts.DeviceEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.InputActionEditPart;
import recipe.diagram.edit.parts.InputActionInputActionVariablesCompartmentEditPart;
import recipe.diagram.edit.parts.InstructionActionEditPart;
import recipe.diagram.edit.parts.Model2EditPart;
import recipe.diagram.edit.parts.ModelEditPart;
import recipe.diagram.edit.parts.RecipeActionEditPart;
import recipe.diagram.edit.parts.SpeakActionEditPart;
import recipe.diagram.edit.parts.TasteEditPart;
import recipe.diagram.edit.parts.TransitionEditPart;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipeDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<RecipeNodeDescriptor> getSemanticChildren(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		case InputActionInputActionVariablesCompartmentEditPart.VISUAL_ID:
			return getInputActionInputActionVariablesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<RecipeNodeDescriptor> getModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) view.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSteps().iterator(); it.hasNext();) {
			Step childElement = (Step) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SpeakActionEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InstructionActionEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputActionEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RecipeActionEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Model2EditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeNodeDescriptor> getInputActionInputActionVariablesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputAction modelElement = (InputAction) containerView.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IngredientEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TasteEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeLinkDescriptor> getContainedLinks(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case SpeakActionEditPart.VISUAL_ID:
			return getSpeakAction_2001ContainedLinks(view);
		case InstructionActionEditPart.VISUAL_ID:
			return getInstructionAction_2002ContainedLinks(view);
		case InputActionEditPart.VISUAL_ID:
			return getInputAction_2003ContainedLinks(view);
		case RecipeActionEditPart.VISUAL_ID:
			return getRecipeAction_2006ContainedLinks(view);
		case Model2EditPart.VISUAL_ID:
			return getModel_2004ContainedLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2005ContainedLinks(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_3001ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_3002ContainedLinks(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_3003ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<RecipeLinkDescriptor> getIncomingLinks(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case SpeakActionEditPart.VISUAL_ID:
			return getSpeakAction_2001IncomingLinks(view);
		case InstructionActionEditPart.VISUAL_ID:
			return getInstructionAction_2002IncomingLinks(view);
		case InputActionEditPart.VISUAL_ID:
			return getInputAction_2003IncomingLinks(view);
		case RecipeActionEditPart.VISUAL_ID:
			return getRecipeAction_2006IncomingLinks(view);
		case Model2EditPart.VISUAL_ID:
			return getModel_2004IncomingLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2005IncomingLinks(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_3001IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_3002IncomingLinks(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_3003IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<RecipeLinkDescriptor> getOutgoingLinks(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case SpeakActionEditPart.VISUAL_ID:
			return getSpeakAction_2001OutgoingLinks(view);
		case InstructionActionEditPart.VISUAL_ID:
			return getInstructionAction_2002OutgoingLinks(view);
		case InputActionEditPart.VISUAL_ID:
			return getInputAction_2003OutgoingLinks(view);
		case RecipeActionEditPart.VISUAL_ID:
			return getRecipeAction_2006OutgoingLinks(view);
		case Model2EditPart.VISUAL_ID:
			return getModel_2004OutgoingLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2005OutgoingLinks(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_3001OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_3002OutgoingLinks(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_3003OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModel_1000ContainedLinks(View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getSpeakAction_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getInstructionAction_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getInputAction_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipeAction_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModel_2004ContainedLinks(View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getDecision_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getIngredient_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getDevice_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getTaste_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getTransition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getSpeakAction_2001IncomingLinks(View view) {
		SpeakAction modelElement = (SpeakAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getInstructionAction_2002IncomingLinks(View view) {
		InstructionAction modelElement = (InstructionAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getInputAction_2003IncomingLinks(View view) {
		InputAction modelElement = (InputAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipeAction_2006IncomingLinks(View view) {
		RecipeAction modelElement = (RecipeAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModel_2004IncomingLinks(View view) {
		Model modelElement = (Model) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getDecision_2005IncomingLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getIngredient_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getDevice_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getTaste_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getTransition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getSpeakAction_2001OutgoingLinks(View view) {
		SpeakAction modelElement = (SpeakAction) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getInstructionAction_2002OutgoingLinks(View view) {
		InstructionAction modelElement = (InstructionAction) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getInputAction_2003OutgoingLinks(View view) {
		InputAction modelElement = (InputAction) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipeAction_2006OutgoingLinks(View view) {
		RecipeAction modelElement = (RecipeAction) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModel_2004OutgoingLinks(View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getDecision_2005OutgoingLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getIngredient_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getDevice_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getTaste_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getTransition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<RecipeLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(Model container) {
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != RecipeVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Step dst = link.getTo();
			Step src = link.getFrom();
			result.add(new RecipeLinkDescriptor(src, dst, link, RecipeElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RecipeLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(Step target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RecipePackage.eINSTANCE.getTransition_To()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != RecipeVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Step src = link.getFrom();
			result.add(new RecipeLinkDescriptor(src, target, link, RecipeElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<RecipeLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(Step source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != RecipeVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Step dst = link.getTo();
			Step src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new RecipeLinkDescriptor(src, dst, link, RecipeElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<RecipeNodeDescriptor> getSemanticChildren(View view) {
			return RecipeDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<RecipeLinkDescriptor> getContainedLinks(View view) {
			return RecipeDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<RecipeLinkDescriptor> getIncomingLinks(View view) {
			return RecipeDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<RecipeLinkDescriptor> getOutgoingLinks(View view) {
			return RecipeDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
