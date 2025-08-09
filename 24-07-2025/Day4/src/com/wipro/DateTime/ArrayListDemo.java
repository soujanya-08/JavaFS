package com.wipro.DateTime;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(3);
		nums.add(10);
		for(Integer i:nums) {
			System.out.println("For Each loop " +i);
	}
		nums.remove(0);
		for(int i=0;i<nums.size();i++) {
			System.out.println("For loop "+ nums.get(i));
		}
		nums.add(32);
		Iterator it = nums.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator" + it.next());
		}
		
		System.out.println(nums.contains(10));
		System.out.println(nums.indexOf(3));
	}

}
