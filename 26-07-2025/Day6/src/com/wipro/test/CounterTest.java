package com.wipro.test;

import com.wipro.ThreadDemo.Counter;
import com.wipro.ThreadDemo.CounterThread;

public class CounterTest {

	public static void main(String[] args) {
		int count =0;
		Counter c = new Counter(count);
		CounterThread t1 = new CounterThread(c);
		CounterThread t2 = new CounterThread(c);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println(c.getCount());

	}

}
