
/*
 * 
 */
package recipe.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDecision1CreationTool());
		paletteContainer.add(createDevice2CreationTool());
		paletteContainer.add(createIngredient3CreationTool());
		paletteContainer.add(createInputAction4CreationTool());
		paletteContainer.add(createInstructionAction5CreationTool());
		paletteContainer.add(createModel6CreationTool());
		paletteContainer.add(createRecipeAction7CreationTool());
		paletteContainer.add(createSpeakAction8CreationTool());
		paletteContainer.add(createTaste9CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecision1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Decision1CreationTool_title,
				Messages.Decision1CreationTool_desc, Collections.singletonList(RecipeElementTypes.Decision_2005));
		entry.setId("createDecision1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.Decision_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDevice2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Device2CreationTool_title,
				Messages.Device2CreationTool_desc, Collections.singletonList(RecipeElementTypes.Device_3002));
		entry.setId("createDevice2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.Device_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIngredient3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ingredient3CreationTool_title,
				Messages.Ingredient3CreationTool_desc, Collections.singletonList(RecipeElementTypes.Ingredient_3001));
		entry.setId("createIngredient3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.Ingredient_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputAction4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputAction4CreationTool_title,
				Messages.InputAction4CreationTool_desc, Collections.singletonList(RecipeElementTypes.InputAction_2003));
		entry.setId("createInputAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.InputAction_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInstructionAction5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InstructionAction5CreationTool_title,
				Messages.InstructionAction5CreationTool_desc,
				Collections.singletonList(RecipeElementTypes.InstructionAction_2002));
		entry.setId("createInstructionAction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.InstructionAction_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModel6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Model6CreationTool_title,
				Messages.Model6CreationTool_desc, Collections.singletonList(RecipeElementTypes.Model_2004));
		entry.setId("createModel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.Model_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecipeAction7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RecipeAction7CreationTool_title,
				Messages.RecipeAction7CreationTool_desc,
				Collections.singletonList(RecipeElementTypes.RecipeAction_2006));
		entry.setId("createRecipeAction7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.RecipeAction_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSpeakAction8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SpeakAction8CreationTool_title,
				Messages.SpeakAction8CreationTool_desc, Collections.singletonList(RecipeElementTypes.SpeakAction_2001));
		entry.setId("createSpeakAction8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.SpeakAction_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaste9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Taste9CreationTool_title,
				Messages.Taste9CreationTool_desc, Collections.singletonList(RecipeElementTypes.Taste_3003));
		entry.setId("createTaste9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.Taste_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc, Collections.singletonList(RecipeElementTypes.Transition_4001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes.getImageDescriptor(RecipeElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
