package com.kn.constructor.chaining;

public class StudentDemo {

	public static void main(String[] args) {

		EngineeringStudent e1 = new EngineeringStudent("Ram", 20, "Mechanical", 03);
		System.out.println(
				"Name = " + e1.name + ", Age = " + e1.age + ", Branch = " + e1.branch + ", Semester = " + e1.sem);

		EngineeringStudent e2 = new EngineeringStudent("Sam", 19, "CS");
		System.out.println(
				"Name = " + e2.name + ", Age = " + e2.age + ", Branch = " + e2.branch + ", Semester = " + e2.sem);

		EngineeringStudent e3 = new EngineeringStudent("Ravi", 22, 05);
		System.out.println(
				"Name = " + e3.name + ", Age = " + e3.age + ", Branch = " + e3.branch + ", Semester = " + e3.sem);

		EngineeringStudent e4 = new EngineeringStudent("Arun", 25);
		System.out.println(
				"Name = " + e4.name + ", Age = " + e4.age + ", Branch = " + e4.branch + ", Semester = " + e4.sem);
	}

}
