package com.qspiders.exceptions;

public class Demo6 {
	
		public static void main(String[] args)
		{
			int i=10;
			int j;
		
		try
		{
			System.out.println("inside the try block");
			//j=i/10; // when there is a no exception i.e where the execution is possible, then it will directly execute the finally block.
			j=i/0; // when ever the exception occurs as i/0 then it will go to the catch block.
			System.out.println("exiting the try block");
		}
		catch(ArithmeticException exp)
		{
			System.out.println("inside the catch block");
			
			// the other way of print :
			
			//exp.printStackTrace(); // java.lang.ArithmeticException: / by zero at com.qspiders.exceptions.Demo6.main(Demo6.java:14)

		}
		finally // to mandatorily execute block of code
		{
			System.out.println("Inside finally block");
		}
			System.out.println("i = "+i);
		
	}
}

		


