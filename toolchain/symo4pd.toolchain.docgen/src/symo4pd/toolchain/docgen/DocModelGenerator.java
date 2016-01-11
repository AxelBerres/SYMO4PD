package symo4pd.toolchain.docgen;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EAnnotation;

import symo4pd.toolchain.docgen.model.DocElementFactory;
import symo4pd.toolchain.docgen.model.DocModelElement;
import symo4pd.toolchain.docgen.preferences.PreferencesConstants;

/**
 * The DocModelGenerator contains the functionality to create the generic
 * documentation model of a given GenModel. The {@link DocModel} serves as a
 * standardized source for the documentation writers. The DocModel is created
 * with respect to the stored plug-in preferences.
 * 
 * @author Michael.Shamiyeh
 *
 */
public class DocModelGenerator {
	private GenModel genModel;

	private DocModelElement documentationElement;

	private Map<String, String> implementsMap = new HashMap<String, String>();

	public DocModelElement getDocumentationElement() {
		return documentationElement;
	}

	/**
	 * Constructor with the GenModel to create the documentation for.
	 * 
	 * @param genModel
	 *            The GenModel object.
	 */
	public DocModelGenerator(GenModel genModel) {
		this.genModel = genModel;
	}

	/**
	 * Initializes the generator and creates the full DocModel.
	 */
	public void generate() {
		implementsMap.clear();
		documentationElement = DocElementFactory.generateEcoreModelDocElement(genModel.getModelName());

		for (GenPackage genPackage : genModel.getGenPackages()) {
			DocModelElement packageElem = generatePackageDocElement(genPackage);
			packageElem.setParent(documentationElement);
			documentationElement.getChildren().add(packageElem);
		}

		checkAndSetImplementsEntry(documentationElement);
	}

	/**
	 * Internal method, which contains the code to generate the documentation
	 * for GenModel Packages. Within the method, also the DocModel elements of
	 * all sub items (classes, enumerations, data types) of the package are
	 * created.
	 * 
	 * @param packageElement
	 *            The package object of the GenModel.
	 * @return DocModel element of the package including all sub elements as
	 *         children.
	 */
	private DocModelElement generatePackageDocElement(GenPackage packageElement) {
		DocModelElement docElem = DocElementFactory.generatePackageDocElement(packageElement.getPackageName());
		generateAnnotationEntries(packageElement, docElem);

		if (Activator.preferences.getBoolean(PreferencesConstants.GENERATE_CLASSENTRY)) {
			for (GenClass subClass : packageElement.getGenClasses()) {
				DocModelElement classModelElem = generateClassDocElement(subClass);
				docElem.addChild(classModelElem);
			}
		}

		if (Activator.preferences.getBoolean(PreferencesConstants.GENERATE_ENUMENTRY)) {
			for (GenEnum subEnum : packageElement.getGenEnums()) {
				DocModelElement enumElem = generateEnumDocElement(subEnum);
				docElem.addChild(enumElem);
			}
		}

		if (Activator.preferences.getBoolean(PreferencesConstants.GENERATE_DATATYPEENTRY)) {
			for (GenDataType subDataType : packageElement.getGenDataTypes()) {
				DocModelElement dataTypeElem = generateDataTypeElement(subDataType);
				docElem.addChild(dataTypeElem);
			}
		}

		for (GenPackage subPackage : packageElement.getSubGenPackages()) {
			DocModelElement packageDocElem = generatePackageDocElement(subPackage);
			docElem.addChild(packageDocElem);
		}

		return docElem;
	}

	/**
	 * Internal method to create the DocModel element for a GenModel class.
	 * 
	 * @param genClass
	 *            Class object of the GenModel.
	 * @return DocModel element of the class.
	 */
	private DocModelElement generateClassDocElement(final GenClass genClass) {
		DocModelElement classElem = DocElementFactory.generateClassDocElement(genClass.getClassifierAccessorName());
		generateAnnotationEntries(genClass, classElem);
		generateBaseEntry(genClass, classElem);
		generateInterfaceAbstractEntries(genClass, classElem);
		return classElem;
	}

