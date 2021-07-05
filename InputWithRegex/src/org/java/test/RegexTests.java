package org.java.test;

import java.util.regex.Pattern;

import org.java.main.GlobalConstants;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class RegexTests {

	// REGEX tests
	@Test
	public void lastNameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.LAST_NAME_REGEX).matcher("Jack").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.LAST_NAME_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.LAST_NAME_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void nameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.FIRST_NAME_REGEX).matcher("Jack").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.FIRST_NAME_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.FIRST_NAME_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void patronymicRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.PATRONYMIC_REGEX).matcher("Jack").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.PATRONYMIC_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.PATRONYMIC_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void nicknameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("Happy").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void commentRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.COMMENT_REGEX).matcher("Happy asdfasdf 058-123-4567.").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.COMMENT_REGEX).matcher("").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.COMMENT_REGEX).matcher("123456789101112131415161718192021234567891011121314151617181920222").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void phoneRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("067-123-45-67").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
}
