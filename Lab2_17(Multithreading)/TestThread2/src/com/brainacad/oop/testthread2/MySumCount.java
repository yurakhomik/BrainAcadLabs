package com.brainacad.oop.testthread2;

public class MySumCount extends Thread {
	int startIndex;
	int stopIndex;
	
	int[] array;
	
	long resultSum;

	public long getResultSum() {
		return resultSum;
	}

	public int getStartIndex() {
		return startIndex;
	}
	
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	
	public int getStopIndex() {
		return stopIndex;
	}
	
	public void setStopIndex(int stopIndex) {
		this.stopIndex = stopIndex;
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}
	
	@Override
	public void run() {
		resultSum = 0;
		for (int i = startIndex; i <= stopIndex; ++i) {
				resultSum += array[i];
		}
		
	}
}
