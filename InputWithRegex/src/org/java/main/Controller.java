package org.java.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Controller {
	
	private Model model;
	private View view;
	
	// Constructor
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	// The Work method
	public void run() {
		view.printMessage(View.GREETING);
		
		view.printMessage(View.ASK_FOR_NAME_INPUT);
		model.createNewContact();
		model.addNameToCurrentContact(getInputValue(GlobalConstants.NAME_REGEX));
		
		view.printMessage(View.ASK_FOR_NICKNAME_INPUT);
		model.addNicknameToCurrentContact(getInputValue(GlobalConstants.NICKNAME_REGEX));
		
		view.printMessage(model.currentContactToString());
	}
	
	public String getInputValue(String regex) {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		String input = new String();
		while ( ! isValid(input, regex)) {
			try {
				input = reader.readLine();
				if (isValid(input, regex)) {
					return input;
				}
				else {
					throw new Exception();
				}
			} catch (Exception e) {
				view.printMessage(View.INVALID_INPUT);
			}
		}
		return input;
	}

	public boolean isValid(String target, String regex) {
		if (Pattern.compile(regex).matcher(target).matches()) {
			return true;
		}
		
		return false;
	}
	
}
