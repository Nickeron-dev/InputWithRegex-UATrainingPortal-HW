package org.java.main;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<PhoneBook> phoneBook = new ArrayList<PhoneBook>(16);
	private Record currentContact; 
	
	public void createNewContact() {
		currentContact = new Record();
	}
	public void addLastNameToCurrentContact(String inputValue) {
		currentContact.setLastName(inputValue);
	}
	
	public void addNameToCurrentContact(String inputValue) {
		currentContact.setName(inputValue);
	}
	
	public void addPatronymicToCurrentContact(String inputValue) {
		currentContact.setPatronymic(inputValue);
	}
	
	public void addNicknameToCurrentContact(String inputValue) {
		currentContact.setNickname(inputValue);
	}
	
	public String currentContactShortToString() {
		return currentContact.shortToString();
	}
	
}
