package oop_2_17.common.labs.part_2.solution._17_6;

public class Storage {
	public static final int ITERATIONS = 1_000;
	
	private Integer value;
	
	public Integer getValue() {
		return value;
	}

	private boolean empty = true;

	public synchronized Integer get() { // asynchronized version - comment 'synchronized' keyword
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true;
		notifyAll();
		return value;
	}

	public synchronized void set(Integer value) { // asynchronized version - comment 'synchronized' keyword
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.value = value;
		notifyAll();
	}
}
