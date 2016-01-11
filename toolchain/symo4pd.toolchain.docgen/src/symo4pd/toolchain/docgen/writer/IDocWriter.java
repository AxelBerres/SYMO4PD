package symo4pd.toolchain.docgen.writer;

import symo4pd.toolchain.docgen.exception.DocGeneratorException;
import symo4pd.toolchain.docgen.model.DocModelElement;

/**
 * Interface for documentation writer classes.
 * @author Michael.Shamiyeh
 *
 */
public interface IDocWriter {
	/**
	 * Method for initialization tasks, which is called before the {@link writeDocumentation} method.
	 * @param path Directory, where the documentation files are stored.
	 */
	void initialize(final String path) throws DocGeneratorException ;
	
	/**
	 * Generates the documentation of a documentation model element AND ALL its subelements.
	 * @param docElement The model element.
	 * @throws DocGeneratorException
	 */
	void writeDocModelElementDocumentation(final DocModelElement docElement) throws DocGeneratorException;
	
	/**
	 * Is called at the end of the documentation process. All save and storage tasks as well as resource disposal is intended to be done here.
	 */
	void finishDocumentation() throws DocGeneratorException;
}
