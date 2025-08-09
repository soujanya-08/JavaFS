package com.wipro.test;
import com.wipro.ThreadDemo.First1;
class First1Demo
{
    public static void main(String args[]) throws Exception
{ 
First1 obj=new First1();
 Thread t1=new Thread(obj,"raj");
 Thread t2=new Thread(obj,"seeta");
 Thread t3=new Thread(obj,"reeta");
        t1.start();
       t2.start();
       t3.start();
}
}