package com.kodnest.javaprograms;

import java.util.Scanner;

public class SimpleInterestFinder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principal P: ");
		int p = scan.nextInt();
		System.out.print("Enter the Rate of Interest R: ");
		int r = scan.nextInt();
		System.out.print("Enter the Time T: ");
		int t = scan.nextInt();

		int si = simpleInterest(p, t, r);
		System.out.println("The Simple Interest SI = " + si);
		scan.close();
	}

	public static int simpleInterest(int p, int t, int r) {
		return (p * t * r) / 100;

	}

}
