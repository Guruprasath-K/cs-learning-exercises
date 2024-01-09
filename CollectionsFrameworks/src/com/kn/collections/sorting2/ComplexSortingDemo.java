package com.kn.collections.sorting2;

import java.util.ArrayList;
import java.util.Collections;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1 = new Student(22, "ABC", 73.5);
		Student s2 = new Student(11, "PQR", 65.2);
		Student s3 = new Student(33, "XYZ", 89.4);

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		System.out.println("Before Sorting");
		System.out.println(studentList);
		SortStudentsById s = new SortStudentsById();
		Collections.sort(studentList, s);
		System.out.println("After Sorting");
		System.out.println(studentList);

	}

}
