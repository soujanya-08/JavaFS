package com.wipro.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class DescendingComparator implements Comparator<ComparableD>{

	@Override
	public int compare(ComparableD o1, ComparableD o2) {
		//return o2.getName().compareTo(o1.getName());
		return Integer.compare(o2.getId(), o1.getId());
	}
	
}
public class CompareDemo {
	public static void main(String[] arg) {
		List<ComparableD> l = List.of(new ComparableD("Alice", 2), new ComparableD("Bob", 1), new ComparableD("Willy", 4));
		ArrayList<ComparableD> arrayl = new ArrayList<>(l);
		System.out.println(arrayl);
		Collections.sort(arrayl);
		System.out.println("Ascending Order"+  arrayl);
		Collections.sort(arrayl, new DescendingComparator());
		System.out.println("Descending Order "+ arrayl);
		
		
	}

}
