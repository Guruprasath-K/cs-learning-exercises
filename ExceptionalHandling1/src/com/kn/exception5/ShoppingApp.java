package com.kn.exception5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping Application");
		shop();
		System.out.println("********main() method ended********");
	}

	public static void shop() {
		System.out.println("---> shop() method started");
		try {
			pay();
		} catch (InputMismatchException e) {
			System.out.println("Shopping has failed due to inappropriate input");
		}
		System.out.println("*******shop() method ended********");
	}

	public static void pay() throws InputMismatchException {
		// throws ===> Show warning to the method caller
		System.out.println("---> pay() method started");
		Scanner scan = null;
		System.out.println("Enter the amount to be paid = ");
		try {
			scan = new Scanner(System.in);
			double amount = scan.nextDouble();
			System.out.println("Amount Paid = " + amount);
		} catch (InputMismatchException ime) {
			System.out.println("Exception Handled");
			throw ime; // re-throwing exception
		}
		scan.close();
		System.out.println("******pay() method ended*******");
	}

}
