package com.kodnest.javaprograms;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your First Name : ");
		String firstName = scan.next();
		System.out.println("Enter your Middle Name");
		String middleName = scan.next();
		System.out.println("Enter Your Second Name : ");
		String lastName = scan.next();

		String fullName = joinStrings(firstName, middleName, lastName);
		System.out.println("Your Name = " + fullName);
		scan.close();
	}

	private static String joinStrings(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;
	}

}
