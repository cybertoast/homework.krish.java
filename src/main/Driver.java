package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class reads in messages and keys from four .txt files and performs either 
 * a VigenèreCipher or CaesarCipher encryption or decryption on the messages and 
 * reports back the changed message. The class interacts with the VigenèreCipher, 
 * CaesarCipher, and Parser classes.
 * @author Krishan Arora
 * @version 1.4
 *
 */
public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		Parser p = new Parser();
		String cKey = "";
		String cMessage = "";
		String vKey;
		String vMessage;
		
		Scanner decCaesar = new Scanner(new File("caesar_ciphertext.txt"));
		
		System.out.println("Decrypt Caesar: ");
		while(decCaesar.hasNextLine()) {
			
			cKey = decCaesar.next();
			cMessage = decCaesar.nextLine();	
			CaesarCipher c = new CaesarCipher(cMessage, cKey);
			
			System.out.println(c.decrypt(p.getFormattedMessage(cMessage), p.getCaesarKey(cKey)));
		}
		System.out.println();
		
		Scanner encCaesar = new Scanner(new File("caesar_plaintext.txt"));
		
		System.out.println("Encrypt Caesar: ");		
		while(encCaesar.hasNextLine()) {	
			
			cKey = encCaesar.next();
			cMessage = encCaesar.nextLine();	
			CaesarCipher c = new CaesarCipher(cMessage, cKey);
			
			System.out.println(c.encrypt(p.getFormattedMessage(cMessage), p.getCaesarKey(cKey)));
		}
		System.out.println();
		
		Scanner decVigen = new Scanner(new File("vigenere_ciphertext.txt"));
		
		System.out.println("Decrypt Vigenère: ");
		while(decVigen.hasNextLine()) {
			
			vKey = decVigen.next();
			vMessage = decVigen.nextLine();	
			VigenèreCipher v = new VigenèreCipher(vMessage, vKey);
			
			System.out.println(v.decryptVigenere(p.getFormattedMessage(vMessage), v.keywordForEncAndDec(p.getFormattedMessage(vMessage), vKey)));
		}
		System.out.println();
		
		Scanner encVigen = new Scanner(new File("vigenere_plaintext.txt"));
		
		System.out.println("Encrypt Vigenère: ");
		while(encVigen.hasNextLine()) {
			
			vKey = encVigen.next();
			vMessage = encVigen.nextLine();	
			VigenèreCipher v = new VigenèreCipher(vMessage, vKey);
			
			System.out.println(v.encryptVigenere(p.getFormattedMessage(vMessage), v.keywordForEncAndDec(p.getFormattedMessage(vMessage), vKey)));
		}				
	}
}