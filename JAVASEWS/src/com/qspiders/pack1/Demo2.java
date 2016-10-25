package com.qspiders.pack1;

class Orange{

}

public class Demo2 {
	public static void main(String[] args) {
		Orange o1=new Orange();
		System.out.println(o1); // prints the address of the created new orange object.
		System.out.println(o1.toString());
		
		String s1=new String("Hello Java-Selenium");
		System.out.println(s1);
		System.out.println(s1.toString());// implicitly calling the s1 ref. variable.
	}
	

}
