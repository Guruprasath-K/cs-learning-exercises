package com.kn.objects1;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Student Objects to be created: ");
		int n = scan.nextInt();

		Student[] srr = StudentUtility.objectCreation(n);
		// Print Array Elements
		for (Student s : srr) {
			System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);
		}

		System.out.println("Enter the Student ID:");
		int id = scan.nextInt();
		int position = StudentUtility.searchStudentById(srr, id);
		if (position >= 0) {
			System.out.println("Student found at " + position);
		} else {
			System.out.println("Student not found");
		}

		int position2 = StudentUtility.searchStudentByName(srr, "Amit");
		if (position2 >= 0) {
			System.out.println("Student found at " + position2);
		} else {
			System.out.println("Student not found");
		}

		StudentUtility.applyGraceMarks(srr);

		Student[] srrByIdASC = StudentUtility.sortStudentByIdASC(srr);
		for (Student s : srrByIdASC) {
			System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);
		}

		Student[] srrByIdDESC = StudentUtility.sortStudentByIdDESC(srr);
		for (Student s : srrByIdDESC) {
			System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);
		}

		scan.close();
	}

}
