package com.qspiders.exceptions;

import java.util.Scanner;

public class InvalidAgeexception extends RuntimeException{
	InvalidAgeexception(String str){
		System.out.println(str);
	}
}

public class Run {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Age");
			int age=sc.nextInt();
			try
			{
				if(age>=60 | age<=0)
				{
					//System.out.println("Invalid Age please enter age btw 1-60");
					throw new InvalidAgeexception("Invalid Age: Please enter age btw 1-59");
     			}
		     }
			catch(InvalidAgeexception iae)
			{
			
			}
			System.out.println("Age entered is " + age);
			System.out.println("main method ends");
	}
  }
