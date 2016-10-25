package com.qspiders.threads;


class ThreadB extends Thread {
	int total; 
	public void run()
	{
		synchronized (this) //current instance
		{
			 for(int i=0;i<=1000000000;i++) 
			 {
				 total+=i;
			 }
			 notify();
			 } 
		}
	}
public class NotifyDemo  
{
	public static void main(String[] args)
	{
		ThreadB b=new ThreadB();
		b.start(); 
		synchronized (b)
		{          
			System.out.println("Waiting for b to complete");
			try
			{
				b.wait(); 
             }
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("wait over");   
			}
		System.out.println("Total: " + b.total);    
		}
	}