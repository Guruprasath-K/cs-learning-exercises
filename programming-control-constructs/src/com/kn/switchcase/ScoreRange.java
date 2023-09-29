package com.kn.switchcase;

import java.util.Scanner;

public class ScoreRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Grade: ");
		char ch = scan.next().charAt(0);

		switch (ch) {
		case 'A':
			System.out.println("100 - 90");
			break;
		case 'B':
			System.out.println("89 - 75");
			break;
		case 'C':
			System.out.println("74 - 60");
			break;
		case 'D':
			System.out.println("59 - 45");
			break;
		case 'F':
			System.out.println("44 - 0");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		scan.close();
	}

}
