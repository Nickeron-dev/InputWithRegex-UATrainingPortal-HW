package model.entity;

/**
 * Users database imitation
 * @author Illia Koshkin
 */
public class UsersDB {

    private PhoneBook phoneBook = new PhoneBook();
    {
        phoneBook.createNewContact("Smith", "Jacob", "Back",
                "SJB20", "Very famous person!", Groups.FAMILY,
                "044-232-43-15", "067-123-98-76");
        phoneBook.createNewContact("Johnson", "Alexander", "Kennedy",
                "Alex79",  "Not very famous person.", Groups.FRIENDS,
                "044-232-95-19", "050-233-75-23");
        phoneBook.createNewContact("Brown", "Daniel", "Velden",
                "brownJ50", "PRO user", Groups.NEIGHBOURS,
                "044-232-36-18", "073-423-32-23");
    }

    /**
     * Phone book getter
     * @return phone book reference
     */
    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public String[] getAllNicknames() {
        String[] answer = new String[phoneBook.getIterator() + 1];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = phoneBook.getContactByIndex(i).getNickname();
        }
        return answer;
    }

}