	/**
	 * Internal method to create the DocModel element for a GenModel
	 * enumeration.
	 * 
	 * @param genEnum
	 *            Enumeration object of the GenModel.
	 * @return DocModel element of the enumeration.
	 */
	private DocModelElement generateEnumDocElement(final GenEnum genEnum) {
		DocModelElement enumElem = DocElementFactory.generateEnumDocElement(genEnum.getClassifierAccessorName());
		generateAnnotationEntries(genEnum, enumElem);
		return enumElem;
	}

	/**
	 * Internal method to create the DocModel element for a GenModel data type.
	 * 
	 * @param genDataType
	 *            Data type object of the GenModel.
	 * @return DocModel element of the data type.
	 */
	private DocModelElement generateDataTypeElement(final GenDataType genDataType) {
		DocModelElement dataTypeElem = DocElementFactory.generateDataTypeDocElement(genDataType.getClassifierAccessorName());
		generateAnnotationEntries(genDataType, dataTypeElem);
		return dataTypeElem;
	}

	/**
	 * Internal method, which creates DocModel element entries for all GenModel
	 * annotations with the specified name {@literal description}.
	 * 
	 * @param genElement
	 *            The GenModel element.
	 * @param docElem
	 *            The associated DocModel element, which stores the entries.
	 */
	private void generateAnnotationEntries(GenBase genElement, DocModelElement docElem) {
		for (EAnnotation annotation : genElement.getEcoreModelElement().getEAnnotations()) {
			for (Entry<String, String> entry : annotation.getDetails()) {
				if (entry.getKey().equals(DocModelElement.ENTRYNAME_DESCRIPTION)) {
					docElem.getDocEntries().put(DocModelElement.ENTRYNAME_DESCRIPTION, entry.getValue());
				}
			}
		}
	}

	/**
	 * Internal method, which creates the DocEntry {@literal Known base classes}
	 * . Therefore, all base GenClasses are iterated and their names are
	 * appended. Further, map entries are created for the derived classes, in
	 * order to create the {@literal Implements} DocEntries later.
	 * 
	 * @param genClass
	 *            The GenModel class object, for which the base class entries
	 *            are created.
	 * @param docElem
	 *            The associated DocModel element, which stores the entries.
	 */
	private void generateBaseEntry(GenClass genClass, DocModelElement docElem) {
		if (!genClass.getBaseGenClasses().isEmpty()) {
			StringBuilder builder = new StringBuilder();

			for (GenClass baseClass : genClass.getBaseGenClasses()) {
				builder.append(baseClass.getClassifierAccessorName() + ", ");

				if (implementsMap.containsKey(baseClass.getClassifierAccessorName()))
					implementsMap.put(baseClass.getClassifierAccessorName(), implementsMap.get(baseClass.getClassifierAccessorName()).concat(", " + genClass.getClassifierAccessorName()));
				else
					implementsMap.put(baseClass.getClassifierAccessorName(), genClass.getClassifierAccessorName());
			}

			String valueStr = builder.toString();

			// remove the surplus comma, at the end:
			if (valueStr.length() >= 2)
				valueStr = valueStr.substring(0, valueStr.length() - 2);

			docElem.getDocEntries().put(DocModelElement.ENTRYNAME_BASE, valueStr);
		}
	}

	/**
	 * Internal method, which creates the {@literal Implements} DocModel entry,
	 * if map entries are available.
	 * 
	 * @param elem
	 *            The DocModel element, in which the entry is stored.
	 */
	private void checkAndSetImplementsEntry(DocModelElement elem) {
		if (implementsMap.containsKey(elem.getName()))
			elem.getDocEntries().put(DocModelElement.ENTRYNAME_KNOWNSUBS, implementsMap.get(elem.getName()));

		for (DocModelElement subElem : elem.getChildren()) {
			checkAndSetImplementsEntry(subElem);
		}
	}

	/**
	 * Internal method, which creates documentation element entries for
	 * {@literal interface} and {@literal abstract} elements.
	 * 
	 * @param genClass
	 *            The GenClass object, for which the entries are created.
	 * @param docElement
	 *            The associated DocModel element, which stores the entries.
	 */
	private void generateInterfaceAbstractEntries(GenClass genClass, DocModelElement docElement) {
		if (genClass.isInterface())
			docElement.getDocEntries().put(DocModelElement.MODIFIER_INTERFACE, "");

		if (genClass.isAbstract())
			docElement.getDocEntries().put(DocModelElement.MODIFIER_ABSTRACT, "");
	}
}
