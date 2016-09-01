package oop_2_17.common.labs.part_2.solution._17_6;

public class Counter implements Runnable {

	private Storage storage;

	public Counter(Storage storage) {
		this.storage = storage;
	}

	public void run() {
		for (int i = 0; i < Storage.ITERATIONS; i++) {
			storage.set(i);
		}
		storage.set(Storage.ITERATIONS);
	}
	
	// asynchronized version
	/*public void run() {
		for (int i = 0; i < Storage.ITERATIONS; i++) {
			storage.set(i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		storage.set(Storage.ITERATIONS);
	}*/

}
