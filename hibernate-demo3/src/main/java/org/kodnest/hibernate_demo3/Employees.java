package org.kodnest.hibernate_demo3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {

	@Id
	int empID;
	String empName;
	int salary;

	public Employees() {
		super();
	}

	public Employees(int empID, String empName, int salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
