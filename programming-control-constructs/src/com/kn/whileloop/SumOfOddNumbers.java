package com.kn.whileloop;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		int result = sumOfOddNumbers(num);
		System.out.println(result);
		scan.close();
	}

	public static int sumOfOddNumbers(int num) {
		int sum = 0;
		int i = 1;
		while (i <= num) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		return sum;
	}
}
