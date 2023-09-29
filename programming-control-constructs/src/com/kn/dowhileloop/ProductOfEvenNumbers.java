package com.kn.dowhileloop;

import java.util.Scanner;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		long result = calculateProduct(num);
		System.out.println(result);
		scan.close();
	}

	private static long calculateProduct(int num) {

		long product = 1;
		int count = 0;
		int i = 1;
		do {
			if (i % 2 == 0) {
				product = product * i;
				count++;
			}
			i++;
		} while (count < num);

		return product;
	}

}
