package com.kn.whileloop;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long num = scan.nextLong();
		System.out.println("Enter the Digit to find the Frequency: ");
		int digit = scan.nextInt();

		int result = digitFrequency(num, digit);
		System.out.println(result);
		scan.close();
	}

	public static int digitFrequency(long num, int digit) {
		// TODO Auto-generated method stub
		return 0;
	}

}
