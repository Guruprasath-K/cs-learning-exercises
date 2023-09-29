package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		int result = sumOfDigits(num);
		System.out.println("The Sum of the given Digits is " + result);
		scan.close();
	}

	public static int sumOfDigits(int num) {
		int r, sum = 0;
		for (; num > 0;) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		return sum;
	}

}
