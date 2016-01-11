package symo4pd.toolchain.docgen.writer;

/**
 * Abstract base class for documentation writer classes.
 * @author Michael.Shamiyeh
 *
 */
public abstract class ADocWriter implements IDocWriter {
	private String path;

	/**
	 * @return The storage path for all documentation files.
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Stores the path for all documentation files.
	 * @param path The path string (without final backslash).
	 */
	public void setPath(String path) {
		this.path = path;
	}
}
