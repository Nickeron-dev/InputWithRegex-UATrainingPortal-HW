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
	public void LastNameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.LAST_NAME_REGEX).matcher("Jack").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.LAST_NAME_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.LAST_NAME_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void NameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.FIRST_NAME_REGEX).matcher("Jack").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.FIRST_NAME_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.FIRST_NAME_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void PatronymicRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.PATRONYMIC_REGEX).matcher("Jack").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.PATRONYMIC_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.PATRONYMIC_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void NicknameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("Happy").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
	@Test
	public void PhoneRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("067-123-45-67").matches();
		Assert.assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("asdfasdf").matches();
		Assert.assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("058-123-4567").matches();
		Assert.assertFalse(thirdTest);
		
	}
	
}
