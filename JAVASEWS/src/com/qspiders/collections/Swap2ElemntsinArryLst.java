package com.qspiders.collections;

import java.util.ArrayList;
import java.util.Collections;

// How to Swap two Elements in ArrayList
public class Swap2ElemntsinArryLst {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		
		Collections.swap(list,2, 5);
		System.out.println("Result After Shuffle Operations:");
		for(String str:list)
		{
			System.out.println(str);
		}
	}

}
