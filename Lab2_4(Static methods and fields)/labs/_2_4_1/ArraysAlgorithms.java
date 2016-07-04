package oop2_4.labs._2_4_1;

public class ArraysAlgorithms {

	public static int getNumberOfOdds(int[] array) {
		int numberOfOdds = 0;
		for(int element  : array) {
			if (element % 2 > 0) {
				++numberOfOdds;
			}
		}
			
		return numberOfOdds;
	}
	
	public static int getNumberOfEvens(int[] array) {
		int numberOfEvens = 0;
		for(int element  : array) {
			if (element % 2 > 0) {
				++numberOfEvens;
			}
		}
			
		return numberOfEvens;
	}
	
	

}
