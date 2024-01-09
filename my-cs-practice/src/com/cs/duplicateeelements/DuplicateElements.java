package com.cs.duplicateeelements;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scan.nextInt();

		String[] srr = new String[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			srr[i] = scan.next();
		}

		System.out.println("Duplicate elements in the array: ");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (srr[i].equals(srr[j])) {
					System.out.println(srr[i]);
					break;
				}
			}
		}
		scan.close();

	}

}
