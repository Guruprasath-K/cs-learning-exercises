package com.kn.constructor.chaining;

public class EngineeringStudent extends Student {
	String branch;
	int sem;

	public EngineeringStudent(String name, int age, String branch, int sem) {
		super(name, age);
		this.branch = branch;
		this.sem = sem;
		System.out.println("--->4 arg Constructor");
	}

	public EngineeringStudent(String name, int age, int sem) {
		super(name, age);
		this.sem = sem;
		System.out.println("--->3 arg Constructor without branch");
	}

	public EngineeringStudent(String name, int age, String branch) {
		super(name, age);
		this.branch = branch;
		System.out.println("--->3 arg Constructor without sem");
	}

	public EngineeringStudent(String name, int age) {
		super(name, age);
		System.out.println("--->2 arg Constructor");
	}

}
