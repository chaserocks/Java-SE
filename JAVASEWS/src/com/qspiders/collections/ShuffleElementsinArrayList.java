package com.qspiders.collections;

import java.util.ArrayList;
import java.util.Collections;

// How to Shuffle Elements in ArrayList?
public class ShuffleElementsinArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		
		Collections.shuffle(list);
		System.out.println("Result After Shuffle Operations:");
		for(String str:list)
		{
			System.out.println(str);
		}
		
		Collections.shuffle(list);
		System.out.println("Result After Shuffle Operations:");
		for(String str:list)
		{
			System.out.println(str);
		}
		
		Collections.shuffle(list);
		System.out.println("Result After Shuffle Operations:");
		for(String str:list)
		{
			System.out.println(str);
		}	
	}
}
