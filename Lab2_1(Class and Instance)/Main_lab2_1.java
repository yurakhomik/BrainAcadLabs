package labs2_1_;

import labs2_1_.Computer;

public class Main_lab2_1 {
	
	public static void main(String[] args) {

		Computer[] compArr = new Computer[5];
		// Computer comp1 = new Computer();
		// Computer comp2 = new Computer();
		// Computer comp3 = new Computer();
		// Computer comp4 = new Computer();
		// Computer comp5 = new Computer();

		for (int i = 0; i < compArr.length; ++i) {
			compArr[i] = new Computer();
			compArr[i].setPrice((float)(Math.random() * 10 + 1));
			//System.out.println("Start value: " + compArr[i].getPrice());
			compArr[i].setPrice(compArr[i].getPrice()*1.1f);
			//System.out.println("After plus 10% : " + compArr[i].getPrice());
			
		}
		
		for (Computer comp : compArr)
			comp.view();
		

	}

}
