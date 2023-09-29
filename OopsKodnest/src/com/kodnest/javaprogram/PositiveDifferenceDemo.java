package com.kodnest.javaprogram;

import java.util.Scanner;

public class PositiveDifferenceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers = ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b) {
			System.out.println("Difference = " + (a - b));
		} else {
			System.out.println("Difference = " + (b - a));
		}
		scan.close();
	}

}
