package symo4pd.toolchain.docgen;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

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
}
