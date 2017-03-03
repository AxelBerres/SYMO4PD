package de.symo.model.element;

import java.text.DecimalFormat;

public class ElementHelper {
	
	public static String getFormatedValue(String pattern, final String strValue) {

		// check input and use default if required
		if (strValue == null) {
			return null;
		}
		
		if (pattern == null) {
			pattern = "###.000";
		}

		// get the value
		double value = Double.valueOf(strValue);

		// get the formatter and create the output
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);

		// return result
		return output;
	}
}
