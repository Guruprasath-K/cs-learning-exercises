package com.kn.switchcase;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Color of the Signal: ");
		String signal = scan.next();

		switch (signal) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Input");
		}
		scan.close();
	}

}
