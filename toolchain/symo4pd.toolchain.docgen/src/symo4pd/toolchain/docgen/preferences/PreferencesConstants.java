package symo4pd.toolchain.docgen.preferences;

/**
 * Contains string constants with settings keys.
 * @author Michael.Shamiyeh
 *
 */
public class PreferencesConstants {
	
	/**
	 * Key for the default documentation writer preference.
	 */
	public static final String WRITER = "Writer";
	
	/**
	 * Key for the boolean preference, which determines, if model nodes are documented.
	 */
	public static final String GENERATE_MODELENTRY = "ModelEntry";

	/**
	 * Key for the boolean preference, which determines, if package nodes are documented.
	 */
	public static final String GENERATE_PACKAGEENTRY = "PackageEntry";
	
	/**
	 * Key for the boolean preference, which determines, if classes are documented.
	 */
	public static final String GENERATE_CLASSENTRY = "ClassEntry";
	
	/**
	 * Key for the boolean preference, which determines, if enumerations are documented.
	 */
	public static final String GENERATE_ENUMENTRY = "EnumEntry";
	
	/**
	 * Key for the boolean preference, which determines, if data types are documented.
	 */
	public static final String GENERATE_DATATYPEENTRY = "DataTypeEntry";
	
	/**
	 * Key for string preference, which determines the annotation names considered by the documentation generator.
	 */
	public static final String CONSIDERED_ANNOTATIONS = "ConsideredAnnotations";
	
	/**
	 * Key for the boolean preference, which determines, if implemented super classes/interfaces are listed.
	 */
	public static final String GENERATE_IMPLEMENTSLINE = "GenerateImplements";
	
	/**
	 * Key for the boolean preference, which determines, if known sub-classes are listed.
	 */
	public static final String GENERATE_SUBCLASSESLINE = "GenerateSubclasses";
	
	/**
	 * Key for the boolean preference, which determines, if interface/abstract key words are listed.
	 */
	public static final String GENERATE_INTERFACEABSTRACTLINE = "GenerateInterfaceAbstract";
}
