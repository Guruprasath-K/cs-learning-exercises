package com.kn.dowhileloop;

import java.util.Scanner;

public class SingleDigitSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		int result = singleDigitSum(num);
		System.out.println(result);
		scan.close();
	}

	public static int singleDigitSum(int num) {
		int r, sum = 0;
		int value, singleSum = 0;
		do {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		} while (num > 0);

		if (sum >= 10) {
			do {
				value = sum % 10;
				singleSum = singleSum + value;
				sum = sum / 10;
			} while (sum >= 10);
			singleSum = singleSum + sum;
			return singleSum;
		} else {
			return sum;
		}
	}

}
