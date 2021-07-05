package org.java.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
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
		
		model.createNewContact();
		
		view.printMessage(View.ASK_FOR_LAST_NAME_INPUT);
		model.addLastNameToCurrentContact(getInputValue(GlobalConstants.LAST_NAME_REGEX));
		
		view.printMessage(View.ASK_FOR_FIRST_NAME_INPUT);
		model.addFirstNameToCurrentContact(getInputValue(GlobalConstants.FIRST_NAME_REGEX));
		
		view.printMessage(View.ASK_FOR_PATRONYMIC_INPUT);
		model.addPatronymicToCurrentContact(getInputValue(GlobalConstants.PATRONYMIC_REGEX));
		
		view.printMessage(model.currentContactShortToString());
		
		view.printMessage(View.ASK_FOR_NICKNAME_INPUT);
		model.addNicknameToCurrentContact(getInputValue(GlobalConstants.NICKNAME_REGEX));
		
		view.printMessage(View.ASK_FOR_COMMENT_INPUT);
		model.addCommentToCurrentContact(getInputValue(GlobalConstants.COMMENT_REGEX));
		
		view.printMessage(View.ASK_FOR_GROUP_INPUT);
		model.addGroupToCurrentContact(getInputValue(GlobalConstants.GROUP_REGEX));
		
		view.printMessage(View.ASK_FOR_HOME_PHONE_INPUT);
		model.addHomePhoneToCurrentContact(getInputValue(GlobalConstants.HOME_PHONE_REGEX));
		
		view.printMessage(View.ASK_FOR_MOBILE_PHONE_INPUT);
		model.addMobilePhoneToCurrentContact(getInputValue(GlobalConstants.MOBILE_PHONE_REGEX));
		
		/*
		 * view.printMessage(View.ASK_FOR_MOBILE_PHONE_2_INPUT);
		 * model.addMobilePhone2ToCurrentContact(getInputValue(GlobalConstants.
		 * MOBILE_PHONE_REGEX));
		 */
		
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
