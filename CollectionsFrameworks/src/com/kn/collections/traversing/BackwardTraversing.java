package com.kn.collections.traversing;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BackwardTraversing {

	public static void main(String[] args) {

		// Backward Traversing
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(57);
		ad.add(96);
		ad.add(236);

		// Using DescendingIterator()
		Iterator itr = ad.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
