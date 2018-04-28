package com.reynolds.markerproduct;

public class Marker {
	String brand = "Reynolds";
	int price = 50;
	String color;

	public static void main(String[] args) {
		Marker m1 = new Marker();
		System.out.println(m1.brand + " " + m1.color + " " + m1.price);

		Marker m2 = new Marker();
		System.out.println(m2.brand + " " + m2.color + " " + m2.price);

		// initialization after object creation
		m1.color = "Red";
		m2.color = "Black";

		System.out.println("After changing the value");
		System.out.println(m1.brand + " " + m1.color + " " + m1.price);
		System.out.println(m2.brand + " " + m2.color + " " + m2.price);

		// printing the object reference
		System.out.println(m1);
		System.out.println(m2);
	}
}
