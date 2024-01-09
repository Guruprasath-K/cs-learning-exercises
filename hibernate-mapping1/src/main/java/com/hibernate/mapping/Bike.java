package com.hibernate.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {

	@Id
	int regNum;
	String model;
	double price;
	@OneToOne
	Students students;

	public Bike() {
		super();
	}

	public Bike(int regNum, String model, double price, Students students) {
		super();
		this.regNum = regNum;
		this.model = model;
		this.price = price;
		this.students = students;
	}

	public int getRegNum() {
		return regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Bike [regNum=" + regNum + ", model=" + model + ", price=" + price + ", students=" + students + "]";
	}


}
