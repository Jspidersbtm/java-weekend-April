package com.rollsroyce.carmanufacturing;

public class Sample {

	Sample() {
		this(10);
		Sample(10);
		System.out.println("Zero param custom constructor");
	}

	Sample(String s) {

	}

	void Sample(int x) {
		System.out.println("One paramater method");
	}

	Sample(int x) {
		System.out.println("One param custom constructor");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
	}
}
