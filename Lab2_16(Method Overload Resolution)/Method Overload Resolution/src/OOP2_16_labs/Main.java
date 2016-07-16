package OOP2_16_labs;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		/*
		//Lab_2_16_1
		Animal a = new Dog();
		Dog d = new Dog();
		foo_1(a); //print "Animal"
		foo_1(d); //print "Dog"
		*/
		
		/*
		//Lab_2_16_2
		byte b = 5;
		foo_2(b); //print "int"
		*/
		
		/*
		//Lab_2_16_3
		int j = 5, b = 10, c = 15;
		foo_3(j,b); // print "5 and 10"
		foo_3(j,b,c); // print "[5,10,15]"
		*/
		
		/*
		//Lab_2_16_4
		foo_1(null); //print "Puppy"
		*/
		
		//Lab_2_16_5
		byte b = 5;
		foo_5(b); //print "byte"
		foo_5(5); //print "int"
		
		
		
		
		
		
	}
	
	
	public static void foo_1(Animal a) {
		System.out.println("Animal");
	}
	
	public static void foo_1(Dog d) {
		System.out.println("Dog");
	}
	
	public static void foo_1 (Puppy p) {
		System.out.println("Puppy");
	}
	
	public static void foo_2(int i) {
		System.out.println("int");
	}
	
	public static void foo_2 (Byte b) {
		System.out.println("Byte");
	}
	
	public static void foo_3(int a, int b) {
		System.out.println(a + " and " + b);
	}
	
	public static void foo_3 (int... i) {
		System.out.println(Arrays.toString(i));
	}
	
	public static void foo_5(int i) {
		System.out.println("int");		
	}
	
	public static void foo_5 (byte b) {
		System.out.println("byte");
	}
	
	
	
}
