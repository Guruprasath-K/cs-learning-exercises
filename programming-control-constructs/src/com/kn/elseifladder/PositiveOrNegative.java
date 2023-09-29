package com.kn.elseifladder;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scan.nextInt();

		String value = numberCheck(num);
		System.out.println(value);
		scan.close();
	}

	static String numberCheck(int num) {
		if (num > 0) {
			return "Positive";
		} else if (num < 0) {
			return "Negative";
		} else {
			return "Zero";
		}
	}

}
