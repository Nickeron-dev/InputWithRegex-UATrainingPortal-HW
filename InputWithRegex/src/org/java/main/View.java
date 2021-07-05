package org.java.main;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class View {

	public static final String INVALID_INPUT =
			"Sorry, you inputed invalid data. Please, try again.";
	public static final String GREETING =
			"Hi! Fill the following form, please!:";
	
	public static final String ASK_FOR_LAST_NAME_INPUT = 
			"Input contact's last name, please. First letter must be capital.";
	public static final String ASK_FOR_FIRST_NAME_INPUT = 
			"Input contact's name, please. First letter must be capital.";
	public static final String ASK_FOR_PATRONYMIC_INPUT = 
			"Input contact's patronymic, please. First letter must be capital.";
	
	public static final String ASK_FOR_NICKNAME_INPUT = 
			"Input contact's nickname, please. First letter must be capital.";
	public static final String ASK_FOR_COMMENT_INPUT = 
			"Input comment for this contact, please. Can't be larger than 64 characters.";
	
	public void printMessage(String message) {
		System.out.println(message);
		
	}

}
