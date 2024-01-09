package com.kn.staticmemory;

public class ProjectDemo {

	public static void main(String[] args) {

		Program.display1(); // Since static, object creation is not required. Method can be called by the
							// Class.

		Program p1 = new Program(); // Since non-static(instance), object creation is required.
		p1.display2();
	}

}
