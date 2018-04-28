package com.shop.vegetableexample;

public class Shop {
	Vegetable sell(String vegName) {
		if (vegName.equalsIgnoreCase("Onion"))
			return new Onion();
		else if (vegName.equalsIgnoreCase("Potato"))
			return new Potato();
		else if (vegName.equalsIgnoreCase("Ginger"))
			return new Ginger();
		else
			return null;
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Vegetable v = s.sell("Ginjer");
		System.out.println(v);
	}
}
