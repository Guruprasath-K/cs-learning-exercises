package com.guru.oops2.inheritence;

public class StudentRunner {

	public static void main(String[] args) {

		// Student student = new Student();
		// student.setName("Ranga");
		// student.setEmail("in28minutes@gmail.com");

		/*
		 * Person person = new Person(); person.setName("Guru");
		 * person.setEmail("guruprasath.kann@gmail.com");
		 * person.setPhoneNumber("9655655000"); String value = person.toString();
		 * System.out.println(value); System.out.println(person);
		 */

		Employee employee = new Employee("Guru", "Analyst");
		// employee.setName("Guru");
		employee.setEmail("guruprasath.kann@gmail.com");
		employee.setPhoneNumber("9655655000");
		employee.setEmployeeGrade('A');
		employee.setTitle("Analyst");

		System.out.println(employee);

	}

}
