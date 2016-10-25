package com.qspiders.exceptions;

enum Payment1 {
	
			CHEQUE,CREDITCARD,DEBITCARD
	
         	}
public class enumDemo2 {

	  public static void main(String[] args) {
	          Payment1 pmt;

	          pmt=Payment1.CREDITCARD;
	         // pmt=Payment1.DEBITCARD;
	         // pmt=Payment1.CHEQUE;
	          System.out.println("value of pmt: " + pmt);

	          pmt=Payment1.CHEQUE;
	          //pmt=Payment1.DEBITCARD;
	          //pmt=Payment1.CREDITCARD;

	          switch(pmt) {

	        case CHEQUE:
			System.out.println("Payment made by :" + pmt);
			break;
	
		     case CREDITCARD:
			System.out.println("Payment made by :" + pmt);
			break;
		 
	
		    case DEBITCARD:
			System.out.println("Payment made by :" + pmt);
	          }    
	     }
	}


