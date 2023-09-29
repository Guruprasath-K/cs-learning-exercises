package com.guru.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = new ArrayList<>();
		characters.add('A');
		characters.add('Z');
		characters.add('A');
		characters.add('B');
		characters.add('Z');
		characters.add('F');
		// List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// unique - Set
		// Tree
		// HashSet
		// LinkedHash

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet " + treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet " + linkedHashSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet " + hashSet);

	}

}
