package oop2_2.labs.lab_1;

import java.util.Random;

public class Matrix {
	

	private final int[][] matrix = new int[2][2];

	public void fillMatrix() {
		Random r = new Random();
		int min = 1;
		int max = 5;

		for (int rows = 0; rows < matrix.length; ++rows) {
			for (int colums = 0; colums < matrix[0].length; ++colums) {
				matrix[rows][colums] = r.nextInt(max - min + 1) + min;

			}

		}

	}

	public void addition(Matrix matrix) {
		for (int rows = 0; rows < this.matrix.length; ++rows) {
			for (int colums = 0; colums < this.matrix[0].length; ++colums) {
				this.matrix[rows][colums] += matrix.matrix[rows][colums];

			}

		}

	}

	public void multiplication(Matrix matrix) {
		for (int rows = 0; rows < this.matrix.length; ++rows) {
			for (int colums = 0; colums < this.matrix[0].length; ++colums) {
				this.matrix[rows][colums] *= matrix.matrix[rows][colums];

			}

		}

	}

	public void print() {
		for (int rows = 0; rows < matrix.length; ++rows) {
			for (int colums = 0; colums < matrix[0].length; ++colums) {
				System.out.printf("%-7d", matrix[rows][colums]);

			}
			System.out.println();

		}
		System.out.println();

	}

}
