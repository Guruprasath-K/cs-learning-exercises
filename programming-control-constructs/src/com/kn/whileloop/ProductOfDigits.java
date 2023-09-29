package com.kn.whileloop;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		int result = productOfDigits(num);
		System.out.println(result);
		scan.close();
	}

	public static int productOfDigits(int num) {
		int r;
		int product = 1;
		while (num > 0) {
			r = num % 10;
			product = product * r;
			num = num / 10;
		}
		return product;
	}

}
