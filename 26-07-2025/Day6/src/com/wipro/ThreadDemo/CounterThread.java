package com.wipro.ThreadDemo;

public class CounterThread extends Thread {
	Counter count;
	public CounterThread(Counter count) {
		this.count = count;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
		count.increment();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
