package com.qspiders.exceptions;

public class Demo5 {
	public static void main(String[] args)
	{
		int i=100;
		int j;
		
		try 
		{
			System.out.println("inside the try block");;
			j=i/010;
		}
		catch(NumberFormatException e)
		{
			//System.out.println("inside the inner catch block(NumberFormatException)");
			e.printStackTrace();
			
		System.out.println("Back to outer try block");
		//j=i/0;
		}
		catch(ArithmeticException exp)
		{
			//System.out.println("inside the outer catch block(ArithematicException)");
			exp.printStackTrace();
		}
		System.out.println("i="+i);
}	
}
