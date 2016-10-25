package com.qspiders.collections;

import java.util.ArrayList;
import java.util.List;
// How to find does ArrayList Contains all list Elements or not?
public class DoesArrayListContainsAllstElemntsorNot {

	public static void main(String[] args) {
		ArrayList<String> arrlst=new ArrayList<String>();
		arrlst.add("First");
		arrlst.add("Second");
		arrlst.add("Third");
		arrlst.add("Random");
		System.out.println(arrlst);
		
		List<String> list=new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println(list);
		
		System.out.println("Does ArrayList contains all list elements?:"+ arrlst.containsAll(list));

//		list.add("First");
		list.add("one");
		System.out.println(list);
		System.out.println("Does ArrayList contains all list elements?:"+ arrlst.containsAll(list));
		
	}
}
