package com.jspiders.variableexample;

public class Sample {
	String name = "Alpha";
	int age = 15;
	String color = "Brown";
	String address;

	void show() {
		String name = "Beta";
		int age = 20;
		String color = "Black";
		System.out.println(name);// Beta
		System.out.println(this.color); // Brown
		System.out.println(age); // 20
		System.out.println(this.name); // Alpha
		String address = null;
		System.out.println(address);
		System.out.println(this.address); // null
	}

	public static void main(String[] args) {
		new Sample().show();
	}
}
