package symo4pd.toolchain.docgen.writer.txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import symo4pd.toolchain.docgen.exception.DocGeneratorException;
import symo4pd.toolchain.docgen.model.DocModelElement;
import symo4pd.toolchain.docgen.writer.ADocWriter;

/**
 * 
 * @author Michael.Shamiyeh
 *
 */
public class TextDocWriter extends ADocWriter {
	private final String FILENAME = "EcoreModelDocumentation.txt";
	
	private final String TAB_CHAR = "\t";
	
	private final char UNDERLINE_CHAR = '-';
	private final char UNDERLINE_CHAR_PACKAGE = '=';
	
	private String lineSeparator;
	
	private boolean tabSubElements;
	
	private List<String> consideredDocEntries = new ArrayList<String>();

	private StringBuilder builder;
	
	public TextDocWriter() {
	}
	
	@Override
	public void initialize(final String path) {
		setPath(path);
		builder = new StringBuilder();
		
		lineSeparator = System.lineSeparator();
		tabSubElements = true;
		
		consideredDocEntries.add(DocModelElement.ENTRYNAME_BASE);
		consideredDocEntries.add(DocModelElement.ENTRYNAME_KNOWNSUBS);
		consideredDocEntries.add(DocModelElement.ENTRYNAME_DESCRIPTION);
	}

	@Override
	public void writeDocModelElementDocumentation(final DocModelElement docElement) {
		String headLine = generateHeadLine(docElement);
		String tabString = generateMultiTab(docElement.getHierarchyLevel());
		
		if (tabSubElements)
			builder.append(tabString);

		builder.append(headLine);
		builder.append(lineSeparator);
		
		if (docElement.getType().equals(DocModelElement.TYPE_EPACKAGE)) {
			if (tabSubElements)
				builder.append(tabString);
		
			builder.append(generateUnderline(headLine, UNDERLINE_CHAR_PACKAGE));
		}
		else {
			if (tabSubElements)
				builder.append(tabString);
		
			builder.append(generateUnderline(headLine, UNDERLINE_CHAR));
		}
		
		builder.append(lineSeparator);
		
		for (String consideredKey : consideredDocEntries) {
			if (docElement.getDocEntries().containsKey(consideredKey)) {
				if (tabSubElements)
					builder.append(tabString);
				
				builder.append(consideredKey + ": " + docElement.getDocEntries().get(consideredKey));
				builder.append(lineSeparator);
			}
		}
		
		builder.append(lineSeparator);
		builder.append(lineSeparator);

		for (DocModelElement subElement : docElement.getChildren()) {
			writeDocModelElementDocumentation(subElement);
		}
	}

	@Override
	public void finishDocumentation() throws DocGeneratorException {
		File file = new File(getPath() + "\\" + FILENAME);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
		    writer.append(builder);
		} catch (IOException e) {
			throw new DocGeneratorException("Error occured during file writing.", e);
		}
	}
	
	/**
	 * Generates the headline string of a documentation model element. The string consists of the name and the type of the element.
	 * If the element is an interface or an abstract element, the appropriate keywords are appended.
	 * @param docElement Documentation model object for which the headline is generated.
	 * @return The headline string.
	 */
	private String generateHeadLine(DocModelElement docElement) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(docElement.getName());
		builder.append(" (");
		builder.append(docElement.getType());
		builder.append(")");
		
		if (docElement.getDocEntries().containsKey(DocModelElement.MODIFIER_INTERFACE))
			builder.append(" | Interface");
		
		if (docElement.getDocEntries().containsKey(DocModelElement.MODIFIER_ABSTRACT))
			builder.append(" | Abstract");
		
		return builder.toString();
	}

	/**
	 * Generates a string containing a series of tabulator characters.
	 * @param count The amount of tab characters.
	 * @return The tab string.
	 */
	private String generateMultiTab(int count) {
		return multiplyString(TAB_CHAR, count);
	}
	
	/**
	 * Generates a string containing an underlining of a text with appropriate length.
	 * @param headLine The string containing the text to underline.
	 * @param underLineChar Character, which is used to create the underlining.
	 * @return The underlining string.
	 */
	private String generateUnderline(String headLine, char underLineChar) {
		return multiplyChar(underLineChar, headLine.length());
	}
	
	/**
	 * Multiplies a string.
	 * @param str String, which is concatenated.
	 * @param count The number of concatenations.
	 * @return The result string consisting of {@literal count} consecutive strings {@literal str}.
	 */
	private static String multiplyString(String str, int count) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++)
			buffer.append(str);
		
		return buffer.toString();
	}
	
	/**
	 * Multiplies a character.
	 * @param c Character, which is concatenated.
	 * @param count The number of concatenations.
	 * @return The result string consisting of {@literal count} consecutive characters {@literal c}.
	 */
	private static String multiplyChar(char c, int count) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++)
			buffer.append(c);

		return buffer.toString();
	}
}
