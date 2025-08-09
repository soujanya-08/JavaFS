package com.wipro.collect;
public class StringDemo
{
public static void main(String[] args) 
{
	String s1="apple";
	String s2="apple";
	String s3=new String("apple"); //new memory block is created
	
	if(s1==s2) //constant pool
		System.out.println("true");
	else
		System.out.println("false");
	if(s1.equals(s2))
		System.out.println("true");
	else
		System.out.println("false");
	if(s1==s3)
		System.out.println("true");
	else
		System.out.println("false");
}
}