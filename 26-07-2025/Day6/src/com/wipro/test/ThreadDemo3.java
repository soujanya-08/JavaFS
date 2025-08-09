package com.wipro.test;

import com.wipro.ThreadDemo.CharacterThread;
import com.wipro.ThreadDemo.NumberThread;

public class ThreadDemo3 {

	public static void main(String[] args) {
		CharacterThread c = new CharacterThread();
		c.start();
		NumberThread n = new NumberThread();
		n.start();
		try {
			c.join();
			n.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
