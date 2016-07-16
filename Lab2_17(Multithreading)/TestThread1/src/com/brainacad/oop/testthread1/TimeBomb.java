package com.brainacad.oop.testthread1;

public class TimeBomb extends Thread {

	@Override
	public void run() {
		for (int i = 10; i >= 0; --i) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Boom!!!");

	}

}