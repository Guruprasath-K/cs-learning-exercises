package com.kn.collections.sorting1;

import java.util.ArrayList;
import java.util.Collections;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1 = new Student(33, "ABC", 73.5);
		Student s2 = new Student(22, "PQR", 65.2);
		Student s3 = new Student(11, "XYZ", 89.4);

		String str = new String("Dummy String");
		System.out.println(str.toString());
		System.out.println(s1); // Implicitly calls the toString();
		System.out.println(s2.toString());
		System.out.println(s3);

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		System.out.println("Before Sorting");
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println("After Sorting");
		System.out.println(studentList);
	}

}
