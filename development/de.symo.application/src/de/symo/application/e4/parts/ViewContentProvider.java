package de.symo.application.e4.parts;

import java.io.File;
import java.util.Vector;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ViewContentProvider implements ITreeContentProvider {

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		System.out.println("Changed");
	}

	@Override
	public void dispose() {			
	}

	@Override
	public boolean hasChildren(Object element) {
		File file = (File) element;
		if (file.isDirectory()) {
			return true;
		}
		return false;		
	}

	@Override
	public Object getParent(Object element) {
		File file = (File) element;
		return file.getParentFile();
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return filterFiles((File) inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return filterFiles((File) parentElement);
	}
	
	private Object[] filterFiles(File file) {

		Vector<Object> elements = new Vector<Object>();		

		if (file == null) {
			return elements.toArray();
		}

		Object[] objects = file.listFiles();
		for (Object object : objects) {
			File cFile = (File) object;
			String name = cFile.getName();
			if ((name.charAt(0) == '.') == false) {
				elements.add(object);
			}
		}
		
		return elements.toArray();		
	}
}
