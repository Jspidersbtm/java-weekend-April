package com.puma.tshirtmanufacture;

public class Tshirt {
	String color;
	int price;
	String brand = "Puma";

	public Tshirt() {
		this.color = "Blue";
		this.price = 500;
	}

	public Tshirt(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public Tshirt(String color, int price, String brand) {
		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	// Alt + Shift + s + s
	public String toString() {
		return color + " " + price + " " + brand;
	}

	public static void main(String[] args) {
		Tshirt t = new Tshirt();
		System.out.println(t); //
		Tshirt t2 = new Tshirt("REd", 1000);

	}
}
