package oop_2_17.common.labs.part_2.solution._17_7;

/*
 *     Rewrite the DiningHall class so that after the makePizza() method is called 
 * 10 times, the servePizza() method is called once each from 20 different threads.
 */
public class DiningHall_A {
	static int pizzaNum;
	static int studentID;

	public synchronized void makePizza() {
		pizzaNum++;
	}

	public synchronized void servePizza() {
		String result;
		if (pizzaNum > 0) {
			result = "Served ";
			pizzaNum--;
		} else
			result = "Starved ";
		System.out.format("%-8s %-3d by thread %s%n", result, studentID, Thread.currentThread().getName());
		studentID++;
	}

	public static void main(String[] args) {
		DiningHall_A d = new DiningHall_A();
		for (int i = 0; i < 10; i++)
			d.makePizza();
		for (int i = 0; i < 20; i++) {
			new Thread(() -> d.servePizza(), String.format("PizzaServer-%d", i)).start();
		}
	}
}
