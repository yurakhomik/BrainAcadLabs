package oop_2_17.common.labs.part_2.solution._17_7;

public class DiningHallSource {
	static int pizzaNum;
	static int studentID;

	public void makePizza() {
		pizzaNum++;
	}

	public void servePizza() {
		String result;
		if (pizzaNum > 0) {
			result = "Served ";
			pizzaNum--;
		} else
			result = "Starved ";
		System.out.println(result + studentID);
		studentID++;
	}

	public static void main(String[] args) {
		DiningHallSource d = new DiningHallSource();
		for (int i = 0; i < 10; i++)
			d.makePizza();
		for (int i = 0; i < 20; i++)
			d.servePizza();
	}

}
