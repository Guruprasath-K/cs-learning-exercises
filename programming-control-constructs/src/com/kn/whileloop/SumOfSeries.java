package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		double result = calculateHarmonicSum(num);
		System.out.println(result);
		scan.close();
	}

	public static double calculateHarmonicSum(int num) {
		double sum = 0.0;
		double i = 1;
		while (i <= num) {
			sum = sum + 1 / i;
			i++;
		}
		return sum;
	}

}
