package com.kn.exception4;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		multiply(a, b);
		System.out.println("********End of main() method*********");
		scan.close();

	}

	private static void multiply(int a, int b) {
		System.out.println("---->Started multiply() method<----");
		int product = a * b;
		System.out.println("Product = " + product);
		divide(a, b);
		System.out.println("********End of multiply() method*********");

	}

	private static void divide(int a, int b) {
		System.out.println("---->Started divide() method<----");
		double quotient = a / b;
		System.out.println("Quotient = " + quotient);
		System.out.println("********End of divide() method*********");
	}

}
