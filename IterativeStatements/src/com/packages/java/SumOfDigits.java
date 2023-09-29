package com.packages.java;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Digits = ");
		int num = scan.nextInt();

		int r, sum = 0;

		while (num > 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println("Sum of Digits = " + sum);
		scan.close();
	}

}
