package org.java.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public String getInputValue() {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		String input = new String();
		try {
			input = reader.readLine();
		} catch (Exception e) {
			view.printMessage(View.INVALID_INPUT);
		}
		return input;
	}
	
}
