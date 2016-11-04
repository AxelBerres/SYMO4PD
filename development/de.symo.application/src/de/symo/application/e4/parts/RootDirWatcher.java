package de.symo.application.e4.parts;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class RootDirWatcher implements Runnable {

	ProjectBrowser browser = null;
	WatchService watcher = null;
	boolean run = true;

	public RootDirWatcher(ProjectBrowser browser) {
		run = true;		
		this.browser = browser;
		try {
			watcher = FileSystems.getDefault().newWatchService();
		} catch (Exception e) {
		}
	}		
		
	public void updateFolder(final String folder) {
		
		if (folder == null) {
			return;
		}

		Path dir = Paths.get(folder);
		try {
			dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
			System.out.println("Watch Service registered for dir: " + dir.getFileName());
		} catch (Exception e) {
		}
	}		

	@Override
	public void run() {
		
		while (true) {
			WatchKey key;
			try {
				key = watcher.take();
			} catch (InterruptedException ex) {
				return;
			}

			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent.Kind<?> kind = event.kind();

				@SuppressWarnings("unchecked")
				WatchEvent<Path> ev = (WatchEvent<Path>) event;
				Path fileName = ev.context();

				System.out.println(kind.name() + ": " + fileName);

		        if (kind == OVERFLOW) {
		            continue;
		        } else {
		        	ProjectBrowser.refresh();
		        }
			}

			boolean valid = key.reset();
			if (!valid) {
				break;
			}
		}
	}
	
	public void exit() {
		run = false;
	}
	
}



