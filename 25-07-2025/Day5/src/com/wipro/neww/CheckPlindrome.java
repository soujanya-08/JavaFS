package com.wipro.neww;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CheckPlindrome {

	public static void main(String[] args) {
		Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        };
        System.out.println(isPalindrome.test("ashj"));

	
	Predicate<String> isUpper = str -> {
        if(str.equals(str.toUpperCase())) {
        	return true;
        }
        else {
        	return false;
    }
        
	};
	Predicate<String> isLower = str -> {
        if(str.equals(str.toLowerCase())) {
        	return true;
        }
        else {
        	return false;
    }
	};
	if(isUpper.test("ADD")) {
    System.out.println("Upper case");
	}
	if(isLower.test("add"))  {
		System.out.println("Lower case");
	}
	Supplier<String> dt = () -> {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eee");
        return tomorrow.format(formatter);
    };
    System.out.println("Tomorrow's day is: " + dt.get());
    
    

}

}
