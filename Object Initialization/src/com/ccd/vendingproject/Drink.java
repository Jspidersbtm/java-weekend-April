package com.ccd.vendingproject;

public class Drink {
	String typeOfDrink;

	Drink(int option) {
		if (option == 1)
			typeOfDrink = "coke";
		else if (option == 2)
			typeOfDrink = "Pepsi";
		else
			typeOfDrink = "Fanta";
	}

	public static void main(String[] args) {
		Drink d = new Drink(1);
		System.out.println(d.typeOfDrink);// coke

		Drink d1 = new Drink(5);
		System.out.println(d1.typeOfDrink);// null
		
		System.out.println(d1.typeOfDrink);
	}
}
