package com.wipro.neww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionalIn {

	public static void main(String[] args) {
		Function<Double, Double> fn =n -> Math.round((n - Math.floor(n)) * 100.0) / 100.0;
		
		System.out.print(fn.apply(234.45));
		
		List<String> names = Arrays.asList("Jacobs", "Svt", "Dharmendra");

		Function<List<String>, List<Integer>> getLengths = list -> {
            List<Integer> result = new ArrayList<>();
            for (String str : list) {
                result.add(str.length());
            }
            return result;
        };

        List<Integer> lengths = getLengths.apply(names);
        System.out.println(lengths); 
	}
}

	


