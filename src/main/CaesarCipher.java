package main;

public class CaesarCipher {
	final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String encrypt(String message, int key) {
		
		int placeInAlpha = 0;
		String uppercaseMessage = message.toUpperCase();
		String encryptedMessage = "";
		
		while(key < 0) {
			key = key + 26;
		}
				
		for(int i = 0; i < uppercaseMessage.length(); i++) {
			placeInAlpha = alphabet.indexOf(uppercaseMessage.charAt(i));
			
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
	
	public String decrypt(String message, int key) {
		
		return encrypt(message, (26 - key));
	}

}
