package controller;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Phone book entity.
 * @author Illia Koshkin
 *
 */
public class PhoneBook {

    private List<Contact> phoneBook = new ArrayList<Contact>();
    private int iterator = -1; // no elements

    /**
     * New Contact creator
     * @return Index of a Contact that was created
     */
    public int createNewContact() {
        phoneBook.add(new Contact());
        return ++iterator;
    }

    /**
     * Get Contact by index method.
     * @param index of a Contact
     * @return reference to a Contact
     */
    public Contact getContactByIndex(int index) {
        return phoneBook.get(index);
    }
}
