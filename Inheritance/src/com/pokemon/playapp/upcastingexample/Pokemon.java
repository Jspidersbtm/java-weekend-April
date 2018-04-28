package com.pokemon.playapp.upcastingexample;

public class Pokemon {
	double height;
	String color;

	void talk() {
		System.out.println("Pokemon talk");
	}

	Pokemon(double height, String color) {
		this.height = height;
		this.color = color;
	}

}
