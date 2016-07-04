package oop2_4;

import oop2_4.labs._2_4_1.ArraysAlgorithms;
import oop2_4.labs._2_4_1.MyMath;
import oop2_4.labs._2_4_1.ArraysCalculation;
import oop2_4.labs._2_4_1.Emploee;


public class StaticClassMembers {
	
	static void demo() {
		
		//lab_2_4_1();
		//lab_2_4_2();
		//lab_2_4_3();
		lab_2_4_4();
		
	}

	
	static void lab_2_4_1() {
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6, 7};
		
		int arr1max = MyMath.findMax(array1);
		int arr1min = MyMath.findMin(array1);
		
		int arr2max = MyMath.findMax(array2);
		int arr2min = MyMath.findMin(array2);
		
		System.out.printf("Max values in first array is %d%n" +
				"Min values in first array is %d%n" +
				"Max values in second array is %d%n" +
				"Min values in second array is %d%n ",
				arr1max, arr1min,
				arr2max, arr2max);
		
		
		
		
		
		
		
		/* int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6, 7};
		
		int array1NumberOfOdds = ArraysAlgorithms.getNumberOfEvens(array1);
		int array1NumberOfEvens = ArraysAlgorithms.getNumberOfOdds(array1);
		
		int array2NumberOfOdds = ArraysAlgorithms.getNumberOfEvens(array2);
		int array2NumberOfEvens = ArraysAlgorithms.getNumberOfOdds(array2);
		
		System.out.printf("Number of odds values in first array is %d%n" +
				"Number of evens values in first array is %d%n" +
				"Number of odds values in second array is %d%n" +
				"Number of ecens values in second array is %d%n ",
				array1NumberOfOdds, array1NumberOfEvens,
				array2NumberOfOdds, array2NumberOfEvens);
		*/
		
				
	}

	static void lab_2_4_2() {
		
		System.out.println("\n\t Lab_2_4_2");
		ArraysCalculation arrCalc = new ArraysCalculation();
		
	}
	
	static void lab_2_4_3() {
		MyMath.areaOfCircle(3);
		
	}
	
	static void lab_2_4_4() {
		Emploee emp1 = new Emploee("Ivan", "Popovich", "rab", 6634236);
		Emploee emp2 = new Emploee("John", "Bfasf", "Director", 6634236);
		System.out.println("Number of Employees: " + Emploee.getNumberOfEmployees());
	}
}
