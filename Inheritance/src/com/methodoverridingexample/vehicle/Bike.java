package com.methodoverridingexample.vehicle;

public class Bike extends Vehicle {

	public void start() {
		System.out.println("insert the key and press the button to start");
	}
	

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();

		Truck t = new Truck();
		t.start();

		Car c = new Car();
		c.start();
	}
}
