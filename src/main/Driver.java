package main;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		Parser p = new Parser();
		CaesarCipher c = new CaesarCipher();
		VigenèreCipher v = new VigenèreCipher();
		
//		for(int i = 0; i < p.getDecCaesarKey().size(); i++) {
//			System.out.println(c.decrypt(p.getDecCaesarMessage().get(i), p.getDecCaesarKey().get(i)) + "\n");
//			
//			System.out.println(c.encrypt(p.getEncCaesarMessage().get(i), p.getEncCaesarKey().get(i)));
//		}
//		System.out.println(p.getDecVigenereMessage());

		
		
		
	}
}
