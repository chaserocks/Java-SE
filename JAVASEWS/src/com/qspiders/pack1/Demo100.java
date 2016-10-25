package com.qspiders.pack1;

public class Demo100 {
	public static void main(String[] args) {
		// boxing operation:
		
		int i=10;
		Integer intObj1=new Integer(i);
		System.out.println(intObj1); //10 
		
		// un-boxing operation:
		
		int j=intObj1.intValue();
		System.out.println(j); //10
		
		
	}
}
