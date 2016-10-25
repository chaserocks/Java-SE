package com.qspiders.exceptions;

public class GCDemo {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		
		System.out.println(rt.freeMemory());
		rt.gc();
		System.out.println(rt.freeMemory());
	}
	protected void finalize() throws Throwable // is protected method of object class
	{
		super.finalize();
		System.out.println("your cleaning code"); // may b created or mayn't be created when the object is about to the collected in the GC
		}
}
