package com.kodnest.javaprograms;

import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Speed :");
		double speed = scan.nextDouble();
		System.out.println("Enter the Time :");
		double time = scan.nextDouble();

		double distance = calculateDistance(speed, time);
		System.out.println("Distance = " + distance);
		scan.close();
	}

	public static double calculateDistance(double speed, double time) {
		return speed * time;

	}

}
