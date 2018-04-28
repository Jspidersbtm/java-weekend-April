package com.samsung.mobilemanufacture;

public class Mobile {
	String color;
	int price;
	String model;
	double screenSize;

	public Mobile(String color, int price) {
		this(color, price, "Galaxy", 5.5);
	}

	public Mobile(int price) {
		this("White", price, "S Series", 6.0);
		System.out.println("one param constructor");
	}

	public Mobile(String color, int price, String model, double screenSize) {
		this.color = color;
		this.price = price;
		this.model = model;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Mobile [color=" + color + ", price=" + price + ", model=" + model + ", screenSize=" + screenSize + "]";
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Red", 5000);
		System.out.println(m1);
	}

}
