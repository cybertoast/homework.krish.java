package main;
/**
 * This class carries out doing a Substitution Cipher/ Caesar Cipher on a given
 * message and key, and is a subclass of the Cipher class. 
 * @author Krishan Arora
 * @version 1.5
 */
public class CaesarCipher extends Cipher{
	
	public CaesarCipher(String message, String key) {
		super(message, key);
	}
	
	/**
	 * This method encrypts a message given a message and key number using the 
	 * alphabet String, and returns the encrypted String (message is all-caps 
	 * and without any punctuation).
	 * 
	 * @param message the message to encrypt
	 * @param key the number to shift the letters in the message by
	 * @return the encrypted message
	 */
	public String encrypt(String message, int key) {
		
		int placeInAlpha = 0;
		String encryptedMessage = "";
		
		while(key < 0) {
			key = key + 26;
		}
				
		for(int i = 0; i < message.length(); i++) {
			placeInAlpha = alphabet.indexOf(message.charAt(i));
			
			if(placeInAlpha < 0) {
				encryptedMessage = encryptedMessage + "";
			}
			else {
				placeInAlpha = (placeInAlpha + key) % 26;
				
				encryptedMessage = encryptedMessage + Character.toUpperCase(alphabet.charAt(placeInAlpha));
			}
		}
		return encryptedMessage;
	}
	
	/**
	 * This method decrypts a message (given a message and key) with the help of the 
	 * encrypt method (making it work in reverse by subtracting the key from 26 (number 
	 * of letters in alphabet and alphabet String)).
	 * 
	 * @param message the message to decrypt
	 * @param key the key number to help with decryption
	 * @return the decrypted message 
	 */
	public String decrypt(String message, int key) {
		
		return encrypt(message, (26 - key));
	}

}
