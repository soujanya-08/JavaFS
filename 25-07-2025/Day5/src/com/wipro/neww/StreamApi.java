package com.wipro.neww;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Stream API
public class StreamApi {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Joy", "Ashish", "Rita", "Abhishek", "Soujanya");
		//gets the list of unique string whise length is <5 in uppercase
        List<String> outputList = str.stream()
                .distinct()
                .filter(s -> s.length() < 5)
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(outputList);
        //gets the count of number of unique even numbers 
        List<Integer> num = Arrays.asList(2,3,5,34,67,435,5,62);
        Long count = num.stream()
        .distinct()
        .filter(i ->i%2 ==0)
        .count();
        System.out.println(count);
        
        //returns list of string containing "so" 
        List<String> names =
        		str.stream()
        		.filter(s->s.toLowerCase().contains("so"))
        		.collect(Collectors.toList());
        System.out.println(names);
        
        
        

	}

}
