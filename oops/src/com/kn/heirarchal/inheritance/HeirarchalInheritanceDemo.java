package com.kn.heirarchal.inheritance;

public class HeirarchalInheritanceDemo {

	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.name = "Guru";
		d1.salary = 250000;
		System.out.println("Name = " + d1.name);
		System.out.println("Salary = " + d1.salary);

		TestEngineer t1 = new TestEngineer();
		t1.name = "Rokesh";
		t1.salary = 120000;
		System.out.println("Name = " + t1.name);
		System.out.println("Salary = " + t1.salary);

		Manager m1 = new Manager();
		m1.name = "Madhan";
		m1.salary = 200000;
		System.out.println("Name = " + m1.name);
		System.out.println("Salary = " + m1.salary);

		TeamLead l1 = new TeamLead();
		l1.name = "Lokesh";
		l1.salary = 180000;
		System.out.println("Name = " + l1.name);
		System.out.println("Salary = " + l1.salary);

	}

}
