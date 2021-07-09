package controller;

import model.Model;
import model.entity.PhoneBook;
import model.entity.UsersDB;
import view.TextConstantsPaths;
import view.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This is the Controller for my program.
 * @author Illia Koshkin
 *
 */
public class Controller {

    private Model model;
    private View view;
    private UtilityController utilityController;

    /**
     * The constructor for Controller
     * @param model reference to Model object
     * @param view reference to View object
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        utilityController = new UtilityController(
                new BufferedReader(new InputStreamReader(System.in)), view);
    }

    /**
     * The Work method
     */
    public void run() {

        view.printMessage(View.bundle.getString(TextConstantsPaths.GREETING));

        UsersDB db = new UsersDB();
        PhoneBook phoneBook = db.getPhoneBook();

        phoneBook.createNewContact();
        int currentContactIndex = phoneBook.getIterator();

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_LAST_NAME_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setLastName(utilityController.getInputValue(CurrentRegexController.getLastNameRegex()));

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_FIRST_NAME_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setFirstName(utilityController.getInputValue(CurrentRegexController.getFirstNameRegex()));

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_PATRONYMIC_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setPatronymic(utilityController.getInputValue(CurrentRegexController.getPatronymicRegex()));

        view.printMessage(phoneBook.getContactByIndex(currentContactIndex).shortToString());

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_NICKNAME_INPUT));
        String inputNickname = utilityController.getInputValue(RegexCotainer.NICKNAME_REGEX);
        while ( ! utilityController.isUniqueNickname(inputNickname)) {
            view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_ANOTHER_NICKNAME));
            inputNickname = utilityController.getInputValue(RegexCotainer.NICKNAME_REGEX);
        }
        phoneBook.getContactByIndex(currentContactIndex)
                .setNickname(inputNickname);

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_COMMENT_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setComment(utilityController.getInputValue(RegexCotainer.COMMENT_REGEX));

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_GROUP_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setGroup(utilityController.getInputValue(RegexCotainer.GROUP_REGEX));

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_HOME_PHONE_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setHomePhone(utilityController.getInputValue(RegexCotainer.HOME_PHONE_REGEX));

        view.printMessage(View.bundle.getString(TextConstantsPaths.ASK_FOR_MOBILE_PHONE_INPUT));
        phoneBook.getContactByIndex(currentContactIndex)
                .setMobilePhone(utilityController.getInputValue(RegexCotainer.MOBILE_PHONE_REGEX));

        view.printMessage(phoneBook.getContactByIndex(currentContactIndex).toString());

    }



}
