package com.kodnest.javaprogram;

import java.util.Scanner;

public class ArithmeticOperationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an Operation (+, -, *, /)");
		System.out.println("+ ---> Addition");
		System.out.println("- ---> Subtraction");
		System.out.println("* ---> Multiplication");
		System.out.println("/ ---> Division");
		char c = scan.next().charAt(0);

		if (c == '+' || c == '-' || c == '*' || c == '/') {
			System.out.println("Enter two numbers for " + c);
		} else {
			System.out.println("Invalid Operation");
		}
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (c == '+') {
			System.out.println("Addition = " + (a + b));
		} else if (c == '-') {
			System.out.println("Difference = " + (a - b));
		} else if (c == '*') {
			System.out.println("Multiplication = " + (a * b));
		} else if (c == '/') {
			System.out.println("Division = " + (a / b));
		} else {
			System.out.println("Invalid Operation");
		}
		scan.close();
	}

}
