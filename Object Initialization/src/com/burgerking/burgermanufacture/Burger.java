package com.burgerking.burgermanufacture;

public class Burger {
	int price;
	String type;
	boolean isCheesy;
	String vendor = "Burger King";

	public Burger(int price, String type, boolean isCheesy) {
		this.price = price;
		this.type = type;
		this.isCheesy = isCheesy;
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + ", type=" + type + ", isCheesy=" + isCheesy + ", vendor=" + vendor + "]";
	}

	public static void main(String[] args) {
		Burger b1 = new Burger(80, "Veg", true);
		Burger b2 = new Burger(60, "Veg", false);
		Burger b3 = new Burger(120, "Non Veg", true);
		System.out.println(b1 + "\n" + b2 + "\n" + b3);
	}
}
