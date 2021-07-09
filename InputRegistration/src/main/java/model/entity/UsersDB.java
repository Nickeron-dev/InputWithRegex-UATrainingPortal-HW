package model.entity;

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

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

}
