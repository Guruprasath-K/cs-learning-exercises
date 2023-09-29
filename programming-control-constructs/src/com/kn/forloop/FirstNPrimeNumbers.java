package com.kn.forloop;

import java.util.Scanner;

public class FirstNPrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		printPrimes(num);
		scan.close();
	}

	public static void printPrimes(int num) {
		int count;
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
				if (count == 2) {
					System.out.print(i + " ");

			}
		}
	}

}
