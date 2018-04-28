package com.ccd.coffemachine;

public class VendingMachine {

	Beverage give(int option) {
		switch (option) {
		case 1:
			return new Cappucino();

		case 2:
			return new Espresso();

		default:
			return new GreenTea();
		}

	}

	public static void main(String[] args) {
		VendingMachine v = new VendingMachine();
		Beverage b = v.give(1);

	}

}
