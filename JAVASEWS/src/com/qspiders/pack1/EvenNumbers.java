package com.qspiders.pack1;
// print the alternate even numbers 
public class EvenNumbers {

	//List of EvenNumbers:

	 
	        public static void main(String[] args) {
	               
	                //define the limit
	                int limit = 100;
	               
	                System.out.println("Printing Even numbers between 1 and " + limit);
	 
	                boolean flag=true;
	                
	                for(int i=1; i <=limit; i++){
	                       
	                        //if the number is divisible by 2 then it is even
	                        if( i % 2 == 0)
	                        {
	                        	 if(flag)
	                                System.out.print(i);
	                        	 
	                        	 flag=!flag;
	                        }
	                      System.out.println();
	                }
	        }


}
