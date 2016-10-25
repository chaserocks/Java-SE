package com.qspiders.pack1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllDemo {
	public static void main(String[] args) {
		List lst=new ArrayList<>();
		lst.add(100);
		lst.add(true);
		lst.add("Hello");
		lst.add(100);
		lst.add("nice");
		System.out.println(lst);
		List lst1=new ArrayList<>();
		lst1.add(100);
		lst1.add(true);
		lst1.add("Fellow");
		lst1.add("nice");
		System.out.println(lst1);
		lst.removeAll(lst1); //removes all the items(which are of the same value) of lst1 in lst. 
		System.out.println(lst);
	}
}
