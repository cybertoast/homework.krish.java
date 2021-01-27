package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Parser {

	Scanner decCaesar = new Scanner(new File("caesar_ciphertext.txt"));
	Scanner decCaesarKeys = new Scanner(new File("caesar_ciphertext.txt"));
	Scanner encCaesar = new Scanner(new File("caesar_plaintext.txt"));
	Scanner encCaesarKeys = new Scanner(new File("caesar_plaintext.txt"));
	Scanner decVigen = new Scanner(new File("vigenere_ciphertext.txt"));
	Scanner decVigenKeys = new Scanner(new File("vigenere_ciphertext.txt"));
	Scanner encVigen = new Scanner(new File("vigenere_plaintext.txt"));
	Scanner encVigenKeys = new Scanner(new File("vigenere_plaintext.txt"));
	
	private int toDecryptCKey;
	private ArrayList<Integer> toDecryptCaesarKeys = new ArrayList<>();
	
	private int toEncryptCKey;
	private ArrayList<Integer> toEncryptCaesarKeys = new ArrayList<>();

	private String toDecryptC;
	private ArrayList<String> toDecryptCaesarMessages = new ArrayList<>();

	private String toEncryptC;
	private ArrayList<String> toEncryptCaesarMessages = new ArrayList<>();

	private String toEncryptVKey;
	private ArrayList<String> toEncryptVigenKey = new ArrayList<>();

	private String toDecryptVKey;
	private ArrayList<String> toDecryptVigenKey = new ArrayList<>();
	
	private String toDecryptV;
	private ArrayList<String> toDecryptVigenMessages = new ArrayList<>();

	private String toEncryptV;
	private ArrayList<String> toEncryptVigenMessages = new ArrayList<>();

	

	public Parser() throws FileNotFoundException {
		toDecryptCKey = 0;
		toDecryptC = "";
		toEncryptCKey = 0;
		toEncryptC = "";
		
		toEncryptVKey = "";
		toEncryptV = "";
		toDecryptVKey = "";
		toDecryptV = "";		
	}
	
	protected ArrayList<Integer> getDecCaesarKey() {
		while(decCaesarKeys.hasNextLine()) {
			toDecryptCKey = decCaesarKeys.nextInt();
			toDecryptCaesarKeys.add(toDecryptCKey);
			decCaesarKeys.nextLine();
		}
		
		return toDecryptCaesarKeys;
	}
	
	protected ArrayList<String> getDecCaesarMessage() {
		while(decCaesar.hasNextLine()) {
			int key = decCaesar.nextInt();
			toDecryptC = decCaesar.next();			
			toDecryptCaesarMessages.add(toDecryptC);
		}
		return toDecryptCaesarMessages;
	}
	
	protected ArrayList<Integer> getEncCaesarKey() {
		while(encCaesarKeys.hasNextLine()) {
			toEncryptCKey = encCaesarKeys.nextInt();
			toEncryptCaesarKeys.add(toEncryptCKey);
			encCaesarKeys.nextLine();
		}
		
		return toEncryptCaesarKeys;
	}
	
	protected ArrayList<String> getEncCaesarMessage() {
		while(encCaesar.hasNextLine()) {
			int key = encCaesar.nextInt();
			toEncryptC = encCaesar.nextLine();			
			toEncryptCaesarMessages.add(toEncryptC);
		}
		return toEncryptCaesarMessages;
	}
	
	protected ArrayList<String> getDecVigenereKeys() {
		while(decVigenKeys.hasNextLine()) {			
			toDecryptVKey = decVigenKeys.next();			
			toDecryptVigenKey.add(toDecryptVKey);
		}
		return toDecryptVigenKey;
	}
	
	protected ArrayList<String> getDecVigenereMessage() {
		while(decVigen.hasNextLine()) {		
			String key = decVigen.next();
			toDecryptV = decVigen.nextLine();			
			toDecryptVigenMessages.add(toDecryptV);
		}
		return toDecryptVigenMessages;
	}
	
	
}
