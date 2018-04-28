package com.pokemon.playapp.upcastingexample;

public class Person {
	String name = "Ash";

	void play() {
		PokeBall pb = new PokeBall();
		Pokemon p = pb.givePokemon();
		if (p instanceof Pickachu) {
			Pickachu pi = (Pickachu) p;
			pi.giveShock();
		} else if (p instanceof Charmander) {
			Charmander c = (Charmander) p;
			c.fire();
		} else if (p instanceof Bulbazar) {
			Bulbazar b = (Bulbazar) p;
			b.shootBlades();
		} else
			System.out.println("No pokemon at this time!!!!");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.play();
		System.out.println("Completed");
	}

}
