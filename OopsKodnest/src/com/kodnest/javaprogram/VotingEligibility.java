package com.kodnest.javaprogram;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("Eligible for Voting");
		} else {
			System.out.println("Not Eligible for Voting");
		}
		scan.close();
	}

}
