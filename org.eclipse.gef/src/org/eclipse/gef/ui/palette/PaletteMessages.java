package org.eclipse.gef.ui.palette;

import java.util.ResourceBundle;

/**
 * @author Pratik Shah
 */
public class PaletteMessages {

/**
 * The String "Customize Palette"
 */
public static final String CUSTOMIZE_DIALOG_TITLE;
/**
 * The String "Auto-collapse categories: "
 */
public static final String COLLAPSE_OPTIONS_TITLE;
/**
 * The String "Layout Options"
 */
public static final String SETTINGS_LAYOUT_OPTIONS_TITLE;
/**
 * The String "&Apply"
 */
public static final String APPLY_LABEL;
/**
 * The String "Move &Up"
 */
public static final String MOVE_UP_LABEL;
/**
 * The String "Move D&own"
 */
public static final String MOVE_DOWN_LABEL;
/**
 * The String "&Delete"
 */
public static final String DELETE_LABEL;
/**
 * The String "&New"
 */
public static final String NEW_LABEL;
/**
 * The String "&Folder"
 */
public static final String SETTINGS_FOLDER_VIEW_LABEL;
/**
 * The String "&List"
 */
public static final String SETTINGS_LIST_VIEW_LABEL;
/**
 * The String "&Use large icons"
 */
public static final String USE_LARGE_ICONS_LABEL;
/**
 * The String "&Icons only"
 */
public static final String SETTINGS_ICONS_VIEW_LABEL;
/**
 * The String "&Never"
 */
public static final String COLLAPSE_NEVER_LABEL;
/**
 * The String "&Always"
 */
public static final String COLLAPSE_ALWAYS_LABEL;
/**
 * The String "&When needed"
 */
public static final String COLLAPSE_AS_NEEDED_LABEL;
/**
 * The String "Nothing Selected"
 */
public static final String NO_SELECTION_TITLE;
/**
 * The String "Na&me: "
 */
public static final String NAME_LABEL ;
/**
 * The String "Des&cription: "
 */
public static final String DESCRIPTION_LABEL;
/**
 * The String "&Hide"
 */
public static final String HIDDEN_LABEL;
/**
 * The String "No description is available."
 */
public static final String NO_DESCRIPTION_AVAILABLE;
/**
 * The String "Select a node from the tree on the left."
 */
public static final String NO_SELECTION_MADE;
/**
 * The String "Cus&tomize..."
 */
public static final String MENU_OPEN_CUSTOMIZE_DIALOG;
/**
 * The String "Category"
 */
public static final String MODEL_TYPE_CATEGORY;
/**
 * The String "Separator"
 */
public static final String MODEL_TYPE_SEPARATOR;
/**
 * The String "Separates entries in a palette container"
 */
public static final String NEW_SEPARATOR_DESC;
/**
 * The String "New Category"
 */
public static final String NEW_CATEGORY_LABEL;
/**
 * The String "[Separator]"
 */
public static final String NEW_SEPARATOR_LABEL;
/**
 * The String "Group"
 */
public static final String MODEL_TYPE_GROUP;
/**
 * The String "New Group"
 */
public static final String NEW_GROUP_LABEL;
/**
 * The String "&Layout"
 */
public static final String LAYOUT_MENU_LABEL;
/**
 * The String "Error"
 */
public static final String ERROR;
/**
 * The String "The currently displayed page contains invalid values."
 */
public static final String ABORT_PAGE_FLIPPING_MESSAGE;
/**
 * The String "&Settings..."
 */
public static final String MENU_OPEN_SETTINGS_DIALOG;
/**
 * The String "Palette Settings"
 */
public static final String SETTINGS_DIALOG_TITLE;
/**
 * The String "&Details"
 */
public static final String SETTINGS_DETAILS_VIEW_LABEL;
/**
 * The String "Font"
 */
public static final String SETTINGS_FONT_TITLE;
/**
 * The String "&Change..."
 */
public static final String SETTINGS_FONT_CHANGE;
/**
 * The String "Current font: "
 */
public static final String SETTINGS_FONT_CURRENT;
/**
 * The String "Layout: "
 */
public static final String SETTINGS_LAYOUT_TITLE;
/**
 * The String "Category Options"
 */
public static final String SETTINGS_CATEGORY_OPTIONS_TITLE;
/**
 * The String "&Set expanded when editor opens"
 */
public static final String EXPAND_LABEL;
/**
 * The String "Folder Layout Options"
 */
public static final String SETTINGS_OPTIONS_FOLDER;
/**
 * The String "List Layout Options"
 */
public static final String SETTINGS_OPTIONS_LIST;
/**
 * The String "Icons Only Layout Options"
 */
public static final String SETTINGS_OPTIONS_ICONS_ONLY;
/**
 * The String "Details Layout Options"
 */
public static final String SETTINGS_OPTIONS_DETAILS;
/**
 * The String "&Override default column width settings"
 */
public static final String SETTINGS_LAYOUT_FOLDER_OVERRIDE_WIDTH;
/**
 * The String "Colu&mn width (in pixels): "
 */
public static final String SETTINGS_LAYOUT_FOLDER_WIDTH;
/**
 * The String "&Pin open"
 */
public static final String CATEGORY_PIN;
/**
 * The String "&Restore Default"
 */
public static final String SETTINGS_DEFAULT_FONT;
/**
 * The String "<Using Workbench Text Font>"
 */
public static final String SETTINGS_WORKBENCH_FONT_LABEL;

static {
	ResourceBundle bundle =
		ResourceBundle.getBundle("org.eclipse.gef.ui.palette.messages"); //$NON-NLS-1$

	CUSTOMIZE_DIALOG_TITLE = bundle.getString("CUSTOMIZE_DIALOG_TITLE"); //$NON-NLS-1$
	COLLAPSE_OPTIONS_TITLE = bundle.getString("COLLAPSE_OPTIONS_TITLE"); //$NON-NLS-1$
	SETTINGS_LAYOUT_OPTIONS_TITLE = bundle.getString("SETTINGS_LAYOUT_OPTIONS_TITLE"); //$NON-NLS-1$
	MOVE_UP_LABEL = bundle.getString("MOVE_UP_LABEL"); //$NON-NLS-1$
	MOVE_DOWN_LABEL = bundle.getString("MOVE_DOWN_LABEL"); //$NON-NLS-1$
	DELETE_LABEL = bundle.getString("DELETE_LABEL"); //$NON-NLS-1$
	NEW_LABEL = bundle.getString("NEW_LABEL"); //$NON-NLS-1$
	SETTINGS_FOLDER_VIEW_LABEL = bundle.getString("SETTINGS_FOLDER_VIEW_LABEL"); //$NON-NLS-1$
	SETTINGS_LIST_VIEW_LABEL = bundle.getString("SETTINGS_LIST_VIEW_LABEL"); //$NON-NLS-1$
	USE_LARGE_ICONS_LABEL = bundle.getString("USE_LARGE_ICONS_LABEL"); //$NON-NLS-1$
	SETTINGS_ICONS_VIEW_LABEL = bundle.getString("SETTINGS_ICONS_VIEW_LABEL"); //$NON-NLS-1$
	COLLAPSE_NEVER_LABEL = bundle.getString("COLLAPSE_NEVER_LABEL"); //$NON-NLS-1$
	COLLAPSE_ALWAYS_LABEL = bundle.getString("COLLAPSE_ALWAYS_LABEL"); //$NON-NLS-1$
	COLLAPSE_AS_NEEDED_LABEL = bundle.getString("COLLAPSE_AS_NEEDED_LABEL"); //$NON-NLS-1$
	NO_SELECTION_TITLE = bundle.getString("NO_SELECTION_TITLE"); //$NON-NLS-1$
	NAME_LABEL = bundle.getString("NAME_LABEL"); //$NON-NLS-1$
	DESCRIPTION_LABEL = bundle.getString("DESCRIPTION_LABEL"); //$NON-NLS-1$
	HIDDEN_LABEL = bundle.getString("HIDDEN_LABEL"); //$NON-NLS-1$
	NO_DESCRIPTION_AVAILABLE = bundle.getString("NO_DESCRIPTION_AVAILABLE"); //$NON-NLS-1$
	NO_SELECTION_MADE = bundle.getString("NO_SELECTION_MADE"); //$NON-NLS-1$
	MENU_OPEN_CUSTOMIZE_DIALOG = bundle.getString("MENU_OPEN_CUSTOMIZE_DIALOG"); //$NON-NLS-1$
	MODEL_TYPE_CATEGORY = bundle.getString("MODEL_TYPE_CATEGORY"); //$NON-NLS-1$
	MODEL_TYPE_SEPARATOR = bundle.getString("MODEL_TYPE_SEPARATOR"); //$NON-NLS-1$
	NEW_SEPARATOR_DESC = bundle.getString("NEW_SEPARATOR_DESC"); //$NON-NLS-1$
	NEW_CATEGORY_LABEL = bundle.getString("NEW_CATEGORY_LABEL"); //$NON-NLS-1$
	NEW_SEPARATOR_LABEL = bundle.getString("NEW_SEPARATOR_LABEL"); //$NON-NLS-1$
	APPLY_LABEL = bundle.getString("APPLY_LABEL"); //$NON-NLS-1$
	MODEL_TYPE_GROUP = bundle.getString("MODEL_TYPE_GROUP"); //$NON-NLS-1$
	NEW_GROUP_LABEL = bundle.getString("NEW_GROUP_LABEL"); //$NON-NLS-1$
	LAYOUT_MENU_LABEL = bundle.getString("LAYOUT_MENU_LABEL"); //$NON-NLS-1$
	ERROR = bundle.getString("ERROR"); //$NON-NLS-1$
	ABORT_PAGE_FLIPPING_MESSAGE = bundle.getString("ABORT_PAGE_FLIPPING_MESSAGE"); //$NON-NLS-1$
	MENU_OPEN_SETTINGS_DIALOG = bundle.getString("MENU_OPEN_SETTINGS_DIALOG"); //$NON-NLS-1$
	SETTINGS_DIALOG_TITLE = bundle.getString("SETTINGS_DIALOG_TITLE"); //$NON-NLS-1$
	SETTINGS_DETAILS_VIEW_LABEL = bundle.getString("SETTINGS_DETAILS_VIEW_LABEL"); //$NON-NLS-1$
	SETTINGS_FONT_TITLE = bundle.getString("SETTINGS_FONT_TITLE"); //$NON-NLS-1$	
	SETTINGS_FONT_CHANGE = bundle.getString("SETTINGS_FONT_CHANGE"); //$NON-NLS-1$	
	SETTINGS_FONT_CURRENT = bundle.getString("SETTINGS_FONT_CURRENT"); //$NON-NLS-1$	
	SETTINGS_LAYOUT_TITLE = bundle.getString("SETTINGS_LAYOUT_TITLE"); //$NON-NLS-1$	
	SETTINGS_CATEGORY_OPTIONS_TITLE = bundle.getString("SETTINGS_CATEGORY_OPTIONS_TITLE"); //$NON-NLS-1$	
	EXPAND_LABEL = bundle.getString("EXPAND_LABEL"); //$NON-NLS-1$	
	SETTINGS_OPTIONS_FOLDER = bundle.getString("SETTINGS_OPTIONS_FOLDER"); //$NON-NLS-1$	
	SETTINGS_OPTIONS_LIST = bundle.getString("SETTINGS_OPTIONS_LIST"); //$NON-NLS-1$	
	SETTINGS_OPTIONS_ICONS_ONLY = bundle.getString("SETTINGS_OPTIONS_ICONS_ONLY"); //$NON-NLS-1$	
	SETTINGS_OPTIONS_DETAILS = bundle.getString("SETTINGS_OPTIONS_DETAILS"); //$NON-NLS-1$	
	SETTINGS_LAYOUT_FOLDER_OVERRIDE_WIDTH = bundle.getString("SETTINGS_LAYOUT_FOLDER_OVERRIDE_WIDTH"); //$NON-NLS-1$	
	SETTINGS_LAYOUT_FOLDER_WIDTH = bundle.getString("SETTINGS_LAYOUT_FOLDER_WIDTH"); //$NON-NLS-1$	
	CATEGORY_PIN = bundle.getString("CATEGORY_PIN"); //$NON-NLS-1$	
	SETTINGS_DEFAULT_FONT = bundle.getString("SETTINGS_DEFAULT_FONT"); //$NON-NLS-1$	
	SETTINGS_WORKBENCH_FONT_LABEL = bundle.getString("SETTINGS_WORKBENCH_FONT_LABEL"); //$NON-NLS-1$	
}

}
