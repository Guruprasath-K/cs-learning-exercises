package com.kodnest.java;

public class Trainer {
	int id;
	String name;
	String subject;

	void teach() {
		System.out.println("Started Teaching");
	}

	void takeAttendance() {
		System.out.println("Attendance Taken");
	}

	// void giveData(int a, String b, String c) {
	// id = a;
	// name = b;
	// subject = c;
	// }
	Trainer(int a) {
		id = a;
	}

	Trainer(int a, String b) {
		id = a;
		name = b;
	}

	Trainer(int a, String b, String c) {
		id = a;
		name = b;
		subject = c;
	}
}
