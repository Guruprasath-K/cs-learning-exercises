package com.kn.ifelse;

import java.util.Scanner;

public class MultipleOfTen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		boolean multiple = ismultiple(num);
		if (multiple) {
			System.out.println("The Number " + num + " is a multiple of 10");
		} else {
			System.out.println("The Number " + num + " is not a multiple of 10");
		}
		scan.close();
	}

	static boolean ismultiple(int num) {
		if (num % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
