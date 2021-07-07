package view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This is the View for my program.
 * @author Illia Koshkin
 *
 */
public class View {

    // Ready outputs


    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                    //new Locale("en")); // English
                    new Locale("ua", "UA")); // Ukrainian

    /**
     * Method that prints a message
     * @param message that will be printed
     */
    public void printMessage(String message) {
        System.out.println(message);

    }

}
