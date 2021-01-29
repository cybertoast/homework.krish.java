package main;

/**
 * This class formats the messages and keys provided to it and returns them so 
 * that they can be used for encryption and decryption with the CaesarCipher 
 * and Vigenere cipher.
 * @author Krishan Arora
 * @version 1.5
 */
public class Parser {
	
	private int cKey;
	private String formattedMessage;

	public Parser() {
		cKey = 0;
		formattedMessage = "";
	}
	
	/**
	 * This method converts the String representation of the key for the CaesarCipher 
	 * into an integer so that it can be used in encryption or decryption.
	 * @param key the String to be converted into an integer
	 * @return the integer key for use with the CaesarCipher
	 */
	protected int getCaesarKey(String key){
		cKey = Integer.parseInt(key);

		return cKey;
	}

	/**
	 * This method takes in a String and formats it so that it is uppercase and 
	 * does not have any spaces in it, and returns the formatted version to be used
	 * with either Cipher class. 
	 * @param message the message to be formatted
	 * @return the formatted message to be encrypted or decrypted
	 */
	protected String getFormattedMessage(String message) {		
		formattedMessage = message.toUpperCase();
		formattedMessage = formattedMessage.replaceAll("\\s+", "");
		
		return formattedMessage;
	}	
}