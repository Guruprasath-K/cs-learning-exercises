package com.kn.romannumber;

import java.util.Scanner;

public class RomanNumberDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		int input = scan.nextInt();

		// Create object of RomanNumber class
		RomanNumber roman = new RomanNumber();

		// Call the method for converting the given number to the roman number
		String result = roman.romanNumber(input);

		// Print the resultant data
		System.out.println("The roman number for " + input + " is " + result);

		// Release resources
		scan.close();
	}

}
