package com.kn.collections.sorting1;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	// Alt+Shift+S + S
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	/*
	 * @Override public int compareTo(Object o) { if (this.id > (((Student)
	 * (o)).id)) { return 1; } else if (this.id < (((Student) (o)).id)) { return -1;
	 * } else { return 0; } }
	 */

	@Override
	public int compareTo(Student s) {
		if (this.id > s.id) {
			return 1;
		} else if (this.id < s.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
