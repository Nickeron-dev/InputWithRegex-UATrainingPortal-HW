package org.java.main;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Phone book entity.
 * @author Illia Koshkin
 *
 */
public class PhoneBook {
	
	private List<Contact> phoneBook = new ArrayList<Contact>();
	
	/**
	 * Method that adds new Contact to phone book
	 * @param newContact that will be added to phoneBook
	 */
	public void addContact(Contact newContact) {
		phoneBook.add(newContact);
	}
	
}
