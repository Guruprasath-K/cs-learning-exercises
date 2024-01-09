package com.kn.exception2;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Bank App started successfully!");
			System.out.println("Enter the PIN");
			int pin = scan.nextInt();
			if (pin == 9999) {
				System.out.println("Continue with further transaction");
			} else {
				System.out.println("Invalid PIN");
			}
		} catch (Exception e) {
			System.out.println("PIN should be a numeric value..!");
		} finally {
			scan.close();
			System.out.println("Scanner closed successfully");
		}

		System.out.println("Bank App completed successfully!");
	}

}
