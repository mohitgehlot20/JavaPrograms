package com.stack;

import java.util.HashMap;
import java.util.Map;

public class MapSetMain {

	public static void main(String[] args) {
		
		Map<Integer,String>mp = new HashMap<Integer,String>();
		mp.put(1,"Sam");
		mp.put(2, "Hari");
		mp.put(3,"shree");
		mp.put(4,"renua");
		System.out.println(mp);
		
		System.out.println("value of second:"+mp.get(2));
		System.out.println("Is hashmap empty?"+mp.isEmpty());
		mp.remove(3);
		System.out.println(mp);
		System.out.println("size of hashmap:"+mp.size());

	}

}
