package com.kn.switchcase;

import java.util.Scanner;

public class RomanNumeral {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number: ");
		char ch = scan.next().charAt(0);

		switch (ch) {
		case 'I':
			System.out.println(1);
			break;
		case 'V':
			System.out.println(5);
			break;
		case 'X':
			System.out.println(10);
			break;
		case 'L':
			System.out.println(50);
			break;
		case 'C':
			System.out.println(100);
			break;
		case 'D':
			System.out.println(500);
			break;
		case 'M':
			System.out.println(1000);
			break;
		default:
			System.out.println("Invalid Input");
		}
		scan.close();
	}

}
