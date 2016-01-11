package symo4pd.toolchain.docgen.exception;

/**
 * Documentation generator exception.
 * 
 * @author Michael.Shamiyeh
 *
 */
public class DocGeneratorException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor with a single message.
	 * 
	 * @param message
	 *            Message string.
	 */
	public DocGeneratorException(String message) {
		super(message);
	}

	/**
	 * Constructor with a message and an inner exception.
	 * 
	 * @param message
	 *            Message string.
	 * @param inner
	 *            Inner exception.
	 */
	public DocGeneratorException(String message, Exception inner) {
		super(message, inner);
	}
}
