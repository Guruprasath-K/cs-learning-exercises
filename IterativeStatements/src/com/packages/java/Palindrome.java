package com.packages.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = scan.nextInt();

		int r, sum = 0;
		int temp = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("The Number is a Palindrome");
		} else {
			System.out.println("The Number is not a Palindrome");
		}
		scan.close();
	}

}
