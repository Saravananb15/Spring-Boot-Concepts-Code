package com.practice.SpringIOC;

import org.springframework.beans.factory.annotation.Autowired;

public class BMWVechicle {

	@Autowired
	SpringVechicle springVechicle;

	public static void main(String[] args) {
		BMWVechicle bmw = new BMWVechicle();
		bmw.springVechicle.makeVehicle();
	}

}
