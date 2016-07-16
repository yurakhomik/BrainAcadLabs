package com.brainacad.oop.testgenerics1;

public class MyTuple<A,B,C> {
	
	public static void main(String[] args) {
		MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>();
		MyTuple<Double, String, String> muTuple2 = new MyTuple<>();
	}
	
	private A a;
	private B b;
	private C c;
	
	public A getA() {
		return a;
	}
	
	public B getB() {
		return b;
	}
	
	public C getC() {
		return c;
	}
	
	
	

}
