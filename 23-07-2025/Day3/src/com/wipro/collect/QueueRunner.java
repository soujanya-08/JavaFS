package com.wipro.collect;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return Integer.compare(o1.length(), o2.length());
	}
	
}
public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>(new StringLength());
		q.addAll(List.of("App", "Baller", "Mon","camel"));
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());

	}

}
