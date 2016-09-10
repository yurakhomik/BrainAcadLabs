package _3_6_reflections.labs._3_6_1;

public final class ReflectedClass {
	
	private final int a = 0;
	private int b;
	protected int c;
	static public int d;
	
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	
	public ReflectedClass() {
		this(0, 0, 0);
	}
	
	public ReflectedClass(int b, int c, int d) {
		this.b = b;
		this.c = c;
		this.d = d;
	}
			
	public void printValues() {
		String output = "";
		for(int value : new int[]{a, b, c, d})
			output += value;
		System.out.printf("Values are: %s%n", 
				          output.join(", ", output.split("")));
	}	
}
