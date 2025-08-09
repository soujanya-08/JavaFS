package com.wipro.ThreadDemo;
public class First1 implements Runnable
{
int available=2;

synchronized public void run()
	{

	try
	{
	Thread t=Thread.currentThread();
	String name=t.getName();
	if(available > 0)
	{
	System.out.println(name+"  got the ticket");
	System.out.println("ticket printing.......");
	Thread.sleep(2000);
	available=available-1;
	}
	else
	{
	System.out.println(name+"   sorry no ticket....");
	}
	
	}catch(Exception e){}
	}
}

