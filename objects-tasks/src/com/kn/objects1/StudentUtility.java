package com.kn.objects1;

import java.util.Scanner;

public class StudentUtility {

	public static Student[] objectCreation(int n) {
		Scanner scan = new Scanner(System.in);
		Student[] arr = new Student[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the ID for student " + (i + 1) + " = ");
			int id = scan.nextInt();
			System.out.println("Enter the Name for student " + (i + 1) + " = ");
			String name = scan.next();
			System.out.println("Enter the marks for student " + (i + 1) + " = ");
			int marks = scan.nextInt();

			Student s = new Student(id, name, marks);
			arr[i] = s;
		}
		scan.close();
		return arr;
	}

	public static int searchStudentById(Student[] srr, int id) {
		int index = -1;
		int low = 0, high = srr.length - 1, mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (srr[mid].id == id) {
				index = mid - 1;
				return index;
			} else if (srr[mid].id > id) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return index;

	}

	public static int searchStudentByName(Student[] srr, String name) {
		int index = -1;
		int low = 0, high = srr.length - 1, mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (srr[mid].name.equalsIgnoreCase(name)) {
				index = mid - 1;
				return index;
			} else if (srr[mid].name.compareTo(name) > 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return index;
	}

	public static void applyGraceMarks(Student[] srr) {
		for (Student s : srr) {
			if (s.marks < 35) {
				int grace = 35 - s.marks;
				System.out.println("<-------Before Grace Marks------->");
				System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);

				System.out.println("<-------After Grace Marks------->");
				System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + (s.marks + grace));
			}
		}

	}

	public static Student[] sortStudentByIdASC(Student[] srr) {
		Student temp = null;
		boolean isSwapped = false;
		for (int i = 0; i < srr.length - 1; i++) {
			for (int j = 0; j < srr.length - 1 - i; j++) {
				if (srr[j].id > srr[j + 1].id) {
					temp = srr[j];
					srr[j] = srr[j + 1];
					srr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}
		}
		return srr;
	}

	public static Student[] sortStudentByIdDESC(Student[] srr) {
		Student temp = null;
		boolean isSwapped = false;
		for (int i = 0; i < srr.length - 1; i++) {
			for (int j = 0; j < srr.length - 1 - i; j++) {
				if (srr[j].id < srr[j + 1].id) {
					temp = srr[j];
					srr[j] = srr[j + 1];
					srr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}
		}
		return srr;
	}



}
