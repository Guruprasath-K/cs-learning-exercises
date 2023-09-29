package com.kn.dowhileloop;

import java.util.Scanner;

public class OddProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		int result = calculateOddProduct(num);
		System.out.println(result);
		scan.close();
	}

	public static int calculateOddProduct(int num) {
		int product = 1;
		int count = 0;
		int i = 1;
		do {
			if (i % 2 == 1) {
				product = product * i;
				count++;
			}
			i++;
		} while (count < num);
		return product;
	}

}
