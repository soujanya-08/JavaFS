package com.wipro.DateTime;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
//map - {key - value} pair
public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> mp = new TreeMap<>();
		mp.put("India", "RS");
		mp.put("USA", "Dollar");
		mp.put("Japan", "Yen");
		mp.put("Dubai", "Dirham");
		mp.put("China", "Yuyan");
		System.out.println(mp);
		for(Entry<String, String> data:mp.entrySet()) {
		System.out.println(data.getKey() + " - "+ data.getValue());
		}
		

	}

}
