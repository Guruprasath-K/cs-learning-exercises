package com.packages.java;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("The Number " + num + " is a Prime Number");
		} else {
			System.out.println("The Number " + num + " is not a Prime Number");
		}
		scan.close();
	}
}
