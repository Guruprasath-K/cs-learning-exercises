package com.kn.objects;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Student objects to be created = ");
		Student[] srr = new Student[scan.nextInt()];

		for (int i = 0; i < srr.length; i++) {
			System.out.println("Enter the ID for student " + (i + 1) + " = ");
			int id = scan.nextInt();
			System.out.println("Enter the Name for student " + (i + 1) + " = ");
			String name = scan.next();
			System.out.println("Enter the marks for student " + (i + 1) + " = ");
			int marks = scan.nextInt();

			Student s = new Student(id, name, marks);
			srr[i] = s;
		}


		// Print Array Elements
		for (Student s : srr) {
			if (s.marks < 35) {
				int grace = 35 - s.marks;
				System.out.println("<-------Before Grace Marks------->");
				System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);

				System.out.println("<-------After Grace Marks------->");
				System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + (s.marks + grace));
			}
		}
		scan.close();
		/*
		 * for (Student s : srr) { if (s.name.equals("Amit")) {
		 * System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " +
		 * s.marks); } }
		 */


		/*
		 * Student s1 = new Student(01,"Amit",92); Student s2 = new Student(02,
		 * "Aakash", 85); Student s3 = new Student(03, "Ankit", 99);
		 * 
		 * Student[] srr = new Student[3];
		 * 
		 * srr[0] = s1; srr[1] = s2; srr[2] = s3;
		 * 
		 * System.out.println("ID = " + srr[0].id + ", Name = " + srr[0].name +
		 * ", Marks = " + srr[0].marks); System.out.println("ID = " + srr[1].id +
		 * ", Name = " + srr[1].name + ", Marks = " + srr[1].marks);
		 * System.out.println("ID = " + srr[2].id + ", Name = " + srr[2].name +
		 * ", Marks = " + srr[2].marks);
		 */
	}

}
