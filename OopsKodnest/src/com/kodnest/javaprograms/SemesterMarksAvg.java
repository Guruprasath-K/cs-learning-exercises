package com.kodnest.javaprograms;

import java.util.Scanner;

public class SemesterMarksAvg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Semester 1 Marks :");
		double sem1 = scan.nextDouble();
		System.out.println("Enter Semester 2 Marks :");
		double sem2 = scan.nextDouble();
		System.out.println("Enter Semester 3 Marks :");
		double sem3 = scan.nextDouble();
		System.out.println("Enter Semester 4 Marks :");
		double sem4 = scan.nextDouble();
		System.out.println("Enter Semester 5 Marks :");
		double sem5 = scan.nextDouble();
		System.out.println("Enter Semester 6 Marks :");
		double sem6 = scan.nextDouble();
		System.out.println("Enter Semester 7 Marks :");
		double sem7 = scan.nextDouble();
		System.out.println("Enter Semester 8 Marks :");
		double sem8 = scan.nextDouble();

		double marks = calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
		System.out.println("The Average marks for 8 semesters = " + marks);
		scan.close();

	}

	public static double calculateAverage(double sem1, double sem2, double sem3, double sem4, double sem5, double sem6,
			double sem7, double sem8) {
		return (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / 8;

	}

}
