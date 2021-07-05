package org.java.main;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Model for my program.
 * @author Illia Koshkin
 *
 */
public class Model {
	
	private PhoneBook phoneBook = new PhoneBook();
	private Contact currentContact; 
	
	/**
	 * Method that creates new Contact and calls addContact()
	 */
	public void createNewContact() {
		currentContact = new Contact();
		phoneBook.addContact(currentContact);
	}
	
	/**
	 * Method that adds last name to a Contact
	 * @param inputValue that was inserted by user.
	 */
	public void addLastNameToCurrentContact(String inputValue) {
		currentContact.setLastName(inputValue);
	}
	
	/**
	 * Method that adds first name to a Contact
	 * @param inputValue that was inserted by user.
	 */
	public void addFirstNameToCurrentContact(String inputValue) {
		currentContact.setFirstName(inputValue);
	}
	
	/**
	 * Method that adds patronymic to a Contact
	 * @param inputValue that was inserted by user.
	 */
	public void addPatronymicToCurrentContact(String inputValue) {
		currentContact.setPatronymic(inputValue);
	}
	
	/**
	 * Method that adds nickname to a Contact
	 * @param inputValue that was inserted by user.
	 */
	public void addNicknameToCurrentContact(String inputValue) {
		currentContact.setNickname(inputValue);
	}
	
	/**
	 * Method that adds comment to a Contact
	 * @param inputValue that was inserted by user.
	 */
	public void addCommentToCurrentContact(String inputValue) {
		currentContact.setComment(inputValue);
	}
	
	/**
	 * Method that adds group to a Contact
	 * @param inputValue that was inserted by user.
	 */
	public void addGroupToCurrentContact(String inputValue) {
		if (inputValue.equals("FAMILY") || inputValue.equals("family")) {
			currentContact.setGroup(Groups.FAMILY);
		}
		
		if (inputValue.equals("FRIENDS") || inputValue.equals("friends")) {
			currentContact.setGroup(Groups.FRIENDS);
		}
		
		if (inputValue.equals("NEIGHBOURS") || inputValue.equals("neighbours")) {
			currentContact.setGroup(Groups.NEIGHBOURS);
		}
		
		if (inputValue.equals("WORK") || inputValue.equals("work")) {
			currentContact.setGroup(Groups.WORK);
		}
		
		if (inputValue.equals("OTHER") || inputValue.equals("other")) {
			currentContact.setGroup(Groups.OTHER);
		}
		
	}
	
	/**
	 * Output short information method
	 * @return short information about a user.
	 */
	public String currentContactShortToString() {
		return currentContact.shortToString();
	}
	
	
}
