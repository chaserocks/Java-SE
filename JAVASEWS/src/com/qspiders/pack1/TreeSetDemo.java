package com.qspiders.pack1;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args)
	{
	TreeSet<Double> ts=new TreeSet<Double>();
	ts.add(12.34);
	ts.add(14.54);
	ts.add(100.12);
	ts.add(23.44);
	ts.add(100.45);
	System.out.println(ts);
	for(Object obj:ts) 
	{
		System.out.println(obj);
	} 
  }
}
