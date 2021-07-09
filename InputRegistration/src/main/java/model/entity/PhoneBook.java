package model.entity;

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
     * New clear Contact creator
     */
    public void createNewContact() {
        phoneBook.add(new Contact());
        iterator++;
    }

    /**
     * Complete Contact creator
     * @param lastName for new Contact
     * @param firstName for new Contact
     * @param patronymic for new Contact
     * @param nickname for new Contact
     * @param comment for new Contact
     * @param group for new Contact
     * @param homePhone for new Contact
     * @param mobilePhone for new Contact
     */
    public void createNewContact(String lastName, String firstName, String patronymic,
                                String nickname, String comment, Groups group,
                                String homePhone, String mobilePhone) {

        phoneBook.add(new Contact(lastName, firstName, patronymic,
                nickname, comment, group, homePhone, mobilePhone));
        iterator++;

    }

    /**
     * Get Contact by index method.
     * @param index of a Contact
     * @return reference to a Contact
     */
    public Contact getContactByIndex(int index) {
        return phoneBook.get(index);
    }

    /**
     * iterator Getter
     * @return iterator value
     */
    public int getIterator() {
        return iterator;
    }
}
