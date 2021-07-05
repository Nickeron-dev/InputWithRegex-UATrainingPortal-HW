package org.java.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class PhoneBook {
	
	private List<Contact> phoneBook = new ArrayList<Contact>();

	public void addContact(Contact newContact) {
		phoneBook.add(newContact);
	}
	
}
