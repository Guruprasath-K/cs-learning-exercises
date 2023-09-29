package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = scan.nextInt();

		boolean eligibility = discountEligibility(age);
		if (eligibility) {
			System.out.println("Your are Eligible");
		} else {
			System.out.println("You are not Eligible");
		}
		scan.close();
	}

	static boolean discountEligibility(int age) {
		if (age > 60) {
			return true;
		} else {
			return false;
		}
	}
}
