package com.wipro.collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> ch = List.of('A','Z','B','A','E');
		Set<Character> ts = new TreeSet<>(ch);
		System.out.println("Tree Hash set, sorts and removes duplicate: " + ts);
		
		Set<Character> ls = new LinkedHashSet<>(ch);
		System.out.println("Linked Hash Set removes duplicate and gives the insertion order: "+ ls);
		Set<Character> hs = new HashSet<>(ch);
		System.out.println("Hash Set used for unique items in any order: "+ hs);

	}

}
