package org.java.main;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<PhoneBook> phoneBook = new ArrayList<PhoneBook>(16);
	private Record currentContact; 
	
	public void createNewContact() {
		currentContact = new Record();
	}

	public void addNameToCurrentContact(String inputValue) {
		currentContact.setName(inputValue);
	}
	
	public void addNicknameToCurrentContact(String inputValue) {
		currentContact.setNickname(inputValue);
	}
	
	public String currentContactToString() {
		return currentContact.toString();
	}
	
}
