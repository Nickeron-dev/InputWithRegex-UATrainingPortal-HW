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
		view.printMessage(view.GREETING);
		
	}
	
	public String getInputValue(String regex) {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		String input = new String();
		try {
			input = reader.readLine();
			if (isValid(input, regex)) {
				return input;
			}
		} catch (Exception e) {
			view.printMessage(View.INVALID_INPUT);
		}
		return "";
	}

	public boolean isValid(String target, String regex) {
		if (Pattern.compile(regex).matcher(target).matches()) {
			return true;
		}
		
		return false;
	}
	
}
