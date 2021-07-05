package org.java.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.java.main.Controller;
import org.java.main.GlobalConstants;
import org.java.main.Model;
import org.java.main.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class MVCTests {
	
	private Model model;
	private View view;
	private Controller controller;
	
	@Before
	public void init() {
		
		model = new Model();
		view = new View();
		controller = new Controller(model, view);
		
	}
	
	@Test
	public void getInputValueTest() {
		
		InputStream stream = System.in; // backup to restore later
		
		// first test
		ByteArrayInputStream firstByteStream = new ByteArrayInputStream("Name".getBytes());
		System.setIn(firstByteStream);
		
		Assert.assertEquals("Name", controller.getInputValue(GlobalConstants.NAME_REGEX));
		
		// second test
		ByteArrayInputStream secondByteStream = new ByteArrayInputStream("Nickname".getBytes());
		System.setIn(secondByteStream);
		
		Assert.assertEquals("Nickname", controller.getInputValue(GlobalConstants.NICKNAME_REGEX));
		
		System.setIn(stream);
		
	}
	
	@Test
	public void isValidTest() {
		// correct input
		Assert.assertTrue(controller.isValid("Jack", GlobalConstants.NAME_REGEX));
		Assert.assertTrue(controller.isValid("Happy", GlobalConstants.NICKNAME_REGEX));
		Assert.assertTrue(controller.isValid("067-123-45-67", GlobalConstants.PHONE_REGEX));
		
		// invalid input
		Assert.assertFalse(controller.isValid("", GlobalConstants.NAME_REGEX));
		Assert.assertFalse(controller.isValid("happy", GlobalConstants.NICKNAME_REGEX));
		Assert.assertFalse(controller.isValid("067-123-4567", GlobalConstants.NAME_REGEX));
	}

}
