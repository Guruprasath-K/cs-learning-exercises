package com.kn.interface1;

public class StudentDemo {

	public static void main(String[] args) {
		CSEStudent cs1 = new CSEStudent();
		MechStudent me1 = new MechStudent();
		StudentDemo.callMethod(cs1);
		callMethod(me1);
	}

	public static void callMethod(Student s) {
		s.study();
		s.doProject();
	}
}
