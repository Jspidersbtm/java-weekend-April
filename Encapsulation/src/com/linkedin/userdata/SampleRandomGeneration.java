package com.linkedin.userdata;

import java.util.Random;

public class SampleRandomGeneration {
	int generate() {
		Random r = new Random();
		int n = r.nextInt();
		if (n < 0) {
			n *= -1;
		}
		return n;
	}

	public static void main(String[] args) {
		SampleRandomGeneration s = new SampleRandomGeneration();
		System.out.println(s.generate());
	}
}
