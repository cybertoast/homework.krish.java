package main;

/**
 * This class is a general cipher class that contains a message, a key, and 
 * a formatted alphabet that the subclasses for the Cipher class can inherit.
 * @author Krishan Arora
 * @version 1.1
 */
public class Cipher {
	
	protected String message;
	protected String key;
	protected final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public Cipher(String message, String key) {
		this.message = message;
		this.key = key;
	}

}
