package com.kn.dowhileloop;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		int result = countDigits(num);
		System.out.println(result);
		scan.close();
	}

	public static int countDigits(int num) {
		int count = 0;
		do {
			num = num / 10;
			count++;

		} while (num > 0);
		return count;
	}
}
