package com.kodnest.java;

public class TrainerApp {

	public static void main(String[] args) {
		Trainer t1 = new Trainer(1234, "Arun", "Java");
		/*
		 * t1.id = 1234; t1.name = "Arun"; t1.subject = "Java";
		 */
		// t1.giveData(1234, "Arun", "Java");

		System.out.println("ID = " + t1.id + ", Name = " + t1.name + ", Subject = " + t1.subject);
		t1.teach();
		t1.takeAttendance();

		Trainer t2 = new Trainer(4321, "Sandesh", "Testing");
		/*
		 * t2.id = 4321; t2.name = "Sandesh"; t2.subject = "Testing";
		 */
		// t2.giveData(4321, "Sandesh", "Testing");

		System.out.println("ID = " + t2.id + ", Name = " + t2.name + ", Subject = " + t2.subject);
		t2.teach();
		t2.takeAttendance();

	}

}
