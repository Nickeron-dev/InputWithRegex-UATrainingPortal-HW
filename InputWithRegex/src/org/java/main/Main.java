package org.java.main;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class Main {
	
	public static void main(String... args) {
		Controller controller = new Controller(new Model(), new View());
		
		controller.run();
	}
	
}
