package de.symo.projectbrowser.e4.ui.parts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.eclipse.core.resources.ResourcesPlugin;


public class ProjectPreference {

	private static String defaultBase = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	private static File projectBase;


	public static File getProjectBase() {

		load();

		// use default base if no preference exists
		if (projectBase == null) {
			projectBase = new File(defaultBase);
		}

		return projectBase;
	}

	public static void setProjectBase(final String fileName) {
		projectBase = new File(fileName);
		save();
	}

	private static void save() {

		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream(getPropertyFile());

			// set the properties value
			prop.setProperty("projectBase", projectBase.getAbsolutePath());

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
				}
			}

		}		
	}

	private static void load() {

		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(getPropertyFile());

			// load a properties file
			prop.load(input);

			// get the property value and print it out			
			projectBase = new File(prop.getProperty("projectBase"));

		} catch (IOException ex) {

		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
				}
			}
		}
	}

	private static String getPropertyFile() {
		String fileName = "config.properties";
		File path = new File(System.getProperty("user.home"), ".symo");
		File file = new File(path, fileName);
		return file.getAbsolutePath();
	}
}
