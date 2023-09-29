package com.kn.whileloop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long num = scan.nextLong();

		int result = binaryToDecimal(num);
		System.out.println(result);
		scan.close();
	}

	public static int binaryToDecimal(long num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
