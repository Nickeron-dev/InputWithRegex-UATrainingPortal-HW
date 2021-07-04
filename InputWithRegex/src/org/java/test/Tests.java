package org.java.test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.java.main.GlobalConstants;
import org.junit.Test;

public class Tests {
	
	// REGEX tests
	@Test
	public void globalConstantsNicknameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("Happy").matches();
		assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("asdfasdf").matches();
		assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.NICKNAME_REGEX).matcher("058-123-4567").matches();
		assertFalse(thirdTest);
		
	}
	
	@Test
	public void globalConstantsNameRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.NAME_REGEX).matcher("Jack").matches();
		assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.NAME_REGEX).matcher("asdfasdf").matches();
		assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.NAME_REGEX).matcher("058-123-4567").matches();
		assertFalse(thirdTest);
		
	}
	
	@Test
	public void globalConstantsPhoneRegexTest() {
		
		boolean firstTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("067-123-45-67").matches();
		assertTrue(firstTest);
		
		boolean secondTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("asdfasdf").matches();
		assertEquals(false, secondTest);
		
		boolean thirdTest = Pattern.compile(GlobalConstants.PHONE_REGEX).matcher("058-123-4567").matches();
		assertFalse(thirdTest);
		
	}
	
	

}
