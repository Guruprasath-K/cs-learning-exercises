package com.kn.dowhileloop;

import java.util.Scanner;

public class DivisibleSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Start: ");
		int start = scan.nextInt();
		System.out.println("Enter the End: ");
		int end = scan.nextInt();
		System.out.println("Enter the Divisor: ");
		int divisor = scan.nextInt();

		int result = calculateDivisibleSum(start, end, divisor);
		System.out.println(result);
		scan.close();
	}

	public static int calculateDivisibleSum(int start, int end, int divisor) {

		return 0;
	}

}
