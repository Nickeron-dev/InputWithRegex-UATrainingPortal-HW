package org.java.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class Model {
	
	private PhoneBook phoneBook = new PhoneBook();
	private Contact currentContact; 
	
	public void createNewContact() {
		currentContact = new Contact();
		phoneBook.addContact(currentContact);
	}
	public void addLastNameToCurrentContact(String inputValue) {
		currentContact.setLastName(inputValue);
	}
	
	public void addFirstNameToCurrentContact(String inputValue) {
		currentContact.setFirstName(inputValue);
	}
	
	public void addPatronymicToCurrentContact(String inputValue) {
		currentContact.setPatronymic(inputValue);
	}
	
	public void addNicknameToCurrentContact(String inputValue) {
		currentContact.setNickname(inputValue);
	}
	
	public void addCommentToCurrentContact(String inputValue) {
		currentContact.setComment(inputValue);
	}
	
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
	
	public void addHomePhoneToCurrentContact(String inputValue) {
		currentContact.setHomePhone(inputValue);
	}
	
	public void addMobilePhoneToCurrentContact(String inputValue) {
		currentContact.setMobilePhone(inputValue);
	}
	
	
	public String currentContactShortToString() {
		return currentContact.shortToString();
	}
	
	
	
}
