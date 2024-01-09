package com.kn.inheritance2;

public class InheritanceDemo {

	public static void main(String[] args) {
		ChefRobo chef1 = new ChefRobo();
		chef1.name = "Chitti";
		chef1.type = "2.0";

		System.out.println("Name = " + chef1.name);
		System.out.println("Type = " + chef1.type);

		chef1.walk();
		chef1.talk();
		chef1.charge();
		chef1.cook();

		DriverRobo driver1 = new DriverRobo();
		driver1.name = "Chitti";
		driver1.type = "2.0";

		System.out.println("Name = " + driver1.name);
		System.out.println("Type = " + driver1.type);

		driver1.walk();
		driver1.talk();
		driver1.charge();
		driver1.drive();

		TeacherRobo teacher1 = new TeacherRobo();
		teacher1.name = "Chitti";
		teacher1.type = "2.0";

		System.out.println("Name = " + teacher1.name);
		System.out.println("Type = " + teacher1.type);

		teacher1.walk();
		teacher1.talk();
		teacher1.charge();
		teacher1.teach();

	}

}
