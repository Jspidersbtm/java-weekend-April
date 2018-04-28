package com.methodoverridingexample.inputdeviceexample;

public class Mouse extends InputDevice {

	@Override
	public void select() {
		System.out.println("Press the left click to select");
	}

	// sub class specific method
	public void scroll() {
		System.out.println("Scroll up and down");
	}

}
