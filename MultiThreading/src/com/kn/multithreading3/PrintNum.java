package com.kn.multithreading3;

public class PrintNum extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
