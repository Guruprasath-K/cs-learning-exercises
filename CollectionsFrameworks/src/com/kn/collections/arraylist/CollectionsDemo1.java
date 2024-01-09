package com.kn.collections.arraylist;

import java.util.ArrayList;

public class CollectionsDemo1 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		ArrayList list2 = new ArrayList();
		list1.add("Ten");
		list1.add("Twenty");
		list1.add("Thirty");
		list1.add("Forty");
		list1.add("Fifty");

		System.out.println(list1);
		System.out.println("**********************");
		System.out.println(list2);
		System.out.println("**********************");

		// list2.addAll(list1) //Add all the elements of specified collection at the end
		list2.addAll(2, list1);
		// Add all the elements of specified collection at the specified index
		System.out.println(list2);

	}

}
