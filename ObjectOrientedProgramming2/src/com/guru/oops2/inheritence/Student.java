package com.guru.oops2.inheritence;

public class Student extends Person {

	public Student(String name, String college) {
		super(name);
		this.college = college;
	}

	private String college;
	private int year;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
