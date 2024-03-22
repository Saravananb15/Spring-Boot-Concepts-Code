package com.practice.ManualIOCDIUsingFactory;

public class BMWcar {
	public static void main(String[] args) {
		BMWcar bmw = new BMWcar();
		bmw.tightCoupling();
		bmw.looseCoupling();
	}
	public void tightCoupling() {
		// if we want to change from sony speakers to bose we have to 
		// hard code the bose speakers object instead of sony speakers
		Speakers speakers = new SonySpeakers();
		System.out.println(speakers.makeSound());
		
		Tyres tyres = new Apollotyres();
		System.out.println(tyres.acceralte());
	}
	
	public void looseCoupling() {
		// if we want to change from speakers to others
		// we simply modify the getspeakers values		
		SpeakersFactory speakersFactory = new SpeakersFactory();
		Speakers speakers = speakersFactory.getSpeaker("Bose");
		System.out.println(speakers.makeSound());
		
		TyresFactory tyresfactory = new TyresFactory();
		Tyres tyres = tyresfactory.getTyres("MRF");
		System.out.println(tyres.acceralte());
	}
}
