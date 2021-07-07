
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * This is the Controller for my program.
 * @author Illia Koshkin
 *
 */
public class Controller {

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

    public boolean test() {
        return true;
    }

}
