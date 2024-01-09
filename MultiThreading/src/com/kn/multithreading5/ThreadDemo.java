package com.kn.multithreading5;

public class ThreadDemo {

	public static void main(String[] args) {

		// Creating objects of my Thread
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		// Setting name of threads
		t1.setName("Numbers");
		t2.setName("Characters");

		// Starting Threads
		t1.start();
		t2.start();
	}

}
