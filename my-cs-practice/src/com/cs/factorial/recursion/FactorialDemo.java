package com.cs.factorial.recursion;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {

		// Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = scan.nextInt();

		// Create the object of the Factorial Class
		Factorial f1 = new Factorial();

		// Call the method for finding the factorial
		int output = f1.findFactorial(input);

		// Print the resultant data
		System.out.println("The factorial of " + input + " is " + output);

		// Release resources
		scan.close();
	}

}
