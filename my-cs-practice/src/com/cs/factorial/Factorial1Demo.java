package com.cs.factorial;

import java.util.Scanner;

public class Factorial1Demo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		// Create object of the Factorial1 Class
		Factorial1 factorial = new Factorial1();

		// Call the method for finding the factorial
		int result = factorial.findFactorial(num);

		// Print the resultant data
		System.out.println("The factorial of " + num + " is " + result);

		// Release Resources
		scan.close();
	}

}
