package com.kn.collections.traversing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UpcastingDemo {

	public static void main(String[] args) {
		// Upcasting with Collection objects
		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		List list2 = new LinkedList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);

		Queue que = new ArrayDeque<>();
		que.add(44);
		que.add(55);
		que.add(66);

		Queue que1 = new PriorityQueue<>();
		que1.add(99);
		que1.add(88);
		que1.add(77);

	}

}
