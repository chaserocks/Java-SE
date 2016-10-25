package com.qspiders.threads;

class MyNewThread implements Runnable {
	public void run()
	{ 
		for(int i=1;i<10;i++)			
           {
			 System.out.println("MyNewThread running " + i);
			}
		}
	}

public  class ThreadDemo1 
{
	public static void main(String[] args) 
	{
		MyNewThread nt=new MyNewThread(); 
		Thread t=new Thread(nt);
		t.start();
		}
}
