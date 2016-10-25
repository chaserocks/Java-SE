package com.qspiders.pack1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
// Single try block can have multiple catch blocks , if 2 exception class in catch block are sub class and super first more specific & then super class.


public class Demo114 {
	
	public static void main(String[] args) {
		// try with "" or "hundred" or "12.56"
		//String str="123";
		//String str=" ";
		//String str="12.56";
		String str="hundred";
		Scanner sc=new Scanner(str); // for importing: Shift+Ctrl+O Organisisng the imports ..
		int i=0;
		//sc.close();
		
		try{
		i=sc.nextInt();
		System.out.println(i);
		
	}
		catch(InputMismatchException e) // child exception should be first.
		{
			System.out.println("Input Element");
		}

		catch(IllegalStateException e)
		{
			System.out.println("Illegal State Exception");
		}
		catch(NoSuchElementException e) // is the parent class for the inputMismatch Exception. this should be later(2nd)
		{
			System.out.println("No Such Element");
		}  
		// or Alternate way: with the single try and catch block.
		
		//catch(NoSuchElementException | IllegalStateException e) // multi-catch catch block (can have many exception & they are not relevant to one another)
	/*	{
			System.out.println(e);
		}*/
		System.out.println("i="+i);
}
}
