package com.guru.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Guru"));
		students.add(new Student(100, "AAA"));
		students.add(new Student(50, "BBB"));

		// List<Student> students = List.of(new Student(1, "Guru"), new Student(100,
		// "AAA"), new Student(50, "BBB"));

		// ArrayList<Student> studentsAl = new ArrayList<>(students);

		System.out.println(students);

		Collections.sort(students);
		System.out.println("Desc" + students);
		
		Collections.sort(students, new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + students);
	}
}
