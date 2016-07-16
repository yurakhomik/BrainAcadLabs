package com.brainacad.oop.testthread1;

public class TestBomb2 implements Runnable{
	
	@Override
	public void run () {
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
