package com.kn.elseifladder;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Coordinates :");
		int pointx = scan.nextInt();
		int pointy = scan.nextInt();

		String quadrant = quadrantPosition(pointx, pointy);
		System.out.println(quadrant);
		scan.close();
	}

	static String quadrantPosition(int pointx, int pointy) {
		if (pointx > 0 && pointy > 0) {
			return "First Quadrant";
		} else if (pointx < 0 && pointy > 0) {
			return "Second Quadrant";
		} else if (pointx < 0 && pointy < 0) {
			return "Third Quadrant";
		} else {
			return "Fourth Quadrant";
		}
	}

}
