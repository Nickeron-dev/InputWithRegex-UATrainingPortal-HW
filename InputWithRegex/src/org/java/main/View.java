package org.java.main;

/**
 * This is the View for my program.
 * @author Illia Koshkin
 *
 */
public class View {
	
	/**
	 * Ready outputs
	 */
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
	public static final String ASK_FOR_GROUP_INPUT = 
			"Choose group for this contact, please. FAMILY / FRIENDS / NEIGHBOURS / WORK / OTHER";
	public static final String ASK_FOR_HOME_PHONE_INPUT = 
			"Input contact's home phone number. Format: 044-XXX-XX-XX";
	public static final String ASK_FOR_MOBILE_PHONE_INPUT = 
			"Input contact's mobile phone number. Format: XXX-XXX-XX-XX";
	
	/**
	 * Method that prints a message
	 * @param message that will be printed
	 */
	public void printMessage(String message) {
		System.out.println(message);
		
	}

}
