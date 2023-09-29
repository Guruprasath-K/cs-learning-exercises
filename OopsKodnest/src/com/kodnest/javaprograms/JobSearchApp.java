package com.kodnest.javaprograms;

import java.util.Scanner;

public class JobSearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your CGPA = ");
		int cgpa = scan.nextInt();

		if (cgpa >= 90) {
			System.out.println("Artificial Intelligence");
		} else if (cgpa >= 75 && cgpa < 90) {
			System.out.println("IoT");
		} else if (cgpa >= 60 && cgpa < 75) {
			System.out.println("Neural Networks Programming");
		} else if (cgpa >= 45 && cgpa < 60) {
			System.out.println("Quantum Computing");
		} else {
			System.out.println("IT Job");
		}
		scan.close();
	}

}
