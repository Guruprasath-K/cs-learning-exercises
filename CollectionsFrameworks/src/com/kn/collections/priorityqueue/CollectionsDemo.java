package com.kn.collections.priorityqueue;

import java.util.PriorityQueue;

public class CollectionsDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Ten");
		pq.add("Twenty");
		pq.add("Thirty");
		// pq.add(10); //Generate compile time error due to type safety
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("Forty");
		p.add("Fifty");

		p.addAll(pq);

		System.out.println(p);

		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		// pq1.add("Ten"); // Generate compile time error due to type safety
		// pq1.addAll(p); //Heterogenous Data not allowed due to Generics implementation

		System.out.println(pq);
		System.out.println(pq1);
	}

}
