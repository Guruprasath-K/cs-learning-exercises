package com.kn.interface6;

public interface Interf1 {

	void m1();

	void m2();

	void m3();

	void m4();

	default void m5() {
		System.out.println("Default method from interface");
	}
}
