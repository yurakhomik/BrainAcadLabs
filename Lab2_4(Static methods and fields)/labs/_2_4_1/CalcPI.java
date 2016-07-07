package oop2_4.labs._2_4_1;

public class CalcPI {

	public static void main(String[] args) {
		System.out.println(calcPi(500000));

	}
	
	public static double calcPi(int n) {
		double b = 4;
		double result = 0;
		for (double i = 1, k = 1; i < n; i +=2, k *= -1) {
			result += k * (b / i);
		}
		return result;
	}

}
