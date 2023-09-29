package com.kodnest.javaprograms;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Currency Value in INR = ");
		double inr = scan.nextDouble();

		System.out.println("The Value in Dollars = " + dollarValue(inr));
		System.out.println("The Value in Pounds = " + poundValue(inr));
		scan.close();
	}

	public static double poundValue(double inr) {
		return inr * 0.0095;
	}

	public static double dollarValue(double inr) {
		return inr * 0.012;

	}

}
