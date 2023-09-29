package com.kn.whileloop;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int num = scan.nextInt();

		printPerfectNumbers(num);
		scan.close();
	}

	public static void printPerfectNumbers(int num) {
		for (int i = 1; i<=num ; i++) {
		int sum = 0;
		int j = 1;
		while (j <= i/2) {
			if (i % j == 0) {
				sum = sum + j;
			}
			j++;
		}
		
		if (sum == i) {
			System.out.println(sum);
		}
	}
}
}
