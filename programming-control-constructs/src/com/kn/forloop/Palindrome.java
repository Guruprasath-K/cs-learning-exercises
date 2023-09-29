package com.kn.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		boolean value = isPalindrome(num);
		System.out.println(value);
		scan.close();

	}

	public static boolean isPalindrome(int num) {
		int r, sum = 0;
		int temp = num;
		for (; num > 0;) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

}
