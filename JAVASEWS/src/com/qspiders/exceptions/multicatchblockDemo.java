package com.qspiders.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

import sun.java2d.loops.ScaledBlit;

public class multicatchblockDemo {
	public static void main(String[] args) {
		String str=" ";
		Scanner input=new Scanner(System.in);
		try
		{
		
			input.nextLine();
		}
		catch(NoSuchElementException | IllegalArgumentException iaexp)
		{
			System.out.println("inside catch block(IllegalArumentException)");
		}
	
 }

}
