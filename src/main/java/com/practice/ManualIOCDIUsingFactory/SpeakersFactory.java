package com.practice.ManualIOCDIUsingFactory;

public class SpeakersFactory {
	public Speakers getSpeaker(String name) {
		if(name == null)return null;
		if(name.equals("Sony")) {
			return new SonySpeakers();
		}
		else if(name.equals("Bose")) {
			return new BoseSpeakers();
		}
		return null;
	}
}
