package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Amount of Purchase: $");
		int num = scan.nextInt();

		boolean amt = isApplicable(num);
		if (amt) {
			System.out.println("Discount Applicable");
		} else {
			System.out.println("Discount not Applicable");
		}
		scan.close();
	}

	static boolean isApplicable(int num) {
		if (num > 100) {
			return true;
		} else {
			return false;
		}
	}

}
