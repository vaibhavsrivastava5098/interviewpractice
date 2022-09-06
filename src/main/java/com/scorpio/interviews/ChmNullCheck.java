package com.scorpio.interviews;

import java.util.concurrent.ConcurrentHashMap;

public class ChmNullCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(1, "Kumud");
		chm.put(2, "Gaurav");
		chm.put(3, "Vaibhav");
		chm.put(4, "Vineeta");
		chm.put(5, "null");
		chm.put(6, "null");
		chm.entrySet().stream().forEach(e->System.out.println("The key is: "+e.getKey()+" and the value is: "+e.getValue()));

	}
	
//	From this code this is evident that CHM doesn't allow null as key but value can be null

}
