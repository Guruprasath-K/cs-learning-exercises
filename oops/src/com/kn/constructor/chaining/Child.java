package com.kn.constructor.chaining;

public class Child extends Parent {
	String name = "Chottu";
	int age = 12;

	public Child() {
		super();
		System.out.println("--->No Arg Constructor");
	}

	public Child(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("--->Child 2 Arg Constructor");
	}

	public Child(String name) {
		super();
		this.name = name;
		System.out.println("--->Child String ArgConstructor");
	}

	public Child(int age) {
		super();
		this.age = age;
		System.out.println("--->Child Int Constructor");
	}

}
