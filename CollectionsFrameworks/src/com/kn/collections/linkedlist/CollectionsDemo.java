package com.kn.collections.linkedlist;

import java.util.LinkedList;

public class CollectionsDemo {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(1, 11);
		list1.set(1, 22);
		list1.add(10);

		System.out.println(list1);
		System.out.println(list1.get(2));
		System.out.println("IndexOf(10) = " + list1.indexOf(10));
		System.out.println("LastIndexOf(10) = " + list1.lastIndexOf(10));
	}

}
