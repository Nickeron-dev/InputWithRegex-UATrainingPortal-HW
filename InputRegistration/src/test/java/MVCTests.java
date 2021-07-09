import controller.Controller;
import controller.CurrentRegexController;
import controller.RegexCotainer;
import controller.UtilityController;
import model.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import view.View;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/**
 * Tests for MVC parts
 * @author Illia Koshkin
 *
 */
public class MVCTests {

    private Model model;
    private View view;
    private Controller controller;
    private UtilityController utilityController;

    /**
     * Method that will run before each test
     */
    @Before
    public void init() {

        model = new Model();
        view = new View();
        controller = new Controller(model, view);
        utilityController = new UtilityController(
                new BufferedReader(new InputStreamReader(System.in)), view);

    }

    /**
     * Test for getInputValue() in Controller
     */
    @Test
    public void getInputValueTest() {

        // first test
        ByteArrayInputStream firstByteStream = new ByteArrayInputStream("Name".getBytes());
        UtilityController controllerU1 = new UtilityController(
                new BufferedReader(new InputStreamReader(firstByteStream)), view);

        Assert.assertEquals("Name", controllerU1.getInputValue(CurrentRegexController.getFirstNameRegex()));

        // second test
        ByteArrayInputStream secondByteStream = new ByteArrayInputStream("Nickname".getBytes());
        UtilityController controllerU2 = new UtilityController(
                new BufferedReader(new InputStreamReader(secondByteStream)), view);

        Assert.assertEquals("Nickname", controllerU2.getInputValue(RegexCotainer.NICKNAME_REGEX));

    }

    /**
     * Test for isValid() method in Controller
     */
    @Test
    public void isValidTest() {
        // correct input
        Assert.assertTrue(utilityController.isValid("Jack", CurrentRegexController.getFirstNameRegex()));
        Assert.assertTrue(utilityController.isValid("Happy", RegexCotainer.NICKNAME_REGEX));
        Assert.assertTrue(utilityController.isValid("067-123-45-67", RegexCotainer.MOBILE_PHONE_REGEX));

        // invalid input
        Assert.assertFalse(utilityController.isValid("", CurrentRegexController.getFirstNameRegex()));
        Assert.assertFalse(utilityController.isValid("happy", RegexCotainer.NICKNAME_REGEX));
        Assert.assertFalse(utilityController.isValid("067-123-4567", CurrentRegexController.getFirstNameRegex()));
    }

}
