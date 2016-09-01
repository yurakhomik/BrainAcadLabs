package oop_2_17.common.labs.part_3;

public class Solution_17_10 {
	
	public static void main(String[] args) {
		demo();
	}

	public static void demo() {
		CustomObject co1 = new CustomObject();
		CustomObject co2 = new CustomObject();
		CustomObject co3 = new CustomObject();
		
		CustomThread ct1 = new CustomThread(() -> {
			synchronized(co1) {
				System.out.println("Thread 1: Holding lock 1...");
				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized(co2) {
					System.out.println("Thread 2: Holding lock 2 & 1...");
					synchronized(co3) {
						System.out.println("Thread 3: Holding lock 1, 2 & 3...");
					}
				}
			}
		});
		CustomThread ct2 = new CustomThread(() -> {
			synchronized(co2) {
				System.out.println("Thread 2: Holding lock 2...");
				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				System.out.println("Thread 2: Waiting for lock 3...");
				synchronized(co3) {
					System.out.println("Thread 3: Holding lock 3 & 2...");
					synchronized(co1) {
						System.out.println("Thread 1: Holding lock 1, 2 & 3...");
					}
				}
			}
		});
		CustomThread ct3 = new CustomThread(() -> {
			synchronized(co3) {
				System.out.println("Thread 3: Holding lock 3...");
				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				System.out.println("Thread 3: Waiting for lock 1...");
				synchronized(co2) {
					System.out.println("Thread 2: Holding lock 2 & 3...");
					synchronized(co1) {
						System.out.println("Thread 1: Holding lock 1, 2 & 3...");
					}
				}
			}
		});
		ct1.start();
		ct2.start();
		ct3.start();
	}
	
	private static class CustomThread extends Thread {

		public CustomThread(Runnable target) {
			super(target);
		}
		
	}
	
	private static class CustomObject {}
}
