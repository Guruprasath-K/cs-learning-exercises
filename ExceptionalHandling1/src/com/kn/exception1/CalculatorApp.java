package com.kn.exception1;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of Numerator: ");
		int numerator = scan.nextInt();
		System.out.println("Enter the value of Denominator: ");
		int denominator = scan.nextInt();

		double division = 0;

		try {
			division = numerator / denominator;
		} catch (ArithmeticException ae) {
			System.out.println("Denominator must not be zero");
		}
		System.out.println("Division = " + division);
		System.out.println("Thank you for using Calculator Application");
		scan.close();
	}

}
