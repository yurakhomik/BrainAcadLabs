package com.brainacad.oop.testexcp1;

public class Main {

	public static void main(String[] args)  {
		
		//Lab 1
		try {
			throw new Exception("thow new Exception!");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally block!");
		}
		
		

		//Lab 2
		try {
			throw new MyException("thow new MyException!");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally block!");
		}
		
		//MyTest.test();
		
		
		try {
			MyTest myTest = new MyTest();
			myTest.test();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally block!");
		}
		
		
	}

}
