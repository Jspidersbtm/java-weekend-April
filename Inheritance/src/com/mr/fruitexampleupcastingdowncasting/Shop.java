package com.mr.fruitexampleupcastingdowncasting;

import java.util.Scanner;

public class Shop {

	public Object sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("What fruit/vegetable you want?");
		String name = s.next();
		if (name.equalsIgnoreCase("Apple")) {
			return new Apple();
		} else if (name.equalsIgnoreCase("Strawberry")) {
			return new StrawBerry();
		} else if (name.equalsIgnoreCase("Watermelon")) {
			return new WaterMelon();
		} else if (name.equalsIgnoreCase("Chilli")) {
			return new Chilli();
		} else
			return null;
	}

}
