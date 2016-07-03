import java.util.Arrays;

public class LabWork1_6 {

	public static void main(String[] args) {
		// Lab1();
		// Lab2();
		// Lab3();
		//Lab4();
		Lab5();

	}

	public static void Lab1() {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };

		for (int i = 0; i < arr.length; ++i)
			System.out.println(arr[i]);

	}

	public static void Lab2() {

		int[] arr = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
		Arrays.sort(arr);

		System.out.println("Maximym is: " + arr[0] + "\nMinimym is: " + arr[arr.length - 1]);
		int sum = 0;
		for (int i = 0; i < arr.length; ++i)
			sum += arr[i];

		int aver = sum / arr.length;
		System.out.println("Average is: " + aver);

		if (arr.length % 2 == 0) {
			int s = arr.length / 2;
			int median = (arr[s - 1] + arr[s + 1]) / 2;
			System.out.println("Median is: " + median);
		} else {
			int median = arr.length / 2;
			System.out.println("Median is: " + arr[median]);
		}

	}

	public static void Lab3() {
		int[][] arr = { { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 7, 11, 15 }, { 4, 8, 12, 16 } };
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}

	}

	public static void Lab4() {
		
		int[] arr = {10, 15, 17, 2, 11, 12, 16, 19, 40, 21, 64, 75};
		Arrays.sort(arr);
		System.out.println("Sorted array is: ");
		for(int element : arr)
			System.out.println(element);
		
		int searchNum = 11;
		int value = Arrays.binarySearch(arr,searchNum);
	
		System.out.print("The index of element nubmer " + searchNum + " is: "
		                 + value);

	}

	public static void Lab5() {

		int m = 4, n = 5;
		int[][] arr = { { 1, 1, 1, 3, 4, }, { 2, 1, 3, 1, 2 }, 
				{ 2, 2, 3, 4, 1 }, { 3, 3, 3, 1, 4 } };

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (arr[i][j] == 1) {
					System.out.println("Line " + i + ": [" + j + "]");
				}
			}
		}

	}

}
