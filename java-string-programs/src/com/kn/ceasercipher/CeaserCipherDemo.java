package com.kn.ceasercipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String inputString = scan.nextLine();

		System.out.println("Enter the Encryption value: ");
		int encryption = scan.nextInt();

		// Create object of CeaserCipher Class
		CeaserCipher ceasercipher = new CeaserCipher();

		// Call the method for password encryption
		String result = ceasercipher.convertCeaserCipher(inputString, encryption);

		// Print Resultant Data
		System.out.println(result);

		// Release Resources
		scan.close();

	}

}
