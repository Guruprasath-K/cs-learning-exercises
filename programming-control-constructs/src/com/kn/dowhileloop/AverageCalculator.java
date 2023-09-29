package com.kn.dowhileloop;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		double result = calculateAverage(num);
		System.out.println(result);
		scan.close();
	}

	public static double calculateAverage(int num) {
		double i = 1;
		double sum = 0;
		double avg = 1;
		do {
			sum = sum + i;
			i++;
		} while (i <= num);

		avg = sum / num;
		return avg;
	}

}
