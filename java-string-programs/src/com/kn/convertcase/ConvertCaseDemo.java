package com.kn.convertcase;

import java.util.Scanner;

public class ConvertCaseDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of ConvertCase Class
		ConvertCase convert = new ConvertCase();

		// Call the method to convert the case
		String outputString = convert.convertCase(inputString);

		// Print the Resultant String
		System.out.println(outputString);

		// Release Resources
		scan.close();

	}

}
