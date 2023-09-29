package com.kn.simpleif;

import java.util.Scanner;

public class AdultDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int num = scan.nextInt();

		boolean age = isAdult(num);
		if (age) {
			System.out.println("You are an Adult");
		} else {
			System.out.println("You are not an Adult");
		}
		scan.close();
	}

	static boolean isAdult(int num) {
		if (num > 21) {
			return true;
		} else {
			return false;
		}
	}

}
