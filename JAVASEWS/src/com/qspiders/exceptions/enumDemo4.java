package com.qspiders.exceptions;

	enum Payment3{
		
		CHEQUE(1000),CREDITCARD(1500),DEBITCARD(2000);
		
		private int minPaymt;

	    Payment3(int i)
		{
			minPaymt=i;
		}
				
		int getMinPaymt()
		{
			return minPaymt;
			
		}
	}

	public class enumDemo4 {
		public static void main(String[] args) {
	          Payment3 pmt;

	          pmt=Payment3.CREDITCARD;
	          System.out.println("Minimum payment for cheque is " + Payment3.CHEQUE.getMinPaymt());

	          System.out.println("Minimum payment for differen modes");
	          Payment3 pts[]=Payment3.values();

	for(Payment3 p : pts)
	{
		  System.out.println("For " + p + " is " + 
		  p.getMinPaymt());
	}
  }
}
	/*Note:
	1.enum cant inherit another class(all enumerations automatically inherit java.lang.Enum class)
	2.enum cannot be a superclass,i.e. enumeration cant be extended*/

