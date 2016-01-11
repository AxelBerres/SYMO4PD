package symo4pd.toolchain.docgen.model;

/**
 * Factory for creating DocModel elements for Ecore model elements.
 * 
 * @author Michael.Shamiyeh
 *
 */
public class DocElementFactory {
	/**
	 * Creates an root element for the model itself.
	 * 
	 * @param name
	 *            Name of the model.
	 * @return DocModel element with the passed name and the appropriate element
	 *         type.
	 */
	public static DocModelElement generateEcoreModelDocElement(String name) {
		return generateDocElement(name, DocModelElement.TYPE_ECOREMODEL);
	}

	/**
	 * Creates an element for a package.
	 * 
	 * @param name
	 *            Name of the package.
	 * @return DocModel element with the passed name and the appropriate element
	 *         type.
	 */
	public static DocModelElement generatePackageDocElement(String name) {
		return generateDocElement(name, DocModelElement.TYPE_EPACKAGE);
	}

	/**
	 * Creates an element for a class.
	 * 
	 * @param name
	 *            Name of the class.
	 * @return DocModel element with the passed name and the appropriate element
	 *         type.
	 */
	public static DocModelElement generateClassDocElement(String name) {
		return generateDocElement(name, DocModelElement.TYPE_ECLASS);
	}

	/**
	 * Creates an element for an enumeration.
	 * 
	 * @param name
	 *            Name of the enumeration.
	 * @return DocModel element with the passed name and the appropriate element
	 *         type.
	 */
	public static DocModelElement generateEnumDocElement(String name) {
		return generateDocElement(name, DocModelElement.TYPE_EENUM);
	}

	/**
	 * Creates an element for a data type.
	 * 
	 * @param name
	 *            Name of the data type.
	 * @return DocModel element with the passed name and the appropriate element
	 *         type.
	 */
	public static DocModelElement generateDataTypeDocElement(String name) {
		return generateDocElement(name, DocModelElement.TYPE_EDATATYPE);
	}

	/**
	 * Creates an element for a model element with an arbitrary type.
	 * 
	 * @param name
	 *            Name model element.
	 * @param type
	 *            Type of the model element as String.
	 * @return DocModel element with the passed name and the passed element
	 *         type.
	 */
	private static DocModelElement generateDocElement(String name, String type) {
		return new DocModelElement(name, type);
	}
}
