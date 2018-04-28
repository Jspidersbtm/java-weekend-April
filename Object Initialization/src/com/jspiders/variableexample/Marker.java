package com.jspiders.variableexample;

public class Marker {
	void write() {
		System.out.println("Write");
	}

	public static void main(String[] args) {
		Marker m = new Marker();
		m.write();
		m.write();
		m.write();

		new Marker().write();
		new Marker().write();
		new Marker().write();
		new Marker().write();
		new Marker().write();
		new Marker().write();

		m.write();

	}
}
