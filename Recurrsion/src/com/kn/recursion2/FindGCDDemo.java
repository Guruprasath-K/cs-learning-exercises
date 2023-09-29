package com.kn.recursion2;

import java.util.Scanner;

public class FindGCDDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int input1 = scan.nextInt();

		System.out.println("Enter the second number: ");
		int input2 = scan.nextInt();

		// Create object of FindGCD class
		FindGCD f1 = new FindGCD();

		// Call the method for finding the GCD
		int result = f1.findGCD(input1, input2);

		// Print the resultant data
		System.out.println("The GCD of " + input1 + " and " + input2 + " is " + result);

		// Release Resources
		scan.close();
	}

}
