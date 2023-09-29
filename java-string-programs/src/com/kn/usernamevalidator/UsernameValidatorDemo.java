package com.kn.usernamevalidator;

import java.util.Scanner;

public class UsernameValidatorDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String inputString = scan.nextLine();

		// Create object of UsernameValidator class
		UsernameValidator user = new UsernameValidator();

		// Call the method for validating the password
		boolean flag = user.validateUsername(inputString);
	}

}
