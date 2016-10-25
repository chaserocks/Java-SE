package com.qspiders.pack1;

public class Mythread {
	

	    public static void main(String[] args) {
	        Runnable r1 = new EvenNumber();
	        Thread t1 = new Thread(r1);

	        Runnable r2 = new OddNumber();
	        Thread t2 = new Thread(r2);

	        t1.start();
	        t2.start();
	    }
	}

	class EvenNumber implements Runnable{
	    public void run(){
	        for(int i=0;i<50;i+=2) {
	                 System.out.println(i);
	        }
	    }
	}

	class OddNumber implements Runnable{
	    public void run(){
	        for(int i=1;i<=50;i+=2) {
	           System.out.println(i);
	        }
	    }
	}

