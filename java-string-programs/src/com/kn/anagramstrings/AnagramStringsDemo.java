package com.kn.anagramstrings;

import java.util.Scanner;

public class AnagramStringsDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String inputString1 = scan.nextLine();

		System.out.println("Enter the second String: ");
		String inputString2 = scan.nextLine();

		// Create object of AnagramStrings Class
		AnagramStrings anagram = new AnagramStrings();

		// Call the method for finding whether the given strings are Anagram
		boolean value = anagram.isAnagramString(inputString1, inputString2);

		// Print the resultant
		if (value) {
			System.out.println("The given strings are Anagram");
		} else {
			System.out.println("The given strings are not Anagram");
		}

		// Release Resources
		scan.close();
	}

}
