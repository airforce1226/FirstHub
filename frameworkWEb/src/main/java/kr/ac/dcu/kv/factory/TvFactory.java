package kr.ac.dcu.kv.factory;

import java.util.HashMap;
import java.util.Map;

import kr.ac.dcu.model.tv.LgTV;
import kr.ac.dcu.model.tv.SamsungTv;
import kr.ac.dcu.tv.utill.TV;

public class TvFactory {
		private static TvFactory instance;
		private Map<String, TV> map;
		private TvFactory() {
			map = new HashMap<String, TV>();
			map.put("samsung", new SamsungTv());
			map.put("lg", new LgTV());
			
		}
		public static TvFactory getInstance() {
			if(instance ==null) {
				instance = new TvFactory();
			}
			
			return null;
		}
		public TV getBrand(String brand) {
			return map.get(brand);
		}
}
