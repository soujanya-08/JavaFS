package com.wipro.DateTime;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//Set- no duplicates, any order(Except for LinkedList), sort for TreeSet
public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(2);
		set.add(8);
		set.add(8);
		set.add(76);
		System.out.println(set);
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(4);
		set1.add(2);
		set1.add(8);
		set1.add(8);
		set1.add(76);
		System.out.println(set1);
		Set<Integer> set2 = new TreeSet<>();
		set2.add(4);
		set2.add(2);
		set2.add(8);
		set2.add(8);
		set2.add(76);
		System.out.println(set2);
		

	}

}
