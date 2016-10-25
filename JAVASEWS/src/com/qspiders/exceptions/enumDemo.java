package com.qspiders.exceptions;
// byte int short | Byte, Short , Integer | char String Enum use only in switch and also in wrapper classes.
enum Payment // just like the interface type. It is a special class type which got fixed no.of values.
{
//	CASH,CHEQUE,CARD // these are like objects, 
	CASH(1000),CHEQUE(1500),CARD(2000);
	int minpayment;
	Payment (int minpayment)
	{
		this.minpayment=minpayment;
	}
	int getMinPayment()
	{
		return minpayment;
	}
}
public class enumDemo {
	public static void main(String[] args) {
		
		Payment pmt=Payment.CARD;
		System.out.println(pmt); //CARD
		
		pmt=Payment.CHEQUE;
		//pmt=Payment.CASH;
		//pmt=Payment.CARD;
		
		System.out.println(pmt.getMinPayment()); //1500
		
		switch(pmt)
		{
		case CARD:
			System.out.println("Paid by CARD");
			break;
		case CASH:
			System.out.println("Paid by CASH");
			break;
			
		case CHEQUE:
			System.out.println("Paid by CHEQUE"); //CHEQUE
			break;
		}
		
		System.out.println("++++++++++++++++");
		Payment[] pmts=Payment.values(); // set of values are used in Array.
		for(Payment p:pmts)
			
		{
			System.out.print(p+" ");
			System.out.println(p.getMinPayment());
		}
		
	}

}
