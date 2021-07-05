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
	
	public String currentContactShortToString() {
		return currentContact.shortToString();
	}
	
}
