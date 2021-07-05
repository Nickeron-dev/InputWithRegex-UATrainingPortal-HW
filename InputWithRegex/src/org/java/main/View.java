package org.java.main;

public class View {

	public static final String INVALID_INPUT =
			"Sorry, you inputed invalid data. Please, try again.";
	public static final String GREETING =
			"Hi! Fill the following form, please!:";
	public static final String ASK_FOR_NAME_INPUT = 
			"Input contact's name, please. First letter must be capital.";
	public static final String ASK_FOR_NICKNAME_INPUT = 
			"Input contact's nickname, please. First letter must be capital.";
	
	public void printMessage(String message) {
		System.out.println(message);
		
	}

}
