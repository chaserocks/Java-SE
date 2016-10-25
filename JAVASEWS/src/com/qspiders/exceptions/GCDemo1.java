package com.qspiders.exceptions;

public class GCDemo1 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Java");
		System.out.println(sb);
		sb=null; // eligible for collections
		String s1=new String("Hello");
		String s2=new String("Java");
		System.out.println(s1);
		s1=s2;// Hello object is eligible fot collection.
	}
}
		class GarbageCollection{
			public static void main(String[] argss) throws Exception {
				Runtime rs=Runtime.getRuntime();
				System.out.println("Free Memory in JVM before Garbage Collection="+rs.freeMemory());
				rs.gc();
				System.out.println("Free Memory in JVM after Garbage Collection="+rs.freeMemory());
			}
		}

