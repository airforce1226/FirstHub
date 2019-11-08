package kr.ac.dcu.kv.client;

import kr.ac.dcu.kv.factory.TvFactory;
import kr.ac.dcu.tv.utill.TV;

public class TvClient {

	public static void main(String[] args) {
		TvFactory factory=TvFactory.getInstance();
		TV tv = factory.getBrand("samsung");
		tv.powerOff(); tv.powerOn();
	}
}
