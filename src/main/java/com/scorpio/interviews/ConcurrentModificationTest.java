package com.scorpio.interviews;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationTest {

	ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
	public static void main(String[] args) {
		ConcurrentModificationTest test = new ConcurrentModificationTest();
		test.putAndRemoveData();
	}
		
	public void putAndRemoveData()
	{
		map.put(1, "Kumud");
		map.put(2, "Gaurav");
		map.put(3, "Vaibhav");
		map.put(4, "Vineeta");
		
		java.util.Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			int key = iter.next().intValue();
			System.out.println("the key is: "+key);
			if(key == 3)
				map.remove(key);
		}
		
		java.util.Iterator<Integer> iter1 = map.keySet().iterator();
		System.out.println("after removal..");
		while(iter1.hasNext())
		{
			int key = iter1.next().intValue();
			System.out.println("the key is: "+key);
		}
	}
	
//	while iterating the collection if we delete the item from the collection without using iterator's remove method, a concurrentmodification exception is thrown,
//	however if we remove it using iterator's remove method then no concurrent modification exception is thrown.
//	In case of concurrenthashmap, the concurrentmodification exceptio is now thrown.
	

}
