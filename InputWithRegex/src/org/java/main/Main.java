package org.java.main;

public class Main {
	
	public static void main(String... args) {
		Controller controller = new Controller(new Model(), new View());
		
		controller.run();
	}
	
}
