package _3_6_reflections.labs._3_6_2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
	
	private char[] values; 
	
	
	{
		values = "abcd".toCharArray();
	}

	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println("Old string value: " + Arrays.toString(main.values));
		try {
			Field privateValue = Main.class.getDeclaredField("values");
			try {
				privateValue.set(main, "zxcv".toCharArray());
				System.out.println("New string value: " + Arrays.toString(main.values));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			
			e.printStackTrace();
		} catch (SecurityException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
