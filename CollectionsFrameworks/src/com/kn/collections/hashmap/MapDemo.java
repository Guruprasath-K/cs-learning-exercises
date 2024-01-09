package com.kn.collections.hashmap;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap map1 = new HashMap<>();
		map1.put(1, 11);
		map1.put(2, 123);
		map1.put("Three", new Student(1, "Mahesh", 7.6));
		map1.put("Four", 101);
		map1.put(5, "5555");
		System.out.println(map1);
	}
}

