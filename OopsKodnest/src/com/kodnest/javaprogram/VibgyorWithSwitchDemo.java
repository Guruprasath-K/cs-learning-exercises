package com.kodnest.javaprogram;

import java.util.Scanner;

public class VibgyorWithSwitchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Character : ");
		char c = scan.next().charAt(0);
		switch (c) {
		case 'v':
		case 'V':
			System.out.println("Violet Colour");
			break;
		case 'i':
		case 'I':
			System.out.println("Indigo Colour");
			break;
		case 'b':
		case 'B':
			System.out.println("Blue Colour");
			break;
		case 'g':
		case 'G':
			System.out.println("Green Colour");
			break;
		case 'y':
		case 'Y':
			System.out.println("Yellow Colour");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange Colour");
			break;
		case 'r':
		case 'R':
			System.out.println("Red Colour");
			break;
		default:
			System.out.println("Invalid Operation");
		}
		System.out.println("---> End <---");
	}

}
