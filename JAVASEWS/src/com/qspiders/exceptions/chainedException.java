package com.qspiders.exceptions;

// When you want to catch an Exception and throw another exception , you can chain the first exception to the throwing exception.

public class chainedException {
	public static void print(){
		try{
			String[] str={"hello"};
			System.out.println(str[5]);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
//			System.out.println(aiob);
		throw new RuntimeException(aiob);
			//throw aiob;
		}
	
	}
	public static void main(String[] args) {
		try
		{
			print();
		}
	
		catch(RuntimeException r)
		{
			System.out.println(r.getClass());
			System.out.println(r.getCause());
		}
	}
}
