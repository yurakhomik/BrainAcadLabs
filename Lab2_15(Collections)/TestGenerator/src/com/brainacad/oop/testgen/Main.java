package com.brainacad.oop.testgen;

public class Main {

	public static void main(String[] args) {
		NumGenerator gen = new NumGenerator(10, 2);
		System.out.println(gen.generate());
		System.out.println(gen.generateDistinct());
	}

}
