package com.wipro2.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro2.springdemo.beans.Mobile;

public class App1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		
		ctx.scan("com.wipro2.springdemo.beans");	
		ctx.refresh();
		Mobile mobile= ctx.getBean(Mobile.class);
		System.out.println(mobile.toString());
	}

}
