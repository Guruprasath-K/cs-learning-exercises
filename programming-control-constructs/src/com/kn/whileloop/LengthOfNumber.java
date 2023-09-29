package com.kn.whileloop;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long num = scan.nextLong();

		int result = lengthOfNumber(num);
		System.out.println(result);
		scan.close();
	}

	public static int lengthOfNumber(long num) {
		int length = 0;
		
		while (num>0) {
			num = num / 10;
			length++;

		}
		return length;
	}

}
