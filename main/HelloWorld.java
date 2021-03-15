package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	
	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
	
	public static void main(String[] args) {
		LOGGER.log(Level.SEVERE, "Hello World");
	}
}