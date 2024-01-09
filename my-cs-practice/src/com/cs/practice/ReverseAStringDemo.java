package com.cs.practice;

import java.util.Scanner;

public class ReverseAStringDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create the object of ReverseAString Class
		ReverseAString reverse = new ReverseAString();

		// Call the method for reversing a string
		String outputString = reverse.reverseString(inputString);

		// Print the resultant data
		System.out.println("Reversed String = " + outputString);

		// Release Resources
		scan.close();
	}

}
