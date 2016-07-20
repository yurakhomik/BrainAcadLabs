package com.brainacad.oop.testcollection2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int j = 0; j <= 10; ++j) {
			list2.add(j);
		}
		Collections.shuffle(list2);
		
		for (int i = 0; i <= 10; ++i)
			list.add("nubmer_" + list2.get(i));

		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
	}

}
