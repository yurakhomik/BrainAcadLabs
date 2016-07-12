package com.brainacad.oop.testenum1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Lab_2_13_1();
		// Lab_2_13_2();
		Lab_2_13_3();
		

	}

	private static void Lab_2_13_1() {
		for (MyDayOfWeek day : MyDayOfWeek.values())
			System.out.println(day);

	}

	private static void Lab_2_13_2() {
		for (MyDayOfWeek day : MyDayOfWeek.values())
			if (day.ordinal() == 2 || day.ordinal() == 4 || day.ordinal() == 6)
				switch (day) {
				case SUNDAY:
					System.out.println("This is no JAVA day");
					break;
				case MONDAY:
					System.out.println("This is no JAVA day");
					break;
				case WEDNESDAY:
					System.out.println("This is no JAVA day");
					break;
				case FRIDAY:
					System.out.println("This is no JAVA day");
					break;
				case TUESDAY:
					System.out.println("My Java day: TUESDAY");
					break;
				case THURSDAY:
					System.out.println("My Java day: THURSDAY");
					break;
				case SATURDAY:
					System.out.println("My Java day: SATURDAY");
					break;

				}

	}

	private static void Lab_2_13_3() {

		System.out.println("Please, enter current day name:");
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine().toUpperCase();

		try {
			switch(MyDayOfWeek.valueOf(day)) {
			case SUNDAY: 
			case MONDAY: 
			case TUESDAY: 
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			case SATURDAY: {
				System.out.println("Next day is: " + MyDayOfWeek.nextSeason(MyDayOfWeek.valueOf(day)));	
				break;
			} default: 
				System.out.println("Incorrent day!");
			}
		}catch (Exception e) {
			System.out.println("Incorrent day!");
			return;
		} finally {
			sc.close();
		}
	}
	

	public enum MyDayOfWeek {

		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
		
		public static MyDayOfWeek nextSeason(MyDayOfWeek current) {
			if(current.ordinal() == MyDayOfWeek.values().length - 1) 
				return MyDayOfWeek.values()[0];
			else
				return MyDayOfWeek.values()[current.ordinal() + 1];
		}

	}
	}
