package com.qspiders.threads;
	
	class cboAccount 
	{ 
		private int balance=5000;
		public int getBalance()
		{
			return balance;
		}
		
	public void withdraw(int amount)
	{
		balance=balance - amount; 
	}
}
	//MultiThreadNoSynchronization
	public class JointAccountDemo implements Runnable
	{
		private cboAccount acct=new cboAccount();
		public static void main(String[] args)
		{           
			JointAccountDemo jAcct=new JointAccountDemo();
			Thread thread1= new Thread(jAcct);
			Thread thread2=new Thread(jAcct);
			thread1.setName("Jack");
			thread2.setName("Jill");
			thread1.start();
			thread2.start(); 
		}
		public void run()  
		{
			for(int i=0;i<5;i++)
			{
				withDrawCash(1000);
				if(acct.getBalance()< 0)
				{
					System.out.println("cash over drawn");
					}
				}
			}
		//use synchronized for thread safety
		//private synchronized void withDrawCash(int amt)
		
		private void withDrawCash(int amt) 
		{
			if(acct.getBalance()>=amt)
	           { 
				System.out.println(Thread.currentThread().getName()+ " will  withdraw");
				
				try 
				{
					Thread.sleep(500);
				}
				catch(InterruptedException ex)
				{
					
				} 
				acct.withdraw(amt);
				System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
				}
			else
			{
				System.out.println("Insufficient fund Mr/Ms"+ Thread.currentThread().getName()+ " balance "+ acct.getBalance());
				}
			}
		}

