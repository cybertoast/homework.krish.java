package main;

/**
 * This class carries out doing a Vigenère Cipher on a given message and key, 
 * and is a subclass of the Cipher class. 
 * @author Krishan Arora
 * @version 1.9
 */
public class VigenèreCipher extends Cipher{
	
	public VigenèreCipher(String message, String key) {
		super(message, key);
	}
	
	/**
	 * This method generates a keyword for encryption and decryption that is equal
	 * to the length of the message to make the encryption and decryption easier.
	 * @param message the message to be compared in length to
	 * @param key the word that will repeat its letters to match the length of the
	 * message
	 * @return the new key that matches the message in length
	 */
	public String keywordForEncAndDec(String message, String key) {

		for(int i = 0; i < message.length(); i++) {
			
			if(message.length() == key.length()) {
				break;
			}
			else {
				key += (key.charAt(i));
			}
		}
		return key;
	}
	
	/**
	 * This method carries out the Vigenère encryption of a given string and
	 * keyword, and removes any non characters from the message in the encryption.
	 * @param message the message to be encrypted
	 * @param keyword the word that will help determine the amount that the message
	 * letters are changed by
	 * @return the encrypted message
	 */
	public String encryptVigenere(String message, String keyword) {
		
		String formattedMessage = message.toUpperCase();
		String formattedKey = keyword.toUpperCase();
		String encryptedMessage = "";
		
		for(int i = 0; i < formattedMessage.length() && i < keyword.length(); i++) {
			
			int positionInAlphabet = ((formattedMessage.charAt(i) + formattedKey.charAt(i)) % 26) + 'A';
			
			if(alphabet.indexOf(formattedMessage.charAt(i)) < 0) {
				encryptedMessage += ""; 
			}
			else {		
				encryptedMessage += (char) positionInAlphabet;
			}
		}	
		return encryptedMessage;
	}
	
	/**
	 * This method carries out the Vigenère decryption of a given string and
	 * keyword, and removes any non characters from the message in the decryption.
	 * @param message the message to be decrypted
	 * @param keyword the word that will help determine the amount that the message
	 * letters are changed by
	 * @return the decrypted message
	 */
	public String decryptVigenere(String message, String keyword) {
		
		String formattedMessage = message.toUpperCase();
		String formattedKey = keyword.toUpperCase();
		String decryptedMessage = "";
		
		for(int i = 0; i < formattedMessage.length() && i < keyword.length(); i++) {
			
			int positionInAlphabet = (formattedMessage.charAt(i) - formattedKey.charAt(i) + 26) % 26;
			
			if(alphabet.indexOf(formattedMessage.charAt(i)) < 0) {
				decryptedMessage += ""; 
			}
			else {
				positionInAlphabet += 'A';
				
				decryptedMessage += (char) positionInAlphabet;
			}
		}	
		return decryptedMessage;
	}
}