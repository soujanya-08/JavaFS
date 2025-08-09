package com.wipro.neww;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> nextEven = (num)->
		{
			if(num%2 ==0) {
		System.out.println(num+2);
			}
			else {
				System.out.println(num+1);
			}
		};
		nextEven.accept(1);
		

			Consumer<ZonedDateTime> printCurrentTime = time -> {
	            String formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss zzzz, dd MMM yyyy"));
	            System.out.println(formattedTime);
	        };

	        ZonedDateTime currentTimeInLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
	        printCurrentTime.accept(currentTimeInLondon);
	}
}
