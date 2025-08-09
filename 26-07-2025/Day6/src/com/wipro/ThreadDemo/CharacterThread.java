package com.wipro.ThreadDemo;

public class CharacterThread extends Thread {
	public void run() {
		for(char c='a';c<'j';c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
