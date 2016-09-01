package oop_2_17.common.labs.part_2.solution._17_7;

import java.util.*;
import java.util.concurrent.*;

/*
 * Insert synchronization to eliminate data races in your code, if any exist.
 * 
 * NOTE: A data race occurs when:
 *           - two or more threads in a single process access the same memory location concurrently;
 *           - at least one of the accesses is for writing;
 *           - the threads are not using any exclusive locks to control their accesses to that memory;
 *             
 *          When these three conditions hold, the order of accesses is non-deterministic, and the computation 
 *      may give different results from run to run depending on that order. Some data-races may be benign 
 *      (for example, when the memory access is used for a busy-wait), but many data-races are bugs in the program *.
 *      
 *      
 *     * Oracle. Sun Studio 12: Thread Analyzer User's Guide. 1.2 What is a Data Race?
 *       Link: https://docs.oracle.com/cd/E19205-01/820-0619/geojs/index.html
 */
public class DiningHall_B_C implements Callable<Runnable> {
	
	static int pizzaNum;
	static int studentID;
	
	private final String threadnumber;
	
	DiningHall_B_C() {
		this.threadnumber = "main";
	}
	
	DiningHall_B_C(String threadnumber) {
		this.threadnumber = threadnumber;
	}

	public void makePizza() {
		pizzaNum++;
	}

	public void servePizza(String servedByThread) {
		String result;
		if (pizzaNum > 0) {
			result = "Served ";
			pizzaNum--;
		} else
			result = "Starved ";
		System.out.format("%-8s %-3d by thread %s%n", result, studentID, servedByThread);
		studentID++;
	}

	public Runnable call() {
		return () -> servePizza(threadnumber);
	}
	
	public static void main(String[] args) {
		DiningHall_B_C d = new DiningHall_B_C();
		for (int i = 0; i < 10; i++)
			d.makePizza();
		
		final int NUM_THREADS = 20;
		ExecutorService exec = Executors.newFixedThreadPool(NUM_THREADS);
		List<Callable<Runnable>> callables = new ArrayList<>();
		Runnable run = () -> d.servePizza("");
		for (int i = 0; i < NUM_THREADS; i++)
			callables.add(new DiningHall_B_C(String.format("PizzaServer-%d", i)));
		
		try {
			List<Future<Runnable>> results = exec.invokeAll(callables);
			for (Future<Runnable> result : results) {
				try {
					result.get().run();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} finally {
			exec.shutdownNow();
		}
	}
}
