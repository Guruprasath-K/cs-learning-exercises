package com.kn.polymorphism4;

public class ParentChildDemo {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.display();
		System.out.println("==========================");
		Child c1 = new Child();
		c1.display();
		System.out.println("==========================");
		Parent p2 = new Child();
		p2.display();
		System.out.println("==========================");
	}

}
