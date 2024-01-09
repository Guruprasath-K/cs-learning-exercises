package com.cs.stringlength;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {

		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int count = 0;
		char[] crr = str.toCharArray();

		for (int i = 0; i < crr.length; i++) {
			count++;
		}
		System.out.println("The length of the String = " + count);
		scan.close();
	}
}
