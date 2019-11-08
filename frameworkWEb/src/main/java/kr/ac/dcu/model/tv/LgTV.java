package kr.ac.dcu.model.tv;

import kr.ac.dcu.tv.utill.TV;

public class LgTV implements TV {

	@Override 
	public void powerOn() {
		System.out.println("LTV powerOn");
	}
	public void powerOff() {
		System.out.println("LTV powerff");
	}
}
