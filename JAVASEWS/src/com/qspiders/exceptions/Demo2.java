package com.qspiders.exceptions;

public class Demo2 {
	 public static void main(String[] args)
	 { 
	 int i=10; int j;
	 
	 try    
	 {       
		 System.out.println("inside try block"); 
		 j=i/0;  //exception is thrown
	 }
	 
	 catch(ArithmeticException exp) 
	 { 
		 System.out.println("inside ArithmeticException catch block"); //or
		 // exp.printStackTrace();
	 } 
	 
	 try
	 { 
		 System.out.println("inside  NumberFormatException try block");
	 	 int k=Integer.parseInt("test");//will not get executed
	 } 
	 
	 catch(NumberFormatException exp) 
	 {
		 System.out.println("inside NumberFormatException catch block");
		 //exp.printStackTrace();
	 }
	 	System.out.println("i="+i);
	 } 
} 
