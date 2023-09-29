package com.kodnest.javaprograms;

import java.util.Scanner;

public class ArithOperationsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Operation that needs to be done");
		char c = scan.next().charAt(0);
		System.out.println("Enter two numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		switch(c) {
		case '-' :
			subtractNumbers(num1, num2);
			System.out.println("Subtraction = " + subtractNumbers(num1, num2));
			break;
		case '*':
			multiplyNumbers(num1, num2);
			System.out.println("Product = " + multiplyNumbers(num1, num2));
			break;
		case '/':
			divideNumbers(num1, num2);
			System.out.println("Divisor = " + divideNumbers(num1, num2));
			break;
		case '%':
			findRemainder(num1, num2);
			System.out.println("Remainder = " + findRemainder(num1, num2));
			break;
		default:
			System.out.println("Invalid Operation");
		}
		scan.close();
	}

	private static int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1 / num2;
	}

	public static int findRemainder(int num1, int num2) {
		return num1 % num2;
	}
}
