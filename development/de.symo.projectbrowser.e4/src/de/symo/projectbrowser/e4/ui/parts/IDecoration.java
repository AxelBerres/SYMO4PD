package de.symo.projectbrowser.e4.ui.parts;

import org.eclipse.swt.graphics.ImageData;

public interface IDecoration {

	public void registerFileIcon(final String extension, final ImageData imageData);
}
