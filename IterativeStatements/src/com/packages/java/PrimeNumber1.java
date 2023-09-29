package com.packages.java;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		boolean isPrime = true;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			if (isPrime) {
				System.out.println("The number " + num + " is a Prime Number");
			} else {
				System.out.println("The number " + num + " is not a Prime Number");
			}
		}
		scan.close();
	}

}
