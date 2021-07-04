package org.java.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.java.main.Controller;
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
		ByteArrayInputStream firstByteStream = new ByteArrayInputStream("50".getBytes());
		System.setIn(firstByteStream);
		
		Assert.assertEquals("50", controller.getInputValue());
		
		// second test
		ByteArrayInputStream secondByteStream = new ByteArrayInputStream("Name".getBytes());
		System.setIn(secondByteStream);
		
		Assert.assertEquals("Name", controller.getInputValue());
		
		System.setIn(stream);
		
	}
	
	@Test
	public void isValid() {
		
	}

}
