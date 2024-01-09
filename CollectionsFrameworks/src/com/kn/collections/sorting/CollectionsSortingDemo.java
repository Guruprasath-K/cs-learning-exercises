package com.kn.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsSortingDemo {

	public static void main(String[] args) {

		// Sorting using TreeSet
		TreeSet<Integer> set = new TreeSet<>();
		set.add(35);
		set.add(72);
		set.add(8);
		set.add(756);
		System.out.println("Using TreeSet = " + set);

		// Sorting using Collections.sort(obj)
		ArrayList<Integer> list = new ArrayList<>();
		list.add(35);
		list.add(72);
		list.add(8);
		list.add(756);
		System.out.println("List before sorting = " + list);
		Collections.sort(list);
		System.out.println("List after sorting = " + list);
	}

}
