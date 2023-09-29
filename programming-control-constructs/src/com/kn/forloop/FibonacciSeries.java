package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		printFibonacci(num);
		scan.close();
	}

	public static void printFibonacci(int num) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber + " " + secondNumber + " ");
		for (int i = 3; i <= num; i++) {
			int nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + " ");
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}

}
