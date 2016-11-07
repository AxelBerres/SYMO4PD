package de.symo.projectbrowser.e4.ui.parts;

import java.io.File;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

public class ProjectComperator extends ViewerComparator {

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {				
		int cat1 = sortDirs(e1);
		int cat2 = sortDirs(e2);
		if (cat1 != cat2) return cat1 - cat2;				   
		return 0;
	}

	/** Orders the items in such a way that books appear 
	 * before moving boxes, which appear before board games. */
	private int sortDirs(Object element) {
		File file = (File) element;
		if (file.isDirectory() == true) return 1;
		return 2;
	}
}
