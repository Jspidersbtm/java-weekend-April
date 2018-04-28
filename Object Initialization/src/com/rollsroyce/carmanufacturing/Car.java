package com.rollsroyce.carmanufacturing;

public class Car {
	String color;
	String variant;
	String typeOfFabric;
	String brand = "Rolls Royce";

	public Car(String color) {
		this(color,"Petrol","Soft Leather");
		this.color = color;
		this.typeOfFabric = "Soft leather";
	}

	public Car(String color, String variant) {
		this.typeOfFabric = "Leather";
		this.color = color;
		this.variant = variant;
	}

	public Car(String color, String variant, String type) {
		this.color = color;
		this.variant = variant;
		this.typeOfFabric = type;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", variant=" + variant + ", typeOfFabric=" + typeOfFabric + ", brand=" + brand
				+ "]";
	}

	public static void main(String[] args) {
		Car c = new Car("Red");
		System.out.println(c);
	}
}
