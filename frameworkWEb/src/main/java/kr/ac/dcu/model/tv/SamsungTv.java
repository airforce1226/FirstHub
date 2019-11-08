package kr.ac.dcu.model.tv;

import kr.ac.dcu.tv.utill.TV;

public class SamsungTv implements TV {
	
	@Override 
	public void powerOn() {
		System.out.println("LTV powerOn");
	}
	public void powerOff() {
		System.out.println("LTV powerff");
	}
}
