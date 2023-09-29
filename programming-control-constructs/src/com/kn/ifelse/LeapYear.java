package com.kn.ifelse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year : ");
		int year = scan.nextInt();

		boolean leap = isLeapYear(year);
		if (leap) {
			System.out.println("It is a Leap Year");
		} else {
			System.out.println("It is not a Leap Year");
		}
		scan.close();
	}

	static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}
