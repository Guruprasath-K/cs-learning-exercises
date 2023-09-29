package com.packages.java;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = scan.nextInt();

		int r, count = 0;

		while (num > 0) {
			r = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("Count = " + count);
		scan.close();
	}

}
