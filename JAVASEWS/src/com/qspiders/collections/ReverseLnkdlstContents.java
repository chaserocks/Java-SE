package com.qspiders.collections;

import java.util.Collections;
import java.util.LinkedList;

// How to reverse the Linked List Contents?
public class ReverseLnkdlstContents {
	
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		
		Collections.reverse(list);
		System.out.println("Result After Shuffle Operations:");
		for(String str:list)
		{
			System.out.println(str);
		}
		
	}
}
