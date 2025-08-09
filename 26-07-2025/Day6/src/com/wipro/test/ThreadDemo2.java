package com.wipro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wipro.ThreadDemo.EvenThreadProcessor;

public class ThreadDemo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(12,3,4,5,8);//for even number do +2 for odd keep as is
		EvenThreadProcessor evenThread = new EvenThreadProcessor(list);
		evenThread.start();
		//When you call .start() on a thread, Java:
		//Creates a new thread of execution, and
		//Automatically calls the run() method in that new thread.
		
		try {
			evenThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(list);
	}

}
