package com.kn.forloop;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		numberTable(num);
		scan.close();
	}

	private static void numberTable(int num) {
		int multiple = 1;
		for (int i = 1; i <= 10; i++) {
			multiple = i * num;
			System.out.print(multiple + " ");
		}
	}

}
