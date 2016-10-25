package com.qspiders.exceptions;

public class Demo7 {
	public static void main(String[] args)
	{
		System.out.println("main starts");
		System.out.println(test());
		System.out.println("main ends");
	}
	static String test(){
	int i=10;
	try 
	{
		System.out.println("inside the try block");
		int j=i/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("inside the catch block");
	}
	finally
	{
		System.out.println("inside finally block");
	}
	return "from outside";
}
}
