package symo4pd.toolchain.docgen.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
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
		FileDialog fileDialog = new FileDialog(HandlerUtil.getActiveShell(event), SWT.SAVE);
		fileDialog.setText("Select Documentation File");
		fileDialog.setFilterNames(new String[] { "Text Files", "All Files (*.*)" });
		fileDialog.setFilterExtensions(new String[] { "*.txt", "*.*" });
		fileDialog.setFileName("ecore_doc.txt");
		String fileDirectory = fileDialog.open();

		if (fileDirectory != null && !fileDirectory.isEmpty()) {
			// Get the selected GenModel instance:
			IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
			GenModel selectedGenModel = (GenModel)selection.getFirstElement();

			// Start the documentation generation process:
			try {
				EcoreDocGenerator.getInstance().generate(fileDirectory, selectedGenModel);
				new MessageDialog(HandlerUtil.getActiveShell(event), "Doc-Generator", null, "Documentation file successfully generated!", MessageDialog.INFORMATION, new String[] {"OK"}, 0).open();
			} catch (DocGeneratorException e) {
				new MessageDialog(HandlerUtil.getActiveShell(event), "Doc-Generator", null, "Documentation could not be generated:\\n" + e.getMessage(), MessageDialog.ERROR, new String[] {"OK"}, 0).open();
				e.printStackTrace();
			}
		}

		return null;
	}
}