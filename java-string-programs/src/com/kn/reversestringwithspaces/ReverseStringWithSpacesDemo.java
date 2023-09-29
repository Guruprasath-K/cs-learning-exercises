package com.kn.reversestringwithspaces;

import java.util.Scanner;

public class ReverseStringWithSpacesDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of ReverseStringWithSpaces Class
		ReverseStringWithSpaces reverseString = new ReverseStringWithSpaces();

		// Call the method to reverse string with spaces
		String outputString = reverseString.reverseStringWithSpaces(inputString);

		// Print Resultant Data
		System.out.println(outputString);

		// Release Resources
		scan.close();
	}

}
