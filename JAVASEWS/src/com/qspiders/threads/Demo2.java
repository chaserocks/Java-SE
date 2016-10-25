package com.qspiders.threads;

//Limitation : You can’t extend anything else

public class Demo2 implements Runnable {

		public void run()    
		{         
			System.out.println("Thread running!");   
		} 
		public static void main(String[] args) { 
			Demo2 d=new Demo2();       
			Thread t1=new Thread(d);   
			t1.start();    
			} 
		}
