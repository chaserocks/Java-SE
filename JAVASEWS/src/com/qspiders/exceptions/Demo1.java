package com.qspiders.exceptions;

//exception:is any event that jvm dont even execute the statement.
public class Demo1 {
	public static void main(String[] args) {
		int i=10;
		int k=30;
		int j=0;
	//	j=i/0;// this is run time exception.(exception done in (jvm)runtime only)
		
		
		try
		{
			j=k/0;
		
		}
		catch(ArithmeticException e)
		{
			/*System.out.println(e);
			System.out.println("caught it");*/
			e.printStackTrace();
		}
		try
		{
			Integer.parseInt("hello");
		
		}
		catch(NumberFormatException e) // exception parameter.
		{
			System.out.println("in numberformat exception cathc block");
		}
		System.out.println(j);
		}
}
