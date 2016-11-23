package de.symo.projectbrowser.e4.ui.parts;

import java.io.File;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.program.Program;

import com.google.common.io.Files;

public class ViewLabelProvider extends LabelProvider {

	private ImageDescriptor directoryImage;
	private ResourceManager resourceManager;

	public ViewLabelProvider(ImageDescriptor directoryImage) {
		this.directoryImage = directoryImage;
	}

	@Override
	public String getText(Object element) {		
		if((element instanceof File) == false) {			
			return null;
		}
		
		return ((File) element).getName();
	}

	@Override
	public Image getImage(Object element) {
		
		if(element instanceof File) {
			File file = (File) element;
			if(file.isDirectory()) {
				return getResourceManager().createImage(directoryImage);
			} else {
				String ext = Files.getFileExtension(file.getName());
				ImageData imageData = Program.findProgram(ext).getImageData();
				Device device = getResourceManager().getDevice();
				if ((imageData != null) && (device != null))
				return new Image(device, imageData);
			}			
		}

		return super.getImage(element);
	}

	@Override
	public void dispose() {
		// garbage collect system resources
		if(resourceManager != null) {
			resourceManager.dispose();
			resourceManager = null;
		}
	}

	protected ResourceManager getResourceManager() {
		if(resourceManager == null) {
			resourceManager = new LocalResourceManager(JFaceResources.getResources());
		}
		return resourceManager;
	}
}

