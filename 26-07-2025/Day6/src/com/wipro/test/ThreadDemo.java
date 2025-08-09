package com.wipro.test;

import com.wipro.ThreadDemo.MyThread;

public class ThreadDemo {
public static void main(String[] args) {
	MyThread t = new MyThread(0);
	t.start();
	System.out.println("Main Thread");
	
}
}
