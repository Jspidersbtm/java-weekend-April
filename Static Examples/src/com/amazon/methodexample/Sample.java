package com.amazon.methodexample;

public class Sample {
	int x;
	static int y;
	static int z;
	int a;

	void show() {
		System.out.println(x + " " + y + " " + z + " " + a);
	}

	static void disp() {
		Sample s = new Sample();
		System.out.println(s.x + " " + s.a + " " + y + " " + z);
	}
}
