package com.kn.reservedspace;

import java.util.Scanner;

public class ReservedSpaceDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of ReservedSpace Class
		ReservedSpace reserve = new ReservedSpace();

		// Call the method to reverse the string with reserved spaces
		String output = reserve.reserveString(inputString);

		// Print the Resultant data
		System.out.println(output);

		// Release Resources
		scan.close();
	}

}
