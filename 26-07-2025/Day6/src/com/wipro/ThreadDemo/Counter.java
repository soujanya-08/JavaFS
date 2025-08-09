package com.wipro.ThreadDemo;

public class Counter {
	int count =0;
	
	synchronized void increment() {
		count++;
	}

	public Counter(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
