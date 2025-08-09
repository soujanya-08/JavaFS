package com.wipro.test;

import java.util.Scanner;

import com.wipro.ThreadDemo.GPay;
import com.wipro.ThreadDemo.PPay;
import com.wipro.ThreadDemo.Payment;

public class DependancyInversionTest {

	public static void main(String[] args) {
		System.out.println("Enter 1 for Google Pay and 2 for PhonePay");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	
		
		Payment pay = null;
		
		
		if(input == 1) {
			pay  = new GPay();
		}
		else if(input == 2) {
			pay = new PPay();
		}
		else {
			System.out.println("Enter a valid input");
		}
		pay.payment();
		
		
		

	}

}
