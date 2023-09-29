package com.packages.java;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nuumber: ");
		int num = scan.nextInt();

		int r;
		r = num % 10;

		if (r == 7) {
			System.out.println("Buzz Number");
		} else if (num % 7 == 0) {
			System.out.println("Buzz Number");
		} else {
			System.out.println("Not a Buzz Number");
		}
		scan.close();
	}

}
