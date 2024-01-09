package com.kn.exception8;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Bank Application started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw = ");
		double withdrawalAmount = scan.nextDouble();
		try {
			withdraw(withdrawalAmount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

	private static void withdraw(double withdrawalAmount) throws InsufficientFundsException{
		double accountBalance = 15000.00;
		System.out.println("Withdrawal process started.");
		
		if(withdrawalAmount <= accountBalance) {
			System.out.println(withdrawalAmount + " has been deducted from account");
		} else {
			System.out.println("Insufficient balance");
			throw new InsufficientFundsException("Insufficient Funds");
		}
	}


}
