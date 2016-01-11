package symo4pd.toolchain.docgen.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import symo4pd.toolchain.docgen.EcoreDocGenerator;
import symo4pd.toolchain.docgen.exception.DocGeneratorException;

/**
 * The {@link DocGenHandler} is the command handler for the
 * {@link symo4pd.toolchain.codegen.generatecommand} and therefore, entry point
 * of this plug-in. It opens a {@link DirectoryDialog} for choosing the
 * directory, where the model documentation is generated. Further, the selected
 * {@link GenModel} is passed to the {@link EcoreDocGenerator}.
 * 
 * @author Michael.Shamiyeh
 *
 */
public class DocGenHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Create dialog to select the documentation directory:
		DirectoryDialog fileDialog = new DirectoryDialog(HandlerUtil.getActiveShell(event));
		fileDialog.setText("Select Target Folder");
		String docDirectory = fileDialog.open();

		if (docDirectory != null && !docDirectory.isEmpty()) {
			// Get the selected GenModel instance:
			IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
			GenModel selectedGenModel = (GenModel)selection.getFirstElement();

			// Start the documentation generation process:
			try {
				EcoreDocGenerator.getInstance().generate(docDirectory, selectedGenModel);
			} catch (DocGeneratorException e) {
				// TODO Dialog/Messagebox?
				e.printStackTrace();
			}
		}

		return null;
	}
}