package oop_2_17.common.labs.part_3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/*
 * Goal: 
 *           Create a program to calculate sum all the elements of an array (of 1000000 integer elements, 
 *       which values generated randomly form 0 to 100), using ForkJoin framework. 
 *       
 * Objectives:
 *       - Create a RecursiveTask for dividing the array into two parts and assign each part to another 
 *         RecursiveTask for further dividing;
 *       - Continue dividing the array and stop dividing when the array has less than 20 elements. 
 */
public class Solution_17_12 {
	
	public static void main(String[] args) {
		demo();
	}

	public static void demo() {
		System.out.println(ArraySum.sumArray(ARRAY));
	}
	
	private static final int NUMBER_OF_THREADS;
	private static final int SIZE;
	private static final int[] ARRAY;
	private static final int LIMIT;

	static int counter = 0;

	static {
		NUMBER_OF_THREADS = 10;
		SIZE = 1_000_000;
		LIMIT = 20;
		ARRAY = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
			ARRAY[i] = (int) (Math.random() * 101);
	}

	static class ArraySum extends RecursiveTask<Long> {

		int from;
		int to;
		int[] array;
		long sum;

		ArraySum(int[] array, int from, int to) {
			this.array = array;
			this.from = from;
			this.to = to;
		}

		protected Long compute() {
			if (to - from <= LIMIT) {
				for (int i = from; i < to; ++i)
					sum += array[i];
				return sum;
			} else {
				System.out.println("pool size: " + getPool().getPoolSize());
				int mid = from + (to - from) / 2;
				ArraySum left = new ArraySum(array, from, mid);
				ArraySum right = new ArraySum(array, mid, to);
				left.fork();
				long rightAns = right.compute();
				long leftAns = left.join();
				return leftAns + rightAns;
			}
		}

		static long sumArray(int[] array) {
			ForkJoinPool pool = new ForkJoinPool(NUMBER_OF_THREADS);
			ArraySum sum = new ArraySum(array, 0, array.length);
			return pool.invoke(sum);
		}
	}
}
