package symo4pd.toolchain.docgen;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import symo4pd.toolchain.docgen.exception.DocGeneratorException;
import symo4pd.toolchain.docgen.preferences.PreferencesConstants;
import symo4pd.toolchain.docgen.writer.IDocWriter;

/**
 * The {@link EcoreDocGenerator} is the core class of this plug-in. It is realized as singleton and provides methods for documentation generation and preference management.
 * @author Michael.Shamiyeh
 *
 */
public class EcoreDocGenerator {
	/**
	 * ID of the documentation writer extension point.
	 */
	public final static String EXTENSIONPOINT_ID = "symo4pd.toolchain.docgen.writers";
	
	/**
	 * Singleton instance.
	 */
	private static EcoreDocGenerator instance;
	
	/**
	 * Getter method for the singleton instance of the {@link EcoreDocGenerator}.
	 * @return Instance of the EcoreDocGenerator.
	 */
	public static EcoreDocGenerator getInstance() {
		if (instance == null)
			instance = new EcoreDocGenerator();
		
		return instance;
	}
	
	private EcoreDocGenerator() {
	}

	/**
	 * Generates a documentation of a passed {@link GenModel} with consideration of the deposited preferences.
	 * @param path Directory, where the documentation files are stored.
	 * @param model Instance of the {@link GenModel}.
	 * @throws DocGeneratorException 
	 */
	public void generate(String path, GenModel model) throws DocGeneratorException {
		DocModelGenerator generator = new DocModelGenerator(model);
		generator.generate();

		String writerClassName = Activator.preferences.getString(PreferencesConstants.WRITER);
		
		if (writerClassName.isEmpty()) {
			throw new DocGeneratorException("No Documentation Writer found or selected!");
		}
		else {			
			IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSIONPOINT_ID);

			for (IConfigurationElement elem : configElements) {
				if (elem.getAttribute("class").equals(writerClassName)) {
					IDocWriter writer;
					try {
						writer = (IDocWriter)elem.createExecutableExtension("class");
						
						writer.initialize(path);
						writer.writeDocModelElementDocumentation(generator.getDocumentationElement());
						writer.finishDocumentation();
					} catch (CoreException e) {
						throw new DocGeneratorException("Documentation Writer '" + elem.getName() + "' could not be created.", e);
					}
				}
			}
		}
	}
}
