package com.kn.forloop;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int result = findGCD(a, b);
		System.out.println("The GCD is: " + result);
		scan.close();
	}

	public static int findGCD(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

}
