package com.wipro.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(21);
		queue.offer(10);
		queue.poll();
		System.out.println(queue);//First in First out(FIFO)
		
		Deque<Integer> dq = new LinkedList<>();
		dq.offer(3);
		dq.offer(5);
		dq.offer(7);
		dq.offer(9);
		dq.offerFirst(90);
		dq.offerLast(0);
		System.out.println(dq);
		
		Queue<String> pq = new PriorityQueue<>();
		pq.offer("Ram");
		pq.offer("Sham");
		pq.offer("Aam");
		pq.offer("veer");
		System.out.println(pq);//First element will be lowest in case of integers and lexicographically for strings
		//Collections.reverseOrder() will reverse. highest element will be 1st priority in the list

	}

}
