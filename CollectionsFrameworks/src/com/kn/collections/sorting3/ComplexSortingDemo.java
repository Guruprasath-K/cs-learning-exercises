package com.kn.collections.sorting3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1 = new Student(22, "ABC", 73.5);
		Student s2 = new Student(11, "XYZ", 65.2);
		Student s3 = new Student(33, "PQR", 89.4);

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		System.out.println("Before Sorting");
		System.out.println(studentList);

		// Sorting based on name
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});

		System.out.println("After Sorting based on Name:");
		System.out.println(studentList);

		// Sorting based on ID
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getId() > s2.getId()) {
					return 1;
				} else if (s1.getId() < s2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		System.out.println("After Sorting based on ID:");
		System.out.println(studentList);

		// Sorting based on Percentage
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getPercentage() > s2.getPercentage()) {
					return 1;
				} else if (s1.getPercentage() < s2.getPercentage()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		System.out.println("After Sorting based on Percentage:");
		System.out.println(studentList);
	}


}
