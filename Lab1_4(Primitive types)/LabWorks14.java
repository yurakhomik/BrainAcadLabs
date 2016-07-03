
public class LabWorks14 {

	public static void main(String[] args) {
		//Lab1();
		//Lab2();
		//Lab3();
		//Lab4();
		//Lab5();
		//Lab6();
		//Lab7();
		Lab8();
	}
	
	public static void Lab1()  {
		byte b = 1;
		short s = 24;
		int i = 7396;
		long l = 5438918754371905l;
		float f = 5439.31f;
		double d = 35.36;
		char c = 'a';
		boolean bb = true;
		
		System.out.println("byte: " + b + "\nshort: " + s + "\nint: " + i
				+ "\nlong: " + l + "\nfloat: " + f + "\ndouble: " + d
				+ "\nchar: " + c + "\nboolean: " + bb);
	}

	public static void Lab2()  {
		int a = 153632;
		int b = 8244;
		
		System.out.println("a/b = " + (a/b) + "\na*b = " + (a*b) 
				+ "\na+b = " + (a+b) + "\na-b = " + (a-b) + "\na%b = " + (a%b));
		
	}

	public static void Lab3()  {
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a AND b = " + (a && b) + "\na OR b = " + (a || b) 
				+ "\na XOR b = " + (a ^ b) + "\na NOTAND b = " + (!(a && b)));
	
	}

	public static void Lab4()  {
		
		int i = 5;
		
		System.out.println( "i = " + i + "\ni++ = " + i++ + "\ni = " + i
				+  "\ni-- = " + i-- + "\ni = " + i +  "\n++i = " + ++i +
				"\ni = " + i + "\n--i = " + --i +
				"\ni = " + i);

	}

	public static void Lab5()  {
		
		int a = 0000000000000000000000000000011;
		int i1 = a << 2;
		int i2 = a >> 3;
		
		System.out.println(a);
		System.out.println("a << 2 = " + i1);
		System.out.println("a >> 3 = " + i2);
		
		
		
		
	}

	public static void Lab6()  {
		
		int a = 10;
		int b = 12;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("a & b = " + ( a & b));
		System.out.println("a | b = " + ( a | b));
		System.out.println("a ^ b = " + ( a ^ b));
		System.out.println("~a = " + (~a));
		System.out.println("~b = " + (~b));
	}

	public static void Lab7()  {
		
		int a = 10;
		int b = 12;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a > b ? "a > b" : "a < b");
		
	}

	public static void Lab8()  {
		
		int i = 32365435;
		long l = i;
		short s = (short)i;
		double d = i;
		//byte b = i;
		byte b = (byte)i;
		
		long ll = 67451632643315l;
		//short ss = ll;
		short ss = (short)ll;	
		
	}
}
