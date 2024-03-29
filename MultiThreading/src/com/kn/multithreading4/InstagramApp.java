package com.kn.multithreading4;

public class InstagramApp {

	public static void main(String[] args) {
		System.out.println("Instagram Application Opened...");

		Chatting chatting = new Chatting();
		Reels reels = new Reels();

		chatting.start();
		reels.start();

		try {
			chatting.join();
			reels.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Instagram Application Terminated... ");
	}

}
