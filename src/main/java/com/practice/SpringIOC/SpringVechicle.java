package com.practice.SpringIOC;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringVechicle {
	
	@Autowired
	Speakers speakers;
	
	@Autowired
	Tyres tyres;
	
	public void makeVehicle() {
		speakers.makeSound();
		tyres.acceralte();
	}
}
