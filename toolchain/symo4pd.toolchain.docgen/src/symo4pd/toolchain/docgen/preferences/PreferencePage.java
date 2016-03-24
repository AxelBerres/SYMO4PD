package symo4pd.toolchain.docgen.preferences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import symo4pd.toolchain.docgen.Activator;
import symo4pd.toolchain.docgen.EcoreDocGenerator;

/**
 * Preferences page of the plug-in.
 * @author Michael.Shamiyeh
 *
 */
public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    setTitle("Ecore Doc-Generator");
	}

	@Override
	protected void createFieldEditors() {
		getRegisteredWriterExtensions();
		addField(new ComboFieldEditor(PreferencesConstants.WRITER, "Documentation Writer:", getRegisteredWriterExtensions(), getFieldEditorParent()));

		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_MODELENTRY, "Generate Model Entries", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_PACKAGEENTRY, "Generate Package Entries", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_CLASSENTRY, "Generate Class Entries", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_DATATYPEENTRY, "Generate Data-Type Entries", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_ENUMENTRY, "Generate Enumeration Entries", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_IMPLEMENTSLINE, "Write known base classes", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_SUBCLASSESLINE, "Write known subclasses", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferencesConstants.GENERATE_INTERFACEABSTRACTLINE, "Append Interface and/or Abstract keywords", getFieldEditorParent()));
	}
	
	/**
	 * Evaluates all registered documentation writer extensions.
	 * @return two dimensional string array with the writer names and the writer class names for the ComboBox field. 
	 */
	private String[][] getRegisteredWriterExtensions() {
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EcoreDocGenerator.EXTENSIONPOINT_ID);

		Map<String, String> writerExtensions = new HashMap<String, String>();
		for (IConfigurationElement extension : configElements) {
			writerExtensions.put(extension.getAttribute("class"), extension.getAttribute("name"));
		}
		
		String[][] returnArray = new String[writerExtensions.size()][2];
		int count = 0;
		for(Map.Entry<String,String> entry : writerExtensions.entrySet()){
			returnArray[count][0] = entry.getValue();
			returnArray[count][1] = entry.getKey();
		    count++;
		}
		
		return returnArray;
	}
}
