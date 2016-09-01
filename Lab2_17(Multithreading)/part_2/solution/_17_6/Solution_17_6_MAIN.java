package oop_2_17.common.labs.part_2.solution._17_6;

public class Solution_17_6_MAIN {

	public static void main(String[] args) {
		Storage storage = new Storage();
		(new Thread(new Counter(storage))).start();
		(new Thread(new Printer(storage))).start();
	}
}
