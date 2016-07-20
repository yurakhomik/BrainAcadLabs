package com.brainacad.oop.testcollection3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> array = new ArrayList<>();
		List<String> linked = new LinkedList<>();
		
		for (int i = 0; i <= 10; ++i) {
			array.add("num_" + i);
			linked.add(i, "num_" + i);
		}
					
			Iterator<String> linkedIt = linked.iterator();
			Iterator<String> arrayIt = array.iterator();
			
			System.out.println("LinkedList:");
			while(linkedIt.hasNext())
				System.out.println(linkedIt.next());
			
			System.out.println("\n\nArrayList:");
			while(arrayIt.hasNext())
				System.out.println(arrayIt.next());
			
			ListIterator<String> listIt = array.listIterator();
			int insertIndex = linked.size() - 1;
			while(listIt.hasNext())
				linked.add(insertIndex--, listIt.next());

			System.out.println("\n\nArrayList insert LinkedList:");
			printElements(linked);
	}
	
	static void printElements(List<String> list) {
		Iterator<String> itr2 = list.iterator();
		while (itr2.hasNext()) {
			String element = itr2.next();
			System.out.println(element);
		}
		
	}
}

	
