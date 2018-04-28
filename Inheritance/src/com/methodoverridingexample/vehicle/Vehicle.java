package com.methodoverridingexample.vehicle;

public class Vehicle {
	String color;
	int price;
	int noOfWheels;

	protected void start() {
		System.out.println("Insert the key and turn to start");
	}
}
