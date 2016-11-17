package de.symo.projectbrowser.e4.ui.parts;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Vector;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ViewContentProvider implements ITreeContentProvider {

	private final Object[] EMPTY_ARRAY = new Vector<Object>().toArray();	 
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
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
		if (element instanceof File) {
			File file = (File) element;
			return file.getParentFile();
		}
		return null;
	}

	@Override
	public Object[] getElements(Object inputElement) {		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if ((parentElement instanceof File) == false) {
			return EMPTY_ARRAY;
		}

		return filterFiles((File) parentElement);
	}
	
	private Object[] filterFiles(File file) {

		// check input and return empty array if required
		if (file == null) {
			return EMPTY_ARRAY;
		}

		// get all files
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if (name.startsWith(".")) { return false; }
				return true;
			}
		};
		
		return file.listFiles(filter);
		
	}
}
