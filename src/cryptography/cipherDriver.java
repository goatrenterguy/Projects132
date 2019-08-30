package cryptography;

import java.util.Scanner;

public class cipherDriver {
	/** Simple main method for testing the Caesar cipher */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher(3);
		System.out.println("Encryption code = " + new String(cipher.encoder));
		System.out.println("Decryption code = " + new String(cipher.decoder));
		String message =  "AaA";
		String coded = cipher.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = cipher.decrypt(coded);
		System.out.println("Message: " + answer);  
		
//Runs for 3 key encryption	
		int[] key = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 digit key one digit at a time: ");
		for (int i = 0; i < 3;i++) {
			key[i] = input.nextInt();
			input.nextLine();
		}
		System.out.println("Your key is: " + key[0] + "-" + key[1] + "-" + key[2]);
		System.out.println("Enter message to encrypt: ");
		message = input.nextLine();
		CaesarCipher three_Key = new CaesarCipher(key);
		String encrypted = three_Key.encrypt(message);
		System.out.println("Secret: " + encrypted);
		String decrypted = three_Key.decrypt(encrypted);
		System.out.println("Message: " + decrypted); 
	}
}
