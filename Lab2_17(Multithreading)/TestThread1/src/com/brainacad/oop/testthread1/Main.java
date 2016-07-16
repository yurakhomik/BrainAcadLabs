package com.brainacad.oop.testthread1;

public class Main {

	public static void main(String[] args) {
		Lab_2_17_1();
		Lab_2_17_2();
		

	}
	
	public static void Lab_2_17_1() {
		TimeBomb tm1 = new TimeBomb();
		tm1.start();
	}
	
	public static void Lab_2_17_2() {
		
		TestBomb2 tb = new TestBomb2();
		Thread t = new Thread(tb);
		t.start();
	}
}
