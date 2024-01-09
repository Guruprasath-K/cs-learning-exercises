package com.kn.collections.linkedlist;

import java.util.LinkedList;

public class CollectionsDemo1 {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		System.out.println(list1);

		LinkedList list2 = new LinkedList();
		list2.add("Ten");
		list2.add("Twenty");
		list2.add("Thirty");

		System.out.println(list2);

		list2.addAll(list1);
		System.out.println(list2);
	}

}
