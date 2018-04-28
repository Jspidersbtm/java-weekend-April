package com.mr.constructor;

public class Car {
	String color;
	String model;
	int price;

	void displayFeature() {
		System.out.println(color + " " + price + " " + model);
	}

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c);
		System.out.println(c.model + " " + c.color + " " + c.price);
	}
}
