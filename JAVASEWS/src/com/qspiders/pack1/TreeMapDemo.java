package com.qspiders.pack1;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args)
	{
		TreeMap tm=new TreeMap();
		tm.put("ind", "India");
		tm.put("nz","NewZealand");
		tm.put("uk", "UnitedKingdom");
		System.out.println(tm.descendingMap());
		System.out.println(tm.descendingKeySet());
		
	System.out.println(tm.tailMap("nz")); 
	}
}
