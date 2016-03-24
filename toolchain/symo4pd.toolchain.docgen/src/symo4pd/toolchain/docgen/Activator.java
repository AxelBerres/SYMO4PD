package symo4pd.toolchain.docgen;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import symo4pd.toolchain.docgen.preferences.PreferencesConstants;

/**
 * Bundle activator class.
 * 
 * @author Michael.Shamiyeh
 *
 */
public class Activator extends AbstractUIPlugin {
	/**
	 * The ID of the plug-in.
	 */
	public static final String PLUGIN_ID = "symo4pd.toolchain.docgen";

	/**
	 * Singleton instance.
	 */
	private static Activator plugin;

	/**
	 * Preferences store of the plug-in.
	 */
	public static IPreferenceStore preferences;

	/**
	 * The bundle context.
	 */
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		plugin = this;
		Activator.preferences = Activator.getDefault().getPreferenceStore();
		setDefaultSettings();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		Activator.context = null;
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public void setDefaultSettings() {
		preferences.setDefault(PreferencesConstants.GENERATE_CLASSENTRY, true);
		preferences.setDefault(PreferencesConstants.GENERATE_DATATYPEENTRY, false);
		preferences.setDefault(PreferencesConstants.GENERATE_ENUMENTRY, false);
		preferences.setDefault(PreferencesConstants.GENERATE_IMPLEMENTSLINE, true);
		preferences.setDefault(PreferencesConstants.GENERATE_INTERFACEABSTRACTLINE, true);
		preferences.setDefault(PreferencesConstants.GENERATE_MODELENTRY, false);
		preferences.setDefault(PreferencesConstants.GENERATE_PACKAGEENTRY, true);
		preferences.setDefault(PreferencesConstants.GENERATE_SUBCLASSESLINE, true);
	}
}
