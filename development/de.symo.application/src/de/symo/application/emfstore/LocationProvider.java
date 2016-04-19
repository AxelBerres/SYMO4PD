package de.symo.application.emfstore;

import java.io.File;

import org.eclipse.emf.emfstore.server.ESLocationProvider;

public class LocationProvider implements ESLocationProvider {
	public static final Object SYMO_FOLDERNAME = ".symo";
	
	public LocationProvider() {
	}

	@Override
	public String getWorkspaceDirectory() {
		StringBuffer sb = new StringBuffer();
		sb.append(System.getProperty("user.home"));
		sb.append(File.separatorChar);
		sb.append(SYMO_FOLDERNAME);

		return sb.toString();
	}
}
