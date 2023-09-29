package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		int result = reverseNumber(num);
		System.out.println(result);
		scan.close();
	}

	public static int reverseNumber(int num) {
		int r, rev = 0;
		for (; num > 0;) {
			r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}
		return rev;
	}

}
