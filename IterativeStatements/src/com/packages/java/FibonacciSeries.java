package com.packages.java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		int nextNumber = 0;
		int firstNumber = 0;
		int secondNumber = 1;

		System.out.print(firstNumber + " " + secondNumber + " ");
		for (int i = 3; i <= num; i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + " ");
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
		scan.close();
	}

}
