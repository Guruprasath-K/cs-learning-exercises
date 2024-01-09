package com.kn.constructor.chaining;

public class ParentChildApp {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println("Name = " + c1.name);
		System.out.println("Age = " + c1.age);

		Child c2 = new Child("Ramu", 8);
		System.out.println("Name = " + c2.name);
		System.out.println("Age = " + c2.age);
	}

}
