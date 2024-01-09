package com.kn.collections.treeset;

import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(1);
		// set.add(1.5); // Heterogenous Data not allowed
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(20); // Duplicate Elements not allowed
		set.add(20);
		set.add(20);

		System.out.println(set);

	}

}
