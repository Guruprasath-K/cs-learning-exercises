package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		boolean vote = voteEligible(age);
		if (vote) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Not Eligible to Vote");
		}
		scan.close();
	}

	static boolean voteEligible(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

}
