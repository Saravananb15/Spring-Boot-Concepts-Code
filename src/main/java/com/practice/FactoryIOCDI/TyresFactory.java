package com.practice.FactoryIOCDI;

public class TyresFactory {
	public Tyres getTyres(String tyres) {
		if(tyres == null )return null;
		if(tyres.equals("Apollo")) {
			return new Apollotyres();
		}else if(tyres.equals("MRF")) {
			return new MRFTyres();
		}
		return null;
	}
}
