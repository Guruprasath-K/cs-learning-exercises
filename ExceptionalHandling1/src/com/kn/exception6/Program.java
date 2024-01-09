package com.kn.exception6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Program started...!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the value 2: ");
		int num2 = scan.nextInt();
		addition(num1, num2);
		subtraction(num1, num2);
		try {
			multiplication(num1, num2);
		} catch (ArithmeticException ee) {
			System.out.println("Invalid input - Main method()");
		}
		try {
			division(num1, num2);
		} catch (ArithmeticException me) {
			System.out.println("Invalid input - Main method()");
		}
		System.out.println("Program ended successfully");
		scan.close();
	}

	private static void addition(int num1, int num2) {
		System.out.println("--->Started addition() method<---");
		int sum = num1 + num2;
		System.out.println("Addition = " + sum);
		System.out.println("--->End of addition() method<---");
	}

	private static void subtraction(int num1, int num2) {
		System.out.println("--->Started subtraction() method<---");
		int difference = 0;
		try {
			difference = num1 - num2;
		} catch (ArithmeticException ae) {
			System.out.println("Invalid Input");
		} finally {
			System.out.println("Subtraction = " + difference);
			System.out.println("--->End of subtraction() method<---");
		}
	}

	private static void multiplication(int num1, int num2) throws ArithmeticException {
		System.out.println("--->Started multiplication() method<---");
		int product = num1 * num2;
		System.out.println("Mutiplication = " + product);
		System.out.println("--->End of multiplication() method<---");
	}

	private static void division(int num1, int num2) throws ArithmeticException {
		System.out.println("--->Started division() method<---");
		int quotient = 0;
		try {
			quotient = num1 / num2;
		} catch (ArithmeticException eee) {
			System.out.println("Exception Handled");
			throw eee;
		}
		System.out.println("Division = " + quotient);
		System.out.println("--->End of division() method<---");
	}
}
