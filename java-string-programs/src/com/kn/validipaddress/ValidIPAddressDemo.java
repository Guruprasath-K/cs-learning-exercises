package com.kn.validipaddress;

import java.util.Scanner;

public class ValidIPAddressDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of ValidIPAddress Class
		ValidIPAddress valid = new ValidIPAddress();

		// Call the method for Validating the IP Address
		boolean isValid = valid.isvalidIPAddress(inputString);
	}

}
