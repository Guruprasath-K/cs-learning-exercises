package com.kn.multithreading4;

public class Chatting extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Chatting Started");
			Thread.sleep(2000);

			System.out.println("Chit Chat");
			Thread.sleep(2000);

			System.out.println("Chatting Ended");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
