package controller;

import view.TextConstantsPaths;
import view.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class UtilityController {

    private BufferedReader reader;
    private View view;

    /**
     * Constructor of UtilityController
     * @param reader should be BufferedReader(new InputStreamReader(System.in))
     * @param view reference to View object
     */
    public UtilityController(BufferedReader reader, View view) {
        this.reader = reader;
        this.view = view;
    }

    /**
     * Method that gets value from console and checks it
     * @param regex that is in RegexCotainer
     * @return valid inputed value from console
     */
    public String getInputValue(String regex) {
        String input = new String();
        while ( ! isValid(input, regex)) {
            try {
                input = reader.readLine();
                if (isValid(input, regex)) {
                    return input;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                view.printMessage(View.bundle.getString(TextConstantsPaths.INVALID_INPUT));
            }
        }
        return input;
    }

    /**
     * Method that checks a String
     * @param target String that will be checked
     * @param regex that has a rule for a target
     * @return if a String fits all rules
     */
    public boolean isValid(String target, String regex) {
        if (Pattern.compile(regex).matcher(target).matches()) {
            return true;
        }

        return false;
    }
}
