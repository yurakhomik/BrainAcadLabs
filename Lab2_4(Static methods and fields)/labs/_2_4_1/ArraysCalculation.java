package oop2_4.labs._2_4_1;

public class ArraysCalculation {
	public ArraysCalculation() {

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6, 7 };

		int array1NumberOfOdds = ArraysAlgorithms.getNumberOfEvens(array1);
		int array1NumberOfEvens = ArraysAlgorithms.getNumberOfOdds(array1);

		int array2NumberOfOdds = ArraysAlgorithms.getNumberOfEvens(array2);
		int array2NumberOfEvens = ArraysAlgorithms.getNumberOfOdds(array2);

		System.out.printf(
				"Number of odds values in first array is %d%n" + "Number of evens values in first array is %d%n"
						+ "Number of odds values in second array is %d%n"
						+ "Number of ecens values in second array is %d%n ",
				array1NumberOfOdds, array1NumberOfEvens, array2NumberOfOdds, array2NumberOfEvens);
	}
}
