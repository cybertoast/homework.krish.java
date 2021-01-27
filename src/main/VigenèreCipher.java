package main;

public class VigenèreCipher {
	final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String keywordForEncAndDec(String message, String key) {
				
		for(int i = 0; i < message.length(); i++) {
			
			if(message.length() == key.length()) {
				break;
			}

			key += key.charAt(i);
		}
		return key.toUpperCase();
	}
	
	public String encryptVigenere(String message, String keyword) {
		
		String formattedMessage = message.toUpperCase();
		String formattedKey = keyword.toUpperCase();
		String encryptedMessage = "";
		
		for(int i = 0; i < formattedMessage.length(); i++) {
			
			int positionInAlphabet = (formattedMessage.charAt(i) + formattedKey.charAt(i)) % 26;
			
			if(alphabet.indexOf(formattedMessage.charAt(i)) < 0) {
				encryptedMessage += ""; 
			}
			else {
				positionInAlphabet += 'A';
				
				encryptedMessage += (char) positionInAlphabet;
			}
		}
		
		return encryptedMessage;
	}
	
	public String decryptVigenere(String message, String keyword) {
		
		String formattedMessage = message.toUpperCase();
		String formattedKey = keyword.toUpperCase();
		String decryptedMessage = "";
		
		for(int i = 0; i < formattedMessage.length(); i++) {
			
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
