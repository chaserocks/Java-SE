package com.qspiders.pack1;

public class Demo97 {
	public static void main(String[] args) {
	
	/*String s1=null;
     System.out.println(s1.length());*/ // this gives null point exception because the object has no(null) value 
     
     String s2="Hello";
     System.out.println(s2.length()); //5
     
     System.out.println(s2.concat("fellow"));//Hellowfellow
     System.out.println(s2);//Hello
     
     String s3=new String();
     System.out.println(s3.length());//0
     
     System.out.println(s3.concat("Hello")); //Hello, concat method create an object and hello is placed.
     System.out.println(s3.length());//0
     System.out.println(s3.isEmpty());//true
     System.out.println(s3=s3.concat("Hello")); //Hello, already created object with hello is pointed to s3 as ref.variable
     System.out.println(s3.length());//5
     System.out.println(s3.isEmpty());//5
     String s4=new String();
     System.out.println(s4=s3+("Hello"));//HelloHello
     System.out.println(s4.length());//10
     
    /* s2="Hello";
		
		System.out.println(s2.contains("Deve"));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(null));
		System.out.println(s2.equals(s3));
		System.out.println("Hello");
    */ 
	}
}
