package com.brainacad.oop.testcollection1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		
		for (int i = 0; i <= 10; ++i)
			list.add("nubmer_" + i);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
	}

}
