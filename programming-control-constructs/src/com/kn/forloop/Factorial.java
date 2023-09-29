package com.kn.forloop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		long result = calculateFactorial(num);
		System.out.println("The Factorial of " + num + " is " + result);
		scan.close();
	}

	public static long calculateFactorial(int num) {
		long factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
