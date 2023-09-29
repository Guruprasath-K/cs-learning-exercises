package com.packages.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = scan.nextInt();

		int r;

		while (num > 0) {
			r = num % 10;
			System.out.print(r);
			num = num / 10;
		}
		scan.close();
	}

}
