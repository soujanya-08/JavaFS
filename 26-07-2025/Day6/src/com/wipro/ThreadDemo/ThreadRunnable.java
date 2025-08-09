package com.wipro.ThreadDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//using runnable to convert vowel string to uppercase and consonant to lowercase
public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		List<String> names = new ArrayList<>(Arrays.asList("Arjun", "Ron","Elliy","Harry"));
		
		Runnable vowelThread =() ->{
		for(int i=0;i<names.size();i++) {
			String name = names.get(i);
			if(startsWithVowel(name)) {
				names.set(i, name.toUpperCase());
			}
		}};
		
		Runnable nonVowelThread =()->{
		for(int i=0;i<names.size();i++) {
			String name = names.get(i);
			if(!startsWithVowel(name)) {
				names.set(i, name.toLowerCase());
			}
		}};
		Thread t1 = new Thread(vowelThread);
		Thread t2 = new Thread(nonVowelThread);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final List: "+ names);
		
		

	}
	public static boolean startsWithVowel(String s) {
		if (s.isEmpty()) return false;
		char ch = Character.toLowerCase(s.charAt(0));
		if(ch== 'a'|| ch== 'e'|| ch== 'i' || ch== 'u') {
			return true;
		}
		return false;
	}

}
