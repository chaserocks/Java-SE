package com.qspiders.pack1;

public class Demo96 {
	
	public static void main(String[] args) {
	
		String s1="Java";
		String s2=new String("Developer");
		String s3="Java";
		String s4=new String("Developer");
		String s5=new String("Java");
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1==s5);
		
		System.out.println("----------");
		
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s2));
				
				
	}

}
