package com.kn.collections.arraylist;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(10.50);
		list1.add(true);
		list1.add('a');
		list1.add("Ten");
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(40);
		list1.add(111);
		list1.add(10);

		System.out.println(list1.get(2));
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println("IndexOf(30) = " + list1.indexOf(30));
		System.out.println("LastIndexOf(10) = " + list1.lastIndexOf(10));
		System.out.println("IndexOf(10) = " + list1.indexOf(10));

		list1.add(3, 1111);
		System.out.println(list1);
		list1.set(3, 33);
		System.out.println(list1);

	}

}
