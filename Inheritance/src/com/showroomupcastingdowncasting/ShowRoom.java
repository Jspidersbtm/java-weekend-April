package com.showroomupcastingdowncasting;

import java.util.Scanner;

public class ShowRoom {
	Object sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("What object you want? BenzCar, Gold or Bike!");
		String nameOfObject = s.next();
		switch (nameOfObject) {
		case "BENZCAR":
		case "benzcar":
			return new BenzCar();
		case "GOLD":
		case "gold":
			return new Gold();
		case "BIKE":
		case "bike":
			return new Bike();
		default:
			return null;
		}
	}
}
