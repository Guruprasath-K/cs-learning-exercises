package com.packages.java;

import java.util.Scanner;

public class LeapYearGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = scan.nextInt();
		
		if(year%4 == 0) {
			if (year%100 == 0) {
				if (year%400 == 0)
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
		scan.close();
	}
}

}
