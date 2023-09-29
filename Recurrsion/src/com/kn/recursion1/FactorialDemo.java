package com.kn.recursion1;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = scan.nextInt();

		// Create object of Factorial class
		Factorial f1 = new Factorial();
		
		// Call the method to find the factorial
		int result = f1.findFactorial(input);

		// Print resultant data
		System.out.println("The Factorial of " + input + " is " + result);

		// Release Resources
		scan.close();

	}

}
