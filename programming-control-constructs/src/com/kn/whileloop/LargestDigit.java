package com.kn.whileloop;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		int result = largestDigit(num);
		System.out.println(result);
		scan.close();
	}

	public static int largestDigit(int num) {
		int r, sum = 0;
		int temp = 1;
		while (num > 0) {
			r = num % 10;
			sum = r;
			num = num / 10;

		if (sum > temp) {
			temp = sum;
		}
	}
		return temp;
	}

}
