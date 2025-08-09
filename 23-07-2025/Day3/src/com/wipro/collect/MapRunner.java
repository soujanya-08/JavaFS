package com.wipro.collect;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome festival an";
		Map<Character, Integer> occurances = new HashMap<>();
		char[] characters = str.toCharArray();
		for(char i : characters) {
			Integer integer = occurances.get(i);
			if(integer == null) {
				occurances.put(i, 1);
			}
			else {
				occurances.put(i, integer + 1);
			}
			
		}
		System.out.println(occurances);
		
		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] st = str.split(" ");
		
		for(String word : st) {
			Integer integer = stringOccurances.get(word);
			if(integer == null) {
				stringOccurances.put(word, 1);
			}
			else {
				stringOccurances.put(word, integer + 1);
			}
			
		}
		System.out.println(stringOccurances);
		

	}

}
