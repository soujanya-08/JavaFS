package com.wipro2.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Display {
	int size;
	@Autowired
	public Display() {
		this.size= 14;
	}

	public int getSize() {
		return size;
	}

	

	@Override
	public String toString() {
		return "Display [size=" + size + "]";
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
