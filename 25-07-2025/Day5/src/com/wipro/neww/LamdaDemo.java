package com.wipro.neww;
//Functional Interface
public class LamdaDemo {

	public static void main(String[] args) {
		//Greet hello =()-> System.out.println("Hello Lambda");
		
		//hello.sayHello();
		
		Multiply multiple=(a,b)->{
			return a*b;
		};
		System.out.println(multiple.multiply(2,3));

	}

}
