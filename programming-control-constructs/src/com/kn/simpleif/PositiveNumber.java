package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();

		boolean flag = isPositive(num);
		if (flag) {
			System.out.println("The given number " + num + " is Positive");
		} else {
			System.out.println("The given number " + num + " is Negative");
		}
		scan.close();
	}

	static boolean isPositive(int num) {
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}

}
