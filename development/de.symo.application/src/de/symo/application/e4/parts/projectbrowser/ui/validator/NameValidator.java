package de.symo.application.e4.parts.projectbrowser.ui.validator;

import org.eclipse.jface.dialogs.IInputValidator;

public class NameValidator implements IInputValidator {

	@Override
	public String isValid(String newText) {
		if (newText.contains(" ")) {
			return "A folder name can not have space character.";
		}
		return null;
	}
}
