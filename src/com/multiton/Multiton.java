package com.multiton;

import java.util.concurrent.ConcurrentHashMap;

public class Multiton {

	// to store created object
	private static ConcurrentHashMap<Integer, Multiton> map = new ConcurrentHashMap<>();

	private Multiton(){
		
	}
	
	public static Multiton getInstanace(Integer key){
		
		Multiton result = map.get(key);
		
		if (result == null) {
			result = new Multiton();
			map.putIfAbsent(key, result);
		}

		return result;

	}
}
