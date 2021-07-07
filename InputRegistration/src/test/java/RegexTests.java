import java.util.regex.Pattern;

import controller.RegexCotainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Regex tests file
 * @author Illia Koshkin
 *
 */
public class RegexTests {

    /**
     * Test for last name regex
     */
    @Test
    public void lastNameRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.LAST_NAME_REGEX).matcher("Jack").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.LAST_NAME_REGEX).matcher("asdfasdf").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.LAST_NAME_REGEX).matcher("058-123-4567").matches();
        Assert.assertFalse(thirdTest);

    }

    /**
     * Test for first name regex
     */
    @Test
    public void nameRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.FIRST_NAME_REGEX).matcher("Jack").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.FIRST_NAME_REGEX).matcher("asdfasdf").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.FIRST_NAME_REGEX).matcher("058-123-4567").matches();
        Assert.assertFalse(thirdTest);

    }

    /**
     * Test for patronymic regex
     */
    @Test
    public void patronymicRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.PATRONYMIC_REGEX).matcher("Jack").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.PATRONYMIC_REGEX).matcher("asdfasdf").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.PATRONYMIC_REGEX).matcher("058-123-4567").matches();
        Assert.assertFalse(thirdTest);

    }

    /**
     * Test for nickname regex
     */
    @Test
    public void nicknameRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.NICKNAME_REGEX).matcher("Happy").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.NICKNAME_REGEX).matcher("asdfasdf").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.NICKNAME_REGEX).matcher("058-123-4567").matches();
        Assert.assertFalse(thirdTest);

    }

    /**
     * Test for comment regex
     */
    @Test
    public void commentRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.COMMENT_REGEX).matcher("Happy asdfasdf 058-123-4567.").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.COMMENT_REGEX).matcher("").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.COMMENT_REGEX).matcher("123456789101112131415161718192021234567891011121314151617181920222").matches();
        Assert.assertFalse(thirdTest);

    }

    /**
     * Test for group regex
     */
    @Test
    public void groupRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("Happy").matches();
        Assert.assertFalse(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("family").matches();
        Assert.assertTrue(thirdTest);

        boolean fourthTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("NEIGHBOURS").matches();
        Assert.assertTrue(fourthTest);

        boolean fifthTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("FRIENDS").matches();
        Assert.assertTrue(fifthTest);

        boolean sixthTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("WORK").matches();
        Assert.assertTrue(sixthTest);

        boolean seventhTest = Pattern.compile(RegexCotainer.GROUP_REGEX).matcher("OTHER").matches();
        Assert.assertTrue(seventhTest);

    }

    /**
     * Test for phone regex
     */
    @Test
    public void homePhoneRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.HOME_PHONE_REGEX).matcher("044-123-45-67").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.HOME_PHONE_REGEX).matcher("123-12-34").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.HOME_PHONE_REGEX).matcher("058-123-4567").matches();
        Assert.assertFalse(thirdTest);

    }

    @Test
    public void mobilePhoneRegexTest() {

        boolean firstTest = Pattern.compile(RegexCotainer.MOBILE_PHONE_REGEX).matcher("067-123-45-67").matches();
        Assert.assertTrue(firstTest);

        boolean secondTest = Pattern.compile(RegexCotainer.MOBILE_PHONE_REGEX).matcher("asdfasdf").matches();
        Assert.assertEquals(false, secondTest);

        boolean thirdTest = Pattern.compile(RegexCotainer.MOBILE_PHONE_REGEX).matcher("058-123-4567").matches();
        Assert.assertFalse(thirdTest);

    }

}
