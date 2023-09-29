package com.kodnest.javaprogram;

import java.util.Scanner;

public class VibgyorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Character : ");
		char c = scan.next().charAt(0);
		if (c == 'v' || c == 'V') {
			System.out.println("Violet");
		} else if (c == 'i' || c == 'I') {
			System.out.println("Indigo");
		} else if (c == 'b' || c == 'B') {
			System.out.println("Blue");
		} else if (c == 'g' || c == 'G') {
			System.out.println("Green");
		} else if (c == 'y' || c == 'Y') {
			System.out.println("Yellow");
		} else if (c == 'o' || c == 'O') {
			System.out.println("Orange");
		} else if (c == 'r' || c == 'R') {
			System.out.println("Red");
		} else {
			System.out.println("Not a Vibgyor");
		}
		scan.close();
	}

}
