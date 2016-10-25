package InterviewQsandAs;

//WAP to create 2 Threads and 1 Thread should print odd number btwn another Thread should print even Number b/w 1-200?  

//		 1st Way:
	 class Thread10 extends Thread{
			 public void run(){
				 for(int i=1;i<=500;i+=2)
				 {
					 System.out.println(i);
				 }
			 }
	}
		 class Thread20 extends Thread
		 {
			 public void run()
			 {
				 for(int i=2;i<=500;i+=2)
				 {
					 System.out.println(i);
				 }
			 }
		 }
		 
//		 Create2threadswithinOddandEvenNobtwm1to200
		 public class Create2threadswithinOddandEvenNobtwm1to200 {
//		 class TwoThreads{
			 public static void main(String[] args) {
				Thread10 t1=new Thread10();
				t1.start();
				
				Thread20 t2=new Thread20();
				t2.start();
			}
		 }
  
		 //2nd Way:	
		 
		 public class Create2threadswithinOddandEvenNobtwm1to200{
			 public static void main(String[] args) {
				
			
			 Runnable r1=new Thread1();
			 Thread t1=new Thread(r1);
			 t1.start();
			 
			 Runnable r2=new Thread2();
			 Thread t2=new Thread(r2);
			 t2.start();
		 }
		}
		
		 class Thread1 implements Runnable
		 {
			 public void run()
			 {
				 for(int i=1;i<=500;i+=2)
				 {
					 System.out.println(i);
				 }
			 }
		 }
		 
		 class Thread2 implements Runnable
		 {
			 public void run()
			 {
				 for(int i=2;i<=500;i+=2)
				 {
					 System.out.println(i);
				 }
			 }
		 }

