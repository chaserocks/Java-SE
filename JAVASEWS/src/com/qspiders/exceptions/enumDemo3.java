package com.qspiders.exceptions;

enum Payment2{
	
	CHEQUE,CREDITCARD,DEBITCARD
	
             }

public class enumDemo3 {
		
		public static void main(String[] args) {
	     
	      Payment2 pmt;

	          pmt=Payment2.CREDITCARD;
	          System.out.println("Printing all payment constants");
	          Payment2 pts[]=Payment2.values();

	          for(Payment2 p : pts)
	          {
		          System.out.println(p);
	          }
		}
	}
