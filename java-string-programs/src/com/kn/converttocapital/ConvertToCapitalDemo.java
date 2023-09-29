package com.kn.converttocapital;

import java.util.Scanner;

public class ConvertToCapitalDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of ConvertToCapital Class
		ConvertToCapital capital = new ConvertToCapital();

		// Call the method for first letter upper case
		String outputString = capital.convertToCapital(inputString);

		// Print resultant String
		System.out.println(outputString);

		// Release Resources
		scan.close();

	}

}
