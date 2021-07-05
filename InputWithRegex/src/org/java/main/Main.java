package org.java.main;

/**
 * This is the Main file for my program.
 * @author Illia Koshkin
 *
 */
public class Main {
	
	/**
	 * Method that launches program
	 * @param args that are in console
	 */
	public static void main(String... args) {
		Controller controller = new Controller(new Model(), new View());
		
		controller.run();
	}
	
}
