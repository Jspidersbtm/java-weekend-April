package com.hotwheels.toymanufacture;

public class Toy {
	String color;

	Toy() {
		this.color = "Yellow";
	}

	Toy(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color;
	}

	public static void main(String[] args) {
		Toy t3 = new Toy();
		System.out.println(t3);

		Toy t = new Toy("Blue");
		System.out.println(t); // BLUE

		Toy t2 = new Toy("Red");
		System.out.println(t2); // RED

	}

}
