package com.kn.collections.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		LinkedHashMap map1 = new LinkedHashMap<>();
		map1.put(1, 11);
		map1.put(2, 123);
		map1.put("Three", new Student(1, "Mahesh", 7.6));
		map1.put("Four", 101);
		map1.put(5, "5555");
		System.out.println(map1);

		// Accessing only keys using keySet() method which returns a Set object
		Set keys = map1.keySet();
		System.out.println("Keys = " + keys);

		// Accessing key-value pair using entrySet() method which returns a Set object
		Set kv = map1.entrySet();
		System.out.println("Key-Value = " + kv);

		// Accessing only values using values() method which returns a Collection object
		Collection values = map1.values();
		System.out.println("Values = " + values);
	}

}
