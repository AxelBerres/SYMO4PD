package de.symo.projectbrowser.e4.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import de.symo.projectbrowser.e4.ui.parts.ProjectBrowserPart;

/**
 * 
 * @author Axel Berres, Michael Shamiyeh
 *
 */
public class ProjectDeleteHandler {

	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection, Shell shell) {

		// check input arguments
		if (selection == null || shell == null) {
			return;
		}

		// put the selection into an array
		Object objects[] = null;
		if (selection.getClass().isArray()) {
			objects = (Object [])selection;
		} else {
			objects = new Object[1];
			objects[0] = selection;
		}

		int count = objects.length;
		String msg = " file";
		if (count > 1)    msg = msg +"s";
		
		boolean result = MessageDialog.openConfirm(shell, "Confirm", "Please confirm deletion of " + count + msg);
		if (result == false) {
			return;
		}

		// delete files
		for (int i = 0; i < count; i++) {
		
			// check selection
			if ((objects[i] instanceof File) == false) {
				continue;
			}

			// convert file to path and delete 
			File file = (File) objects[i];
			Path path = FileSystems.getDefault().getPath(file.toString());
	
			try {
				Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
	
					@Override
					public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
						Files.delete(file);
						return FileVisitResult.CONTINUE;
					}
	
					@Override
					public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
						Files.delete(dir);
						return FileVisitResult.CONTINUE;
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// ### FIXME HACK
		// should be fixed by a model change listener
		ProjectBrowserPart.refresh();
	}	
}
