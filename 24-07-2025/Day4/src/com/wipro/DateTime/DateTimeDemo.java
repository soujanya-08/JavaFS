package com.wipro.DateTime;

import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate dt1 = LocalDate.of(2023,11,01);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dt1.format(formatter));
		
		

		LocalDate dt = LocalDate.of(2001,8,19);
		System.out.println(getAge(dt));
		
		LocalDate d1 = LocalDate.of(2024,12,25);
		LocalDate d2 = LocalDate.of(2025,1,6);
		getDateDiff(d1,d2);
		
		
 
	}
	public static int getAge(LocalDate dt) {
		int currAge = LocalDate.now().getYear()- dt.getYear();
		
		return currAge;
		
	}
	public static int getDateDiff(LocalDate dt1, LocalDate dt2) {
		int yDiff = Math.abs(dt2.getYear()-dt1.getYear()) ;
		int mDiff = Math.abs(dt2.getMonthValue()-dt1.getMonthValue()) ;
		int dDiff = Math.abs(dt2.getDayOfMonth()-dt1.getDayOfMonth());
		System.out.println("Difference is "+ yDiff + " year "+ mDiff +" months " +dDiff + " days");
		return 0;

	}
}

