package com.kodnest.javaprograms;

import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Farhenheit Value : ");
		double f = scan.nextDouble();

		double temp = tempConvertor(f);
		System.out.println("The Celsius Value C = " + temp + " degree");
		scan.close();
	}

	public static double tempConvertor(double f) {
		return ((f - 32) * 5) / 9;

	}

}
