package com.kn.multithreading3;

public class ThreadDemo {

	public static void main(String[] args) {
		// Creating the objects of classes having independent activities
		PrintNumbers pn = new PrintNumbers();
		PrintCharacters pc = new PrintCharacters();

		// Creating Thread class object & assigning activities
		Thread t1 = new Thread(pn);
		Thread t2 = new Thread(pc);

		// Starting the threads
		t1.start();
		t2.start();
	}

}
