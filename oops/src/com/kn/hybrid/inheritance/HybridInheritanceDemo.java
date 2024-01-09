package com.kn.hybrid.inheritance;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		EngineeringStudent e1 = new EngineeringStudent();
		e1.name = "Guru";
		System.out.println("EngineeringStudent:");
		System.out.println("Name = " + e1.name);

		MedicalStudent m1 = new MedicalStudent();
		m1.name = "Rokesh";
		System.out.println("MedicalStudent:");
		System.out.println("Name = " + m1.name);

		JavaTrainer j1 = new JavaTrainer();
		j1.name = "Madhan";
		System.out.println("JavaTrainer:");
		System.out.println("Name = " + j1.name);

		SQLTrainer s1 = new SQLTrainer();
		s1.name = "Lokesh";
		System.out.println("SQLTrainer:");
		System.out.println("Name = " + s1.name);

	}

}
