package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();

		boolean value = numberValue(num);
		if (value) {
			System.out.println("The Number " + num + " is Positive");
		} else {
			System.out.println("The Number " + num + " is Negative");
		}
		scan.close();
	}

	static boolean numberValue(int num) {
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}
}
