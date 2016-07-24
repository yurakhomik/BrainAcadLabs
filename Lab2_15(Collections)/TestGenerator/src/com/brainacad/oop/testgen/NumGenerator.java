package com.brainacad.oop.testgen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NumGenerator {

	private int numOfEl;
	private int maxNumb;

	public NumGenerator(int numOfEl, int maxNumb) {
		this.numOfEl = numOfEl;
		this.maxNumb = maxNumb;
	}

	public List<Integer> generate() {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < numOfEl; ++i)
			list.add(r.nextInt(maxNumb + 1));
		return list;

	}

	public Set<Integer> generateDistinct() {
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		for (int i = 0; i < numOfEl; ++i)
			set.add(r.nextInt(maxNumb + 1));

		return set;
	}

}
