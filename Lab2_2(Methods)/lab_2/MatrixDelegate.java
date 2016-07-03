package oop2_2.labs.lab_2;

import oop2_2.labs.lab_1.*;

public class MatrixDelegate {

	public static void main(String[] args) {
		Matrix mat1 = new Matrix();
		Matrix mat2 = new Matrix();
		mat1.fillMatrix();
		mat2.fillMatrix();		System.out.println("Matrix #1:"  );
		mat1.print();
		System.out.println("Matrix #2:"  );
		mat2.print();
		System.out.print("Matrix #1 addition to matrix #2: \n");
		mat1.addition(mat2);
		mat1.print();
		System.out.print("Matrix #1 addition to matrix #2: \n");
		mat1.multiplication(mat2);;
		mat1.print();
		

	}

}
