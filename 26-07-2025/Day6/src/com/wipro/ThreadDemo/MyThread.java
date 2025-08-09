package com.wipro.ThreadDemo;
public class MyThread extends Thread {
	
	 int threadNum=0;
	
	 public MyThread(int threadNum) {
		super();
		this.threadNum = threadNum;
	}

	public void run() 
	 {
		 for(int i=0;i<5;i++)
		  {
			 
			 System.out.println("-Thread "+threadNum+ " running--");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		 
		 
	 }

}