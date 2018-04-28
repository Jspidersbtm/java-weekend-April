package com.maruthi.carmanufacturing;

public class Car {
	String brand = "Rolls Royce";
	String color;
	int price;

	void showFeatures() {
		System.out.println(color + " " + price + " " + brand);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Blue";
		c1.price = 15000000;

		Car c2 = new Car();
		c2.color = "White";
		c2.price = 25000000;

		Car c3 = new Car();
		c3.color = "Red";
		c3.price = 30000000;

		c1.showFeatures();
		c2.showFeatures();
		c3.showFeatures();
	}
}
