package oop_2_17.common.labs.part_3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Solution_17_11 {
	
	private static final int NUMBER_OF_THREADS = 2;
	private static Integer key = -1;
	private static String value = "value ";
	
	/* ----- ConcurrentHashMap and HashMap functions ----- */
	private static Demo concurrentDemo = () -> {
		ConcurrentHashMap<? super Integer, ? super String>  concurrentHM = 
                                                      new ConcurrentHashMap<>();
		
		Thread[] writers = getThreads(NUMBER_OF_THREADS, 
				                      getConcurrentWriter(concurrentHM), 
				                      "Writer ");
		Thread[] readers = getThreads(NUMBER_OF_THREADS, 
				                      getConcurrentReader(concurrentHM), 
                                      "  Reader ");
		startThreads(Arrays.asList(writers), Arrays.asList(readers));
	};
	
	private static Demo nonConcurrentDemo = () -> {
		Map<? super Integer, ? super String>  nonConcurrentHM = new HashMap<>();
		Thread[] writers = getThreads(NUMBER_OF_THREADS, 
				                      getWriter(nonConcurrentHM), 
                                      "Writer ");
		Thread[] readers = getThreads(NUMBER_OF_THREADS, 
				                      getReader(nonConcurrentHM), 
                                      "  Reader ");
		startThreads(Arrays.asList(writers), Arrays.asList(readers));
	};
	
	/* ----- ConcurrentHashMap Runnable: START ----- */
	private static Runnable getConcurrentWriter(ConcurrentHashMap<
			                                              ? super Integer, 
			                                              ? super String> map) {
		return () -> { 
			map.put(++key, value + key);
			System.out.printf("%s: %s%n", 
						      Thread.currentThread().getName(), value + key);
		};
	}
	
	private static Runnable getConcurrentReader(ConcurrentHashMap<
			                                                ? super Integer, 
                                                            ? super String> map) {
		return () -> {
			Iterator it = map.entrySet().iterator();
			while (it.hasNext()) {
				Entry entry = (Entry) it.next();
				System.out.printf("%s: %s%n", 
					              Thread.currentThread().getName(), 
					              entry.getValue());
			}
		};
	}
	
	
	/* ----- HashMap Runnable: START ----- */
	private static Runnable getWriter(Map<? super Integer, 
                                          ? super String> map) {
		return () -> { 
			synchronized (map) { 
				map.put(++key, value + key);
				System.out.printf("%s: %s%n", 
                                  Thread.currentThread().getName(), 
                                  value + key);
			} 
		};
	}
	
	private static Runnable getReader(Map<? super Integer, 
                                          ? super String> map) {
		return () -> {
			synchronized (map) {
				Iterator it = map.entrySet().iterator();
				while (it.hasNext()) {
					Entry entry = (Entry) it.next();
					System.out.printf("%s: %s%n", 
                                      Thread.currentThread().getName(), 
                                      entry.getValue());
				}
			}
		};
	}
	
	/* =*=*=*= Map Runnable(s): END =*=*=*= */
	
	
	/* ----- Thread arrays service functions ----- */
	private static Thread[] getThreads(int size, Runnable run, String name) {
		Thread[] arrayToReturn = new Thread[size];
		for(int i = 0; i < arrayToReturn.length; ++i) {
			arrayToReturn[i] = new Thread(run, name + i);
		}
		return arrayToReturn;
	}
	
	public static void startThreads(List<? super Thread[]>... threadArrays) {
		for(List<? super Thread[]> singleThreadArray : threadArrays) {
			for(Object thread : singleThreadArray) {
				((Thread)thread).start();
				while(((Thread)thread).isAlive()) {
					Thread.currentThread().yield();
				}
			}
		}
		System.out.println();
	}
	
	
	/* ----- Task service functions ----- */
	private static long performanceIndicator(Demo demo) {
		long start = System.currentTimeMillis();
		key = -1;
		demo.execute();
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static void performanceComparator() {
		System.out.println("\tConcurrent collection based execution:");
		long concurrentTime = performanceIndicator(concurrentDemo);
		System.out.println("\tNON-Concurrent collection based execution:");
		long nonConcurrentTime = performanceIndicator(nonConcurrentDemo);
		
		System.out.println("\tPerformance report:");
		System.out.printf("Time spend for concurrent execution: "
                + "%d milliseconds%n", concurrentTime);
		System.out.printf("Time spend for NON-concurrent execution: "
                + "%d milliseconds%n", nonConcurrentTime);
		
		String result = "";
		try {
			result = String.format("is greeter in %s times", 
		             new BigDecimal(String.valueOf(concurrentTime))
		             .divide(
		             new BigDecimal(String.valueOf(nonConcurrentTime)))
		             .toString());
		} catch(Exception e) {
			result = String.format("is approximately in %s times", 
		             new BigDecimal(String.valueOf(concurrentTime))
		             .divide(
		             new BigDecimal(String.valueOf(nonConcurrentTime)),
		             BigDecimal.ROUND_HALF_UP)
		             .toString());
		}
		System.out.printf("\nPerformance of NON-concurrent\n"
				        + "versus concurrent collection\n%s",
				          result);
		
		
	}
	
	public static void demo() {
		performanceComparator();
	}
	
	public static void main(String[] args) {
		demo();
	}
	
	@FunctionalInterface
	private interface Demo {
		void execute();
	}
}
