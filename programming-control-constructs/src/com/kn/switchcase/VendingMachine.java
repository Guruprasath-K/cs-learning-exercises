package com.kn.switchcase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Product Code: ");
		int num = scan.nextInt();

		switch (num) {
		case 001:
			System.out.println("Biscuits");
			break;
		case 002:
			System.out.println("Chips");
			break;
		case 003:
			System.out.println("Juice");
			break;
		case 004:
			System.out.println("Water Bottle");
			break;
		default:
			System.out.println("Invalid Code");
		}
		scan.close();
	}

}
