package oop_2_17.common.labs.part_2.solution._17_6;

public class Printer implements Runnable {

	private Storage storage;

	public Printer(Storage storage) {
		this.storage = storage;
	}

	public void run() {
		for (Integer value = storage.get(); !value.equals(Storage.ITERATIONS); 
			 value = storage.get()) {
			System.out.println(value);
		}
	}

	// asynchronized version
	/*public void run() {
		for (int i = 0; i < Storage.ITERATIONS; ++i) {
			System.out.println(storage.getValue());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}*/

}