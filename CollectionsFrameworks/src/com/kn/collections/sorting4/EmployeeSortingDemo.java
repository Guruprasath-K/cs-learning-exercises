package com.kn.collections.sorting4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortingDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ram", 40000.00);
		Employee e2 = new Employee(108, "Arun", 90000.00);
		Employee e3 = new Employee(117, "Shiva", 12000.00);

		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		System.out.println("----->Before Sorting<-----");
		System.out.println(employeeList);
		System.out.println();

		// Sorting based on empId - Ascending
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getEmpId() > e2.getEmpId()) {
					return 1;
				} else if (e1.getEmpId() < e2.getEmpId()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		System.out.println("-->Sorted based on empId - Ascending<--");
		System.out.println(employeeList);

		// Sorting based on empName - Ascending
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});
		System.out.println("-->Sorted based on empName - Ascending<--");
		System.out.println(employeeList);

		// Sorting based on salary - Ascending
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getSalary() > e2.getSalary()) {
					return 1;
				} else if (e1.getSalary() < e2.getSalary()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println("-->Sorted based on salary - Ascending<--");
		System.out.println(employeeList);
		System.out.println();

		// Sorting based on empId - Descending
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getEmpId() < e2.getEmpId()) {
					return 1;
				} else if (e1.getEmpId() > e2.getEmpId()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		System.out.println("-->Sorted based on empId - Descending<--");
		System.out.println(employeeList);

		// Sorting based on empName - Descending
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e2.getEmpName().compareTo(e1.getEmpName());
			}
		});
		System.out.println("-->Sorted based on empName - Descending<--");
		System.out.println(employeeList);

		// Sorting based on salary - Descending
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getSalary() < e2.getSalary()) {
					return 1;
				} else if (e1.getSalary() > e2.getSalary()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println("-->Sorted based on salary - Descending<--");
		System.out.println(employeeList);
	}

}
