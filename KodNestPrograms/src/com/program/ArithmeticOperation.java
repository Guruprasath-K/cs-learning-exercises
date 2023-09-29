package com.program;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b) {
			System.out.println("Sum = " + (a + b));
			System.out.println("Difference = " + (a - b));
			System.out.println("Product = " + (a * b));
			System.out.println("Quotient = " + (a / b));
			System.out.println("Remainder = " + (a % b));

		}
	}

}
