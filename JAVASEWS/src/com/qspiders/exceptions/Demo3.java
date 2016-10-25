package com.qspiders.exceptions;

public class Demo3
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		System.out.println(test());
		System.out.println("main ends");
	}
	
	
	static String test()
	{
		int i=10;
		int j;
		
	try
	{
		j=i/2;
		return "pass";
	}
	catch(ArithmeticException exp)
	{
		exp.printStackTrace();
		return "fail";
	}
	finally
	{
		System.out.println("Hello Hello nice fellow");
		return "PassFail";
	}
	
	
}
}

	
