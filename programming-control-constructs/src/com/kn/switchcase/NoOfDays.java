package com.kn.switchcase;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month Number: ");
		int num = scan.nextInt();

		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of Days : " + 31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of Days : " + 30);
			break;
		case 2:
			System.out.println("Number of Days :" + 28);
			break;
		default:
			System.out.println("Invalid Input");
		}
		scan.close();
	}

}
