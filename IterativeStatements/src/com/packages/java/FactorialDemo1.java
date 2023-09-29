package com.packages.java;

import java.util.Scanner;

public class FactorialDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		int factorial = 1;

		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial Value of " + num + " is " + factorial);
		scan.close();
	}

}
