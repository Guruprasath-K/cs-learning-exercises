package com.kn.reversestring;

import java.util.Scanner;

public class StringReversalDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of StringReversal Class
		StringReversal reverse = new StringReversal();

		// Call the Method to reverse String
		String outputString = reverse.stringreverse(inputString);

		// Print the resultant data
		System.out.println("The Reverse String = " + outputString);

		// Release Resources
		scan.close();
	}

}
