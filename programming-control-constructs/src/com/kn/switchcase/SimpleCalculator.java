package com.kn.switchcase;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("Enter the Operation That need to be done:");
		System.out.println(" + ----> Addition ");
		System.out.println(" - ----> Subtraction ");
		System.out.println(" * ----> Multiplication ");
		System.out.println(" / ----> Division ");
		char ch = scan.next().charAt(0);

		switch (ch) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Invalid Input");
		}
		scan.close();
	}


}
