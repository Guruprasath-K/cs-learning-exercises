package com.kn.multilevel;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.registrationNumber = 1111;
		System.out.println("Registration Number = " + v1.registrationNumber);
		v1.move();

		Car c1 = new Car();
		c1.registrationNumber = 2222;
		System.out.println("Registration Number = " + c1.registrationNumber);
		c1.move();

		Sedan s1 = new Sedan();
		s1.registrationNumber = 3333;
		System.out.println("Registration Number = " + s1.registrationNumber);
		s1.move();

	}

}
