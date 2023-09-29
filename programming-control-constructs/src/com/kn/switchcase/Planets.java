package com.kn.switchcase;

import java.util.Scanner;

public class Planets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Color of the Signal: ");
		String planet = scan.next();

		switch (planet) {
		case "Mercury":
			System.out.println("Position : " + 1);
			break;
		case "Venus":
			System.out.println("Position : " + 2);
			break;
		case "Earth":
			System.out.println("Position : " + 3);
			break;
		case "Mars":
			System.out.println("Position : " + 4);
			break;
		case "Jupiter":
			System.out.println("Position : " + 5);
			break;
		case "Saturn":
			System.out.println("Position : " + 6);
			break;
		case "Uranus":
			System.out.println("Position : " + 7);
			break;
		case "Neptune":
			System.out.println("Position : " + 8);
			break;
		default:
			System.out.println("Invalid Input");
		}
		scan.close();
	}

}
