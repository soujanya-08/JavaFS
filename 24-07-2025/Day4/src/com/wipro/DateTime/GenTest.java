package com.wipro.DateTime;
//Generics take the wrapper class, tht specifies the type to be passed. 
//This way it ensures runtime data type of variables
public class GenTest {

	public static void main(String[] args) {
		GenDemo<Integer> g1 = new GenDemo();
		g1.printit(2);
		GenDemo<String> g2 = new GenDemo();
		g2.printit("Harry");

	}

}
