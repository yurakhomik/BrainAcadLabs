package oop2_5;



public class MyInitTest {
	
	private static int k;
	private static int j;
	private int f;
	private int d;
	
	static {
		k = 100;
		System.out.println("static initialization block 1");
		
	}

	static {
		j = 5;
		System.out.println("static initialization block 2");
	}
	
	{
		f = 10;
		System.out.println("non-static initialization block 1");
	}
	
	{
		d = 50;
		System.out.println("non-static initialization block 2");
	}
	
	public MyInitTest()
	{
		this(0);
		System.out.println("constructor 1");
	}
	
	public MyInitTest(int... empty)
	{
		System.out.println("constructor 2");
	}
	
	
	
	
	
}
